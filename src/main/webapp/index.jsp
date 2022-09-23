<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
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
 button:hover {   
        opacity: 0.7;   
    }   i
        
     
 .container {   
        padding: 25px;   
        background-color: lightblue;  
    }   
</style>   
</head>
<body>



	<div align="center" class="container">
		<h1>Employee Log in Page</h1>
		<form action="Login" method="post">
			<table style="with: 80%">
				<tr>
					<td>Employee Id</td>
					<td><input type="text" name="empId" /></td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="empName" /></td>
				</tr>

			</table>
			<input type="submit" value="Login" class="submit-button"> <br>
			<input type="checkbox" value="Remember password"> New User? <a
				href="register.jsp"> Register Here </a>

		</form>
	</div>
</body>
</html>