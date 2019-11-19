<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>													<!--to display the details of the user-->
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>															<!--body start-->													
<%
List details = (List)request.getAttribute("alist");			// list to get the details from servlet
%>
<h1>Welcome<%=" "+details.get(0) %></h1>					<!--to display values in page-->
<h3>Username :<%=" "+details.get(3) %></h3>
<h3>Phonenumber :<%=" "+details.get(1) %></h3>
<h3>Email id :<%=" "+details.get(2) %></h3>

</body>																<!--body ending-->
</html>