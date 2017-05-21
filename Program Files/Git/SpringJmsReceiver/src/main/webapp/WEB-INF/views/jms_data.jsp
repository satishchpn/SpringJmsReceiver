<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Jms Reciver</title>
</head>
<body>
	<div>
		<center>
			<h1>Jms Data</h1>
		</center>
	</div>
	<table align="center">
		<tr>
			<th>Name</th>
			<th>Address</th>
			<th>Message</th>
		</tr>
		<c:forEach items="${greetings}" var="greetings">
			<tr>
				<td>${greetings.name}</td>
				<td>${greetings.address}</td>
				<td>${greetings.message}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>