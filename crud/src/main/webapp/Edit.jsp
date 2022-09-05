<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	tr,td{
		border:1px solid black;
	}
</style>
</head>
<body>
	<h1>Update form</h1>
	<form action="crud" method="post">
		Name:<br>
		<input type="text"  name="user_name" value=<%=application.getAttribute("name")%>><br>
		Mobile_Number:<br>
		<input type="tel" name="user_password" value=<%= application.getAttribute("phone") %>><br><br>
		<input type="submit" name="submit" value=update>
	</form>
</body>
</html>