package com.bms.model;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	private static final String DATABASE = "batch_4";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "";
	private static final String PORT = "3306";
	private static final String HOST_NAME = "localhost";
	
	
	public static Connection createConnection() throws SQLException {
		//jdbc:maridb://localhost:3306/
		Connection conn = DriverManager.getConnection
										(
											"jdbc:mariadb://" + 
											HOST_NAME + ":" + 
											PORT + "/" + 
											DATABASE, 
										USER_NAME, PASSWORD
									);
		
		return conn;
										
	}
	
//	public static void main(String[] args) throws SQLException {
//		createConnection();
//		System.out.println("Get connection..");
//	}
}
