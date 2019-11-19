package com.jervis.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jervis.BO.LoginBO;
import com.jervis.DAO.LoginDAO;
import com.jervis.util.ConnectionManager;
public class LoginServlet extends HttpServlet  				//Servlet for login
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		boolean status=false;				//Initializing value of status
		LoginBO lobo = new LoginBO();		//object of LoginBO to get username & password inserted  
		ConnectionManager col= new ConnectionManager();			//connection object
		String username=request.getParameter("loginusername");		// Variable for saving username
		lobo.setLusername(username);						//setting username to LoginBBO object
		lobo.setLpassword(request.getParameter("loginpassword"));		//setting password to LoginBBO object
		try {
			status=LoginDAO.validate(col.getConnection(),lobo);			//checking status in LOginDAO
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	
		if(status==true)					//if correct
		{
			ArrayList<String> arli =LoginDAO.userDetails(username);
			System.out.println(arli.get(1));		//getting and saving data of that user to arraylist
			request.setAttribute("alist",arli);		//setting arraylist as an attribute of request object
			RequestDispatcher dispatcher = request.getRequestDispatcher("/welcome.jsp");	// calling page to display userdata
			if(dispatcher != null){
				dispatcher.forward(request, response);					//forwarding objects which contain userdata
			}
		}
		else								//if not correct
		{
		 System.out.println("check password");	
		}
	}

}
