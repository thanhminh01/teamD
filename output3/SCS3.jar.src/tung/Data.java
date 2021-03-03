/*     */ package tung;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URISyntaxException;
/*     */ import java.net.URL;
/*     */ import java.text.DateFormat;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.TimeZone;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.json.JSONArray;
/*     */ import org.json.JSONException;
/*     */ import org.json.JSONObject;
/*     */ 
/*     */ 
/*     */ public class Data
/*     */ {
/*     */   public static void isUrlValid(String url) {
/*     */     
/*  24 */     try { URL obj = new URL(url);
/*  25 */       obj.toURI(); }
/*     */     
/*  27 */     catch (MalformedURLException malformedURLException) {  }
/*  28 */     catch (URISyntaxException uRISyntaxException) {}
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStrData(@NotNull String string) {
/*  34 */     String JSONStr = "";
/*  35 */     String url1 = "https://rki.marlon-lueckert.de/api/general";
/*  36 */     String url2 = "https://rki.marlon-lueckert.de/api/states";
/*  37 */     String url3 = "https://rki.marlon-lueckert.de/api/districts";
/*  38 */     isUrlValid(url1);
/*  39 */     isUrlValid(url2);
/*  40 */     isUrlValid(url3);
/*     */     
/*     */     try {
/*  43 */       URL general = new URL("https://rki.marlon-lueckert.de/api/general\n");
/*  44 */       URL states = new URL("https://rki.marlon-lueckert.de/api/states\n");
/*  45 */       URL districts = new URL("https://rki.marlon-lueckert.de/api/districts\n");
/*  46 */       switch (string) {
/*     */         case "general":
/*     */           try {
/*  49 */             BufferedReader br = new BufferedReader(new InputStreamReader(general.openStream()));
/*  50 */             JSONStr = br.readLine();
/*  51 */             if (JSONStr != null) {
/*  52 */               System.out.println(JSONStr);
/*     */             }
/*  54 */           } catch (IOException e) {
/*  55 */             e.printStackTrace();
/*     */           } 
/*     */           break;
/*     */         case "states":
/*     */           try {
/*  60 */             BufferedReader br = new BufferedReader(new InputStreamReader(states.openStream()));
/*  61 */             JSONStr = br.readLine();
/*  62 */             if (JSONStr != null) {
/*  63 */               System.out.println(JSONStr);
/*     */             }
/*  65 */           } catch (IOException e) {
/*  66 */             e.printStackTrace();
/*     */           } 
/*     */           break;
/*     */         case "districts":
/*     */           try {
/*  71 */             BufferedReader br = new BufferedReader(new InputStreamReader(districts.openStream()));
/*  72 */             JSONStr = br.readLine();
/*  73 */             if (JSONStr != null) {
/*  74 */               System.out.println(JSONStr);
/*     */             }
/*  76 */           } catch (IOException e) {
/*  77 */             e.printStackTrace();
/*     */           } 
/*     */           break;
/*     */       } 
/*     */     
/*  82 */     } catch (MalformedURLException malformedURLException) {}
/*     */ 
/*     */ 
/*     */     
/*  86 */     return JSONStr;
/*     */   }
/*     */   
/*     */   public JSONObject parseStrToJSON(String string) {
/*  90 */     String JSONStr = getStrData(string);
/*  91 */     JSONObject json = null;
/*     */     try {
/*  93 */       json = new JSONObject(JSONStr);
/*  94 */     } catch (JSONException e) {
/*  95 */       e.printStackTrace();
/*     */     } 
/*  97 */     return json;
/*     */   }
/*     */   
/*     */   public String convertEpochTime(long epoch) {
/* 101 */     Date date = new Date(epoch);
/* 102 */     DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
/* 103 */     format.setTimeZone(TimeZone.getTimeZone("Berlin"));
/* 104 */     return format.format(date);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String displayGeneralStats() {
/* 110 */     JSONObject json = parseStrToJSON("general");
/* 111 */     JSONObject dailyChange = json.getJSONObject("difference");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 118 */     String info = "Last update: " + json.getString("lastUpdate") + "\nTotal cases: " + json.getInt("cases") + "\nTotal cases in the last 7 days: " + json.getInt("casesPerWeek") + "\nCases per 100K population: " + json.getFloat("casesPer100k") + "\nCases in the last 7 days/100K population: " + json.getFloat("weekIncidence") + "\nRecovered: " + json.getInt("recovered") + "\nDeaths: " + json.getInt("deaths") + "\n";
/*     */     
/*     */     try {
/* 121 */       info = info + "New cases in yesterday: " + info + "\nNew deaths in yesterday: " + dailyChange.getInt("cases") + "\nNew recovered cases in yesterday: " + dailyChange.getInt("deaths") + "\n";
/* 122 */     } catch (JSONException jSONException) {}
/*     */ 
/*     */     
/* 125 */     return info;
/*     */   }
/*     */   
/*     */   public String displayStatesStats(String searchName) {
/* 129 */     JSONObject json = parseStrToJSON("states");
/* 130 */     String dateTime = convertEpochTime(json.getLong("lastUpdate"));
/*     */     
/* 132 */     JSONArray dataArray = json.getJSONArray("states");
/* 133 */     String info1 = "";
/* 134 */     for (int i = 0; i < dataArray.length(); i++) {
/*     */       
/* 136 */       JSONObject obj = dataArray.getJSONObject(i);
/* 137 */       String name = obj.getString("name");
/* 138 */       if (name.equalsIgnoreCase(searchName)) {
/*     */         
/*     */         try {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 145 */           info1 = info1 + "Last update: " + info1 + "\nState: " + dateTime + "\nTotal cases: " + name + "\nNew cases in this week per 100K population: " + obj.getInt("count") + "\nDeaths: " + obj.getInt("weekIncidence") + "\nCases per 100K population: " + obj.getInt("deaths");
/* 146 */         } catch (JSONException jSONException) {}
/*     */       }
/*     */     } 
/*     */     
/* 150 */     String info = info1;
/* 151 */     return info;
/*     */   }
/*     */   
/*     */   public String displayDistrictsStats(String searchName) {
/* 155 */     JSONObject json = parseStrToJSON("districts");
/* 156 */     String dateTime = json.getString("lastUpdate");
/*     */     
/* 158 */     JSONArray dataArray = json.getJSONArray("districts");
/* 159 */     String info1 = "";
/* 160 */     for (int i = 0; i < dataArray.length(); i++) {
/*     */       
/* 162 */       JSONObject obj = dataArray.getJSONObject(i);
/* 163 */       String name = obj.getString("name");
/* 164 */       if (name.equalsIgnoreCase(searchName))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 172 */         info1 = "Last update: " + json.getString("lastUpdate") + "\nState: " + name + "\nTotal cases: " + obj.getInt("count") + "\nNew cases in this week per 100K population: " + obj.getInt("weekIncidence") + "\nDeaths: " + obj.getInt("deaths") + "\nCases per 100K population: " + obj.getInt("casesPer100k") + "\nCases per population: " + obj.getFloat("casesPerPopulation");
/*     */       }
/*     */     } 
/* 175 */     String info = info1;
/* 176 */     return info; } public Object[] getNames(String string) {
/*     */     JSONObject json;
/*     */     JSONArray dataArray;
/*     */     int i;
/* 180 */     ArrayList<String> info1 = new ArrayList<>();
/* 181 */     switch (string) {
/*     */       case "states":
/* 183 */         json = parseStrToJSON("states");
/* 184 */         dataArray = json.getJSONArray("states");
/*     */         
/* 186 */         for (i = 0; i < dataArray.length(); i++) {
/*     */           
/* 188 */           JSONObject obj = dataArray.getJSONObject(i);
/* 189 */           String name = obj.getString("name");
/* 190 */           info1.add(name);
/*     */         } 
/*     */         break;
/*     */       
/*     */       case "districts":
/* 195 */         json = parseStrToJSON("districts");
/* 196 */         dataArray = json.getJSONArray("districts");
/* 197 */         for (i = 0; i < dataArray.length(); i++) {
/*     */           
/* 199 */           JSONObject obj = dataArray.getJSONObject(i);
/* 200 */           String name = obj.getString("name");
/* 201 */           info1.add(name);
/*     */         } 
/*     */         break;
/*     */     } 
/* 205 */     return info1.toArray();
/*     */   }
/*     */ }


/* Location:              D:\output3\dist\SCS3.jar!\tung\Data.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */