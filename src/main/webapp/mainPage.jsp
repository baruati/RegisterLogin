<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Home </title>
<link type="text/css" rel="stylesheet" href="css/style.css" >
</head>
<body>
	<h2 style="text-align:center;"> Login Successful </h2>
	
	<div class="container" align="center">
	<form action="ViewAllUsers" method="get" class="main-page-form">
	<table>
	<tr>
		<td><input type="submit" value="View" class="center-button"></td>
	</tr>
		</table>
	</form>
	
	<form action="Logout" method="post" class="main-page-form">
	<table>
	<tr>
		<td><input type="submit" value="Logout" class="logout-button"></td>
		</tr>
		</table>
	</form>
	</div>
	
</body>
</html>