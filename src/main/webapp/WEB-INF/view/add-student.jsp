<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="/student-management/myAppUrl/css/style-sheet.css">
	<link rel="stylesheet" type="text/css"
	href="/student-management/myAppUrl/css/add-students.css">
</head>
<body class="backg">
	<div align="center">
		<h1>Add Student</h1>

		<form:form action="save-student" modelAttribute="student"
			method="POST">

			<form:hidden path="id" />

			<label for="nm"> Name : </label>
			<form:input path="name" id="nm" />

			<br>

			<label for="mb"> Mobile : </label>
			<form:input path="mobile" id="mb" />

			<br>

			<label for="cn"> Country : </label>
			<form:input path="country" id="cn" />



			<br>

			<input type="submit" value="submit" class="btn btn-outline-dark">
			<!-- <input type="button" value="submit"> -->

		</form:form>

	</div>
</body>
</html>