package com.jervis.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jervis.BO.RegisterBO;

public class RegisterDAO {										//class for registration
public static  boolean save(Connection connect, RegisterBO regbo) throws SQLException {		//entering user information to database
	
	Statement st= connect.createStatement();
int rs=	st.executeUpdate("insert into userdetails values('"+regbo.getName()+"','"+regbo.getNumber()+"','"+regbo.getEmail()+"','"+regbo.getUserame()+"','"+regbo.getPassword()+"')");
if(rs==1) {
	return true;    //returning status as true
}
else
	return false;		//returning status as false
}
}
