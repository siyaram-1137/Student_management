<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Get Student</h1>
	
	
	
	<form action="getStudent" method="post">
		<input type="text" name="id" placeholder="Enter Id">
		<input type="submit" value="Get">
	</form>
	
	<h1>Id : ${ std.id}</h1>
	<h1>Name : ${ std.name}</h1>
	<h1>Mobile : ${ std.mobile}</h1>
	<%-- <h1>Location : ${ std.address}</h1> --%>


</body>
</html>