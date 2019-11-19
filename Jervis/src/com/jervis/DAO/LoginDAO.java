package com.jervis.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jervis.BO.LoginBO;

public class LoginDAO {						//class for login
 private static String dname;				//private static variables for storing data fron database
private static String demail;
private static String dnumber;
	public static boolean validate(Connection connection, LoginBO lobo) throws SQLException { //method for validating which return status
		Statement st= connection.createStatement();
		ResultSet rs = st.executeQuery("select username,password,name,number,email from userdetails");		//getting data for checking
		boolean status = false;
		while(rs.next())
		{
			if((lobo.getLusername().equals(rs.getString("username")))&&(lobo.getLpassword().equals(rs.getString("password"))))
			{
				
				status= true; 								//if correct
																//saving values to private variable
				dname=rs.getString("name");
				dnumber=rs.getString("number");
				demail=rs.getString("email");
				break;
			}
			else											//if not correct
			{
																//clearing variables
				dname="";
				demail="";
				dnumber="";
				status= false;
			}
		}
		return status;											//return login status
	}

	public static   ArrayList<String> userDetails(String username) {		//saving data to arraylist
		ArrayList<String> arrli = new ArrayList<String>(4);
		arrli.add(dname);
		arrli.add(dnumber);
		arrli.add(demail);
		arrli.add(username);
		return arrli;														//returning array object
	}

}
