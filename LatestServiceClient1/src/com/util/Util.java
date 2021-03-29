package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
	
	public static Connection getConnection() throws Exception {
		Connection dbConn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbConn = DriverManager.getConnection(url, "root", "password");
			System.out.println("I came to db 1");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return dbConn;
	}
}
