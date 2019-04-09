<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User sign up form</title>
</head>
<body>
	<div align ="center">
		<h1>User sign up form</h1>
		<form action="create_user" method = "post" onsubmit = "return validateFormInput">
			<table>
				<tr>
					<td>Full name:</td>
					<td><input type = "text" name = "fullname" id ="fullname" size="20"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type = "text" name = "email" id ="email" size="20"></td>
				</tr>
				<tr>
					<td>Username:</td>
					<td><input type = "username" name = "username" id ="username" size="20"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type = "password" name = "password" id ="password" size="20"></td>
				</tr>
				<tr>
					<td colspan = "2" align = "right">
						<button type = "submit">Submit</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
<script type ="text/javascript">
	function validateFormInput(){
		var fieldEmail = document.getElementById("email");
		var fieldPassword = document.getElementById("password");
		var fieldFullName = document.getElementById("fullname");
		if (fieldEmail.value.length == 0){
			alert("Email is required");
			fielEmail.focus();
			return false;
			}
		if (fieldPassword.value.length == 0){
			alert("Password is required");
			fielPassword.focus();
			return false;
			}
		if (fieldFullName.value.length == 0){
			alert("FullName is required");
			fielFullName.focus();
			return false;
			}
		return true;
		}
</script>
</body>
</html>