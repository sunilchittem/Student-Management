<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="/student-management/myAppUrl/css/style-sheet.css">
</head>
<body>
	<h1 align="center">Student List</h1>
	<div align="left" class="container">

		<form action="/student-management/addStudent">

			<input type="submit" value="Add Student" class="btn btn-primary">

		</form>
		<br/>
		<form action="/student-management/find-student">
		<input type="text" name="findName">
		<button class="myButton">Search</button>
		
		</form>

		<br />


		<table border="1" class="table table-striped table-hover">
			<thead>
				<tr class="table-active">
					<td>ID</td>
					<td>Name</td>
					<td>Mobile</td>
					<td>Country</td>
				</tr>
			</thead>
			<c:forEach var="temp" items="${students}">
				<tr>
					<td>${temp.id}</td>
					<td>${temp.name}</td>
					<td>${temp.mobile}</td>
					<td>${temp.country}</td>
					<td><a
						href="/student-management/updateStudent?userId=${temp.id}">
							Update </a></td>
					<td><a
						href="/student-management/deleteStudent?userID=${temp.id}"
						onclick="if(!(confirm('do you really want to delete the student?'))) return false">
							Delete </a></td>
				</tr>
			</c:forEach>
		</table>
		<!-- <img alt="cap image" src="/student-management/myAppUrl/images/cap.png.jpg"> -->

	</div>
</body>
</html>