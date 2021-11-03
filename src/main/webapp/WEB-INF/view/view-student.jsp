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

<div align="center">
<h3 style="color: blue;"> Student Result </h3>
<br/>

<table border="1" class="table">
			<thead class="table-dark">
				<tr class="table-active">
					<td>ID</td>
					<td>Name</td>
					<td>Mobile</td>
					<td>Country</td>
				</tr>
			</thead>
			<tr>
  <td>  ${students.id} </td>

 <td> ${students.name} </td>

<td> ${students.mobile} </td>

 <td> ${students.country} </td>
</tr>
</table>

<form action="/student-management/showstudents">

<input type="submit" value="Back" class="btn btn-primary">
</form>
</div>
</body>
</html>