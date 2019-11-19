package com.jervis.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {								//class for establishing connection with database


		 static Connection conn= null;  //connection object
		 public static Properties loadPropertiesFiles() throws IOException   //to  load data inside property file
		 {
			 Properties prop = new Properties();		// creating object of proper
			 InputStream in = new FileInputStream("C:\\Users\\Rinu Thomas\\eclipse-workspace\\Jervis\\resources\\jdbc.properties");
			 prop.load(in);						//loading file
			 in.close();
			return prop;					// return object
		 }
		 public Connection getConnection() throws Exception				// function to get connection
		 {
			 Properties prop = loadPropertiesFiles();					//calling method and assigning the return  object to prop
			 final String driver = prop.getProperty("driver");
			 final String url = prop.getProperty("url");
			 final String username = prop.getProperty("username");
			 final String password = prop.getProperty("password");
			Class.forName(driver);												//setting connection
			conn=DriverManager.getConnection(url, username, password);			//
			System.out.println("connected to database");
			return conn;
		 }
		 
	}


