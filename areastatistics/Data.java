package com.company;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Data {
    private final URL general = new URL("https://rki.marlon-lueckert.de/api/general\n");
    private final URL states = new URL("https://rki.marlon-lueckert.de/api/states\n");
    private final URL districts = new URL("https://rki.marlon-lueckert.de/api/districts\n");

    public String getStrData(@NotNull String string) throws Exception {
        String JSONStr = "";
        switch (string) {
            case "general":
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(general.openStream()));
                    JSONStr = br.readLine();
                    if (JSONStr != null) {
                        System.out.println(JSONStr);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "states":
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(states.openStream()));
                    JSONStr = br.readLine();
                    if (JSONStr != null) {
                        System.out.println(JSONStr);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "districts":
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(districts.openStream()));
                    JSONStr = br.readLine();
                    if (JSONStr != null) {
                        System.out.println(JSONStr);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                throw new Exception("Please input valid region type: general, states or districts");
        }
        return JSONStr;
    }

    public JSONObject parseStrToJSON(String string) throws Exception {
        String JSONStr = getStrData(string);
        JSONObject json = null;
        try {
            json = new JSONObject(JSONStr);
        }catch (JSONException e) {
            e.printStackTrace();
        }
        return json;
    }

    public String convertEpochTime(long epoch){
        Date date = new Date(epoch);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("Berlin"));
        return format.format(date);
    }

    public void findInformation(String searchName, String string) throws Exception {
        JSONObject json = parseStrToJSON(string);
        JSONArray dataArray;

        switch (string) {
            case "states":
                dataArray = json.getJSONArray("states");
                String dateTime = convertEpochTime(json.getLong("lastUpdate"));
                for (int i = 0; i < dataArray.length(); i++) {
                    JSONObject obj = dataArray.getJSONObject(i);
                    String name = obj.getString("name");
                    if (name.equalsIgnoreCase(searchName)) {
                        System.out.println("Last update: " + dateTime);
                        System.out.println("State: " + name);
                        System.out.println("Total cases: " + obj.getInt("count"));
                        System.out.println("New cases in this week per 100K population: " + obj.getInt("weekIncidence"));
                        System.out.println("Deaths: " + obj.getInt("deaths"));
                        System.out.println("Cases per 100K population: " + obj.getInt("casesPer100k"));
                    }
                }
                break;
            case "districts":
                dataArray = json.getJSONArray("districts");
                for (int i = 0; i < dataArray.length(); i++) {
                    JSONObject obj = dataArray.getJSONObject(i);
                    String name = obj.getString("name");
                    if (name.equalsIgnoreCase(searchName)){
                        System.out.println("Last update: " + json.getString("lastUpdate"));
                        System.out.println("District: " + name);
                        System.out.println("Total cases: " + obj.getInt("count"));
                        System.out.println("New cases in this week per 100K population: " + obj.getInt("weekIncidence"));
                        System.out.println("Deaths: " + obj.getInt("deaths"));
                        System.out.println("Cases per 100K population: " + obj.getInt("casesPer100k"));
                        System.out.println("Cases per population: " + obj.getFloat("casesPerPopulation"));
                    }
                }
                break;
            case "general":
                JSONObject dailyChange = json.getJSONObject("difference");
                System.out.println("Last update: " + json.getString("lastUpdate"));
                System.out.println("Total cases: " + json.getInt("cases"));
                System.out.println("Total cases in the last 7 days: " + json.getInt("casesPerWeek"));
                System.out.println("Cases per 100K population: " + json.getFloat("casesPer100k"));
                System.out.println("Cases in the last 7 days/100K population: " + json.getFloat("weekIncidence"));
                System.out.println("Recovered: " + json.getInt("recovered"));
                System.out.println("Deaths: " + json.getInt("deaths"));
                System.out.println("New cases in yesterday: " + dailyChange.getInt("cases"));
                System.out.println("New deaths in yesterday: " + dailyChange.getInt("deaths"));
                System.out.println("New recovered cases in yesterday: " + dailyChange.getInt("recovered"));
                break;
        }
    }

    public Data() throws MalformedURLException {
    }
}
