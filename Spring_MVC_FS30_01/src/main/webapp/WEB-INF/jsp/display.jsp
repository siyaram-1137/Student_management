<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<!DOCTYPE html>
	<html>
	 <head>
	   <meta charset="UTF-8">
	   <title>Student List</title>
	   
	   <style type="text/css">
	   
	   	table,td,th{
	   		border: 2px solid #000;
	   		border-collapse: collapse;
	   		padding: 10px
	   	}
	   
	   </style>
	   
	 </head>
	<body>
	
	 <h1>Students Data</h1>
	
	 <table>
	    <tr>
	        <th>Id</th>
	        <th>Name</th>
	        <th>Mobile</th>
	        <th>Address</th>
	    </tr>
	
	    <c:forEach var="std" items="${stdList}">
	        <tr>
	            <td>${std.id}</td>
	            <td>${std.name}</td>
	            <td>${std.mobile}</td>
	            <td>${std.address}</td>
	        </tr>
	    </c:forEach>
	
	 </table>
	
	</body>
	</html>