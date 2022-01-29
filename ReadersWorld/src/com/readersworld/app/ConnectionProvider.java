package com.readersworld.app;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	 static Connection con;
	
	
	
	public static Connection createConnection() {	
		
		try {
			//loading Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//creating connection
			String url="jdbc:mysql://localhost:3306/readers_world";
			String user="root";
			String pwd="rootpass";
			
			
			con = DriverManager.getConnection(url,user,pwd);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
		
	}
}
