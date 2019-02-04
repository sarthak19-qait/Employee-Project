package employee;

import java.sql.*;

public class Driver {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://10.0.21.62/employee";
	
//  Database credentials
   static final String USER = "root";
   static final String PASS = "52Shivam@";
    private Connection con;
   
   public Driver() throws ClassNotFoundException, SQLException
   {
	   Class.forName(JDBC_DRIVER);
	   con = DriverManager.getConnection(DB_URL, USER, PASS);
	   System.out.println("Connection Established...");
   }
   
   public Connection getDatabaseConnection() {
	   return con;
   }
   public void close(){
       try {
           con.close();
       } catch (SQLException e) {
           e.printStackTrace();
	       
       }

   }
   
}
