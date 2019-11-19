package com.jervis.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jervis.BO.RegisterBO;
import com.jervis.DAO.RegisterDAO;
import com.jervis.util.ConnectionManager;

public class RegisterServlet extends HttpServlet {				//RegisterServlet to control the registration process
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RegisterBO regbo = new RegisterBO();				// object of RegisterBO class to store values to insert to database
		ConnectionManager co = new ConnectionManager();		// object of ConnectionManager class to pass connection to RegisterDAO class  
		boolean status=false;								// boolean variable to check the status of registration
		regbo.setName(request.getParameter("name"));		// getting data from register page and saving to RegisterBO
		regbo.setNumber(request.getParameter("number"));
		regbo.setEmail(request.getParameter("email"));
		regbo.setUserame(request.getParameter("username"));
		regbo.setPassword(request.getParameter("password"));
		regbo.setCompassword(request.getParameter("compassword"));
		
		try {
			status=RegisterDAO.save(co.getConnection(),regbo);		//calling RegisterDAO to  inseart values to database and to check status
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status==true)
			response.sendRedirect("/Jervis/index.jsp");				//page redirect to login page if registration was successful
		else
			response.sendRedirect("/Jervis/register.jsp");      	//show register page for unsuccessful registration
	}

}
