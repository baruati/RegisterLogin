<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<style>   
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink;  
}  
button {   
       background-color: #4CAF50;   
       width: 100%;  
        color: orange;   
        padding: 15px;   
        margin: 10px 0px;   
        border: none;   
        cursor: pointer;   
         }   
 form {   
        border: 3px solid #f1f1f1;   
    }   
 input[type=text], input[type=password] {   
        width: 100%;   
        margin: 8px 0;  
        padding: 12px 20px;   
        display: inline-block;   
        border: 2px solid green;   
        box-sizing: border-box;   
    }  
 
     
 .container {   
        padding: 25px;   
        background-color: lightblue;  
    }   
</style>   
</head>
<body>



	<div align="center" class="container">
		<h1>Employee Register Form</h1>
		<form action="Register" method="post">
			<table style="with: 80%">
				<tr>
					<td>Employee Id</td>
					<td><input type="text" name="empId" /></td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="empName" /></td>
				</tr>
				<tr>
					<td>Employee Email</td>
					<td><input type="text" name="empEmail" /></td>
				</tr>

			</table>

			<a href="index.jsp">Already registered? </a> <input type="submit"
				value="Register" />

		</form>
	</div>
</body>
</html>