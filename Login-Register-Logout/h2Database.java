package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.h2.tools.DeleteDbFiles;

public class h2Database {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test1;IFEXISTS=TRUE";

    //  Database credentials
    static final String USER = "admin";
    static final String PASS = "administrator";

    public static void createTable(){
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //DeleteDbFiles.execute(DB_URL, JDBC_DRIVER, true);

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);


            //STEP 3: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();
            String sql =  "CREATE TABLE IF NOT EXISTS  REGISTRATION " +
                    " ( username VARCHAR(255), " +
                    " password VARCHAR(255), " +
                    " anything VARCHAR(255), " +
                    " PRIMARY KEY ( username ))";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        } catch(SQLException se) {      //Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {          //Handle errors for Class.forName
            e.printStackTrace();
        } finally {                     //finally block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } //end finally try
        } //end tr
        System.out.println("Finished creating table");
    }
}