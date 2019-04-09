<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
</head>
<body>
	<jsp:directive.include file="/frontend/header.jsp" />
	
	<div align ="center">
		<h1>This is the hompage</h1>
		<a href = "login.jsp">Log in</a>
		<a href = "user_form.jsp">Sign up</a>
		<a href = "edit_user">Edit</a>
	</div>
</body>
</html>