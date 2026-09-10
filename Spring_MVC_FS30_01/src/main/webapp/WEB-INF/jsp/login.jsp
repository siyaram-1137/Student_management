<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Login</h1>
	
	<h1>${user }, Logged out</h1>
	
	<p style="color:red">${msg }</p>
	
	<form action="login" method="post">
	
		<input type="text" name="username" placeholder="Enter User Name">
		<input type="password" name="password" placeholder="Enter Password">
		<input type="submit" value="Login">
	
	</form>


</body>
</html>