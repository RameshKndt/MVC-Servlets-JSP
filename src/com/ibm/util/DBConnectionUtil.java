package com.ibm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnectionUtil {
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	private static final String USERNAME = "IBM_FEB_2022";
	
	private static final String PASSWORD = "IBM_FEB_2022";
	
	private static Connection connection = null;
	
	public static Connection openConnection() {
		if (connection != null)
            return connection;
        else {
            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } 
            return connection;
        }
	}
	
	
}
