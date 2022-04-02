package com.borrowlib.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	//defining credentials
	private static final String UNAME = "root";
	private static final String PASSWORD = "root1234";
	private static final String CONN_STRING = "jdbc:mysql://localhost/elib";
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(CONN_STRING, UNAME, PASSWORD);
			//For debugging purpose
			System.out.println("Connected!");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
		}

}
