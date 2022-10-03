package com.bms.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	private static final String DATABASE = "";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "";
	private static final String PORT = "3306";
	private static final String HOST_NAME = "localhost";
	
	
	public static Connection createConnection() throws SQLException {
		//jdbc:maridb://localhost:3306/
		Connection conn = DriverManager.getConnection
										(
											"jdbc:maridb://" + 
											HOST_NAME + ":" + 
											PORT + "/" + 
											DATABASE, 
										USER_NAME, PASSWORD
									);
		
		return conn;
										
	}
}
