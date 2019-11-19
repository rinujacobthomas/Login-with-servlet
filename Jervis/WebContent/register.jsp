<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	  <center><!--to align center-->
      <form class="" action="RegisterServlet" method="post"> 	<!--move to registerServlet.java-->
        <br><br><br><br><!--spacing-->
        <h1>Registration Form</h1><!--heading-->
        <table height ="250" cellpading="1"><!--starting of table-->
          <tr>
            <td align="right">Name :</td><!--name-->
            <td><input type="text" name="name" required ="required"></td><!--text field for first name-->
          </tr>
          <tr>
            <td align="right"> Mobile No :</td>		<!--field for mobile number-->
            <td><input type="text" name="number" required ="required"></td>
          </tr>
          <tr>
            <td align="right">Email :</td>		<!--field for  email-->
            <td><input type="text" name="email" required ="required"></td>
          </tr>
          <tr>
            <td align="right">Username :</td>
            <td><input type="text" name="username" required ="required"></td>
          </tr>
          <tr>
            <td align="right">Password :</td>
            <td><input type="password" name="password" required ="required"></td>
          </tr>
          <tr>
            <td align="right">Confirm Password :</td>
            <td><input type="password" name="compassword" required ="required"></td>
          </tr>
        </table><!--end of table-->
       
        <p><input type="submit" onclick="window.location.href='index.jsp'" value="Register" style= "background-color:#009933;width:100px;height :40px">&nbsp;&nbsp<a href="index.jsp">Already Member?</a></p><!--Register button and back to home -->
      </form>		<!--ending of form-->
    </center>
</body>
</html>