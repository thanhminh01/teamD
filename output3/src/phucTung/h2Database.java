/*    */ package phucTung;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import java.sql.SQLException;
/*    */ import java.sql.Statement;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class h2Database
/*    */ {
/*    */   static final String JDBC_DRIVER = "org.h2.Driver";
/*    */   static final String DB_URL = "jdbc:h2:~/test1;";
/*    */   static final String USER = "admin";
/*    */   static final String PASS = "administrator";
/*    */   
/*    */   public static void createTable() {
/* 18 */     Connection conn = null;
/* 19 */     Statement stmt = null;
/*    */     
/*    */     try {
/* 22 */       Class.forName("org.h2.Driver");
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 27 */       System.out.println("Connecting to database...");
/* 28 */       conn = DriverManager.getConnection("jdbc:h2:~/test1;", "admin", "administrator");
/*    */ 
/*    */ 
/*    */       
/* 32 */       System.out.println("Creating table in given database...");
/* 33 */       stmt = conn.createStatement();
/* 34 */       String sql = "CREATE TABLE IF NOT EXISTS  REGISTRATION  ( username VARCHAR(255),  password VARCHAR(255),  placeholder1 VARCHAR(255),  placeholder2 VARCHAR(255),  PRIMARY KEY ( username ))";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 41 */       stmt.executeUpdate(sql);
/* 42 */       System.out.println("Created table in given database...");
/*    */ 
/*    */       
/* 45 */       stmt.close();
/* 46 */       conn.close();
/* 47 */     } catch (SQLException se) {
/* 48 */       se.printStackTrace();
/* 49 */     } catch (Exception e) {
/* 50 */       e.printStackTrace();
/*    */     } finally {
/*    */       try {
/* 53 */         if (stmt != null) stmt.close(); 
/* 54 */       } catch (SQLException sQLException) {}
/*    */       
/*    */       try {
/* 57 */         if (conn != null) conn.close(); 
/* 58 */       } catch (SQLException se) {
/* 59 */         se.printStackTrace();
/*    */       } 
/*    */     } 
/* 62 */     System.out.println("Finished creating table");
/*    */   }
/*    */ }


/* Location:              D:\output3\dist\SCS3.jar!\phucTung\h2Database.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */