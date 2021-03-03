/*    */ package folder;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class CreateFile {
/*    */   public static void newFile() {
/*    */     try {
/*  9 */       File myObj = new File("filename.txt");
/* 10 */       if (myObj.createNewFile()) {
/* 11 */         System.out.println("File created: " + myObj.getName());
/*    */       } else {
/* 13 */         System.out.println("File already exists.");
/*    */       } 
/* 15 */     } catch (IOException e) {
/* 16 */       System.out.println("An error occurred.");
/* 17 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\output3\dist\SCS3.jar!\folder\CreateFile.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */