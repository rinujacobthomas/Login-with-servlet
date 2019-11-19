<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <form class="" action="/Jervis/LoginServlet" method="post"><!--starting of form-->
     
<!--align center-->
        <h1>Login Form</h1><!--heading-->
        <table ><!--starting of table-->
          <tr><!--first row starting-->
            <td align="right">Username :</td><!--first coloumn-->
            <td><input type="text" name="loginusername" placeholder="Enter Username" required ="required"/></td><!--textbox for username-->
          </tr>			<!--ending of first row-->
          <tr>
            <td align="right">Password :</td>
            <td><input type="text" name="loginpassword" placeholder="Enter Password" required ="required"/></td>
          </tr>
        </table>		<!--ending of table-->
        <br>
        <input type="submit" value=" Login" >	<!--submit button-->
      
   

    </form>
      <a href="register.jsp">New Member &#63;</a>	<!--link to Registration page-->
</body>
</html>