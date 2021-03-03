/*    */ package folder;
/*    */ 
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileReader;
/*    */ import java.io.FileWriter;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class AddPoint
/*    */ {
/*    */   public static void addPoint(int points) {
/*    */     try {
/* 12 */       FileReader fileReader = new FileReader("filename.txt");
/*    */       
/* 14 */       try { int ch = fileReader.read();
/* 15 */         String chString = "";
/* 16 */         while (ch != -1) {
/*    */           
/* 18 */           chString = chString + chString;
/* 19 */           ch = fileReader.read();
/*    */         } 
/* 21 */         fileReader.close();
/* 22 */         int outInt = Integer.parseInt(chString) + points;
/* 23 */         String out = String.valueOf(outInt);
/* 24 */         System.out.println(out); try {
/* 25 */           FileWriter fileWriter = new FileWriter("filename.txt");
/*    */           
/* 27 */           try { fileWriter.write(out);
/* 28 */             fileWriter.close();
/* 29 */             fileWriter.close(); } catch (Throwable throwable) { try { fileWriter.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; } 
/* 30 */         } catch (IOException iOException) {}
/*    */ 
/*    */         
/* 33 */         fileReader.close(); } catch (Throwable throwable) { try { fileReader.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; } 
/* 34 */     } catch (FileNotFoundException fileNotFoundException) {
/*    */ 
/*    */     
/* 37 */     } catch (IOException iOException) {}
/*    */   }
/*    */ }


/* Location:              D:\output3\dist\SCS3.jar!\folder\AddPoint.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */