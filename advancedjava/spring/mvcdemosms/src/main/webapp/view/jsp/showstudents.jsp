<%@ page import="java.util.List,com.sms.model.Student" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Here i need to display student details in the table</h1>
	<%List<Student> myStudent=(List<Student>)request.getAttribute("studentList"); %>
	<table border="2px">
		
		<tr><th>Id</th><th>Name</th><th>Password</th><th>phone</th><th>Email</th></tr>
		<% for(Student s:myStudent){ %>
		<tr>
			<td><%=s.getStudentId() %></td>
			<td><%=s.getStudentName() %></td>
			<td><%=s.getStudentPassword() %></td>
			<td><%=s.getStudentPhone() %></td>
			<td><%=s.getStudentEmail() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>