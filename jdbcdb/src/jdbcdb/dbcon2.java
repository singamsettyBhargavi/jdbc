package jdbcdb;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbcon2 {
	
	static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	static String DB_URL = "jdbc:mysql://localhost:3306/db";
	static  String DB_USERNAME = "root";
	static String DB_PASSWORD = "bhargavi2326";
	
	public static Connection getCon()throws Exception
	{
	 Class.forName(DB_DRIVER);
	 Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
	 
	 if(con != null)
	 {
		 System.out.println("done");
	 }else
	 {
		 System.out.println("not done");
	 }
	 
	 return con;
	}
	
	
	
}
