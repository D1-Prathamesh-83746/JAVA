package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private final static String URL="jdbc:mysql://localhost:3306/dac_db";
	private final static String USERNAME="lawand";
	private final static String PASSWORD="Lawand@8606";
	
	public static Connection getconnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}
