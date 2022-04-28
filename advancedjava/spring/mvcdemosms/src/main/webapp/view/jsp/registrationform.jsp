<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Student Registration Form</h1>
	<form action="registerstudent" modelAttribute="s">
		Enter the Name:<input type="text" name="StudentName"><br><br>
		Enter the Password:<input type="text" name="StudentPassword"><br><br>
		Enter the Phone No:<input type="text" name="StudentPhone"><br><br>
		Enter the Email:<input type="text" name="StudentEmail"><br><br>
		<input type="submit">
		<input type="reset">
	</form>
</body>
</html>