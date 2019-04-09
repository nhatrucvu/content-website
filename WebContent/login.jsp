<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User log in</title>
</head>
<body>
	<div align ="center">
		<h1>User login</h1>
		<form id = "formLogin" action="login" method = "post">
			<table>
				<tr>
					<td>Email:</td>
					<td><input type = "text" name = "email" id ="email" size="20"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type = "password" name = "password" id ="password" size="20"></td>
				</tr>
				<tr>
					<td colspan = "2" align = "right">
						<button type = "submit">Login</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
<script type ="text/javascript">

	$(document).ready(function(){
		$("#loginForm").validate({
			rules: {
				email:{
					required: true,
					email: true
					},
			message:{
				email:{
					required:"Please enter email",
					email:"Please enter an valid email address"
					},
				password:"Please enter password"
			}
		}
	});
</script>
</body>
</html>