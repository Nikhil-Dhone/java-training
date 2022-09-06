<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
tr, td {
	border: 1px solid black;
}
</style>

</head>
<body>
	<%@include file="register.html"%>
	<div style="margin-top: 5x%;">
		<%-- <h1>Details</h1>
		<table style="border: 1px solid black">

			<tr>
				<td>Name</td>
				<td>Mail</td>
				<td>Password</td>
				<td>Mobile_Number</td>
				<td>Update_details</td>
			</tr>
			<tr>
				<td><%=request.getParameter("name")%></td>
				<td><%=request.getParameter("mail")%></td>
				<td><%=request.getParameter("mobile")%></td>
				<%
				application.setAttribute("name", request.getParameter("name"));
				application.setAttribute("mail", request.getParameter("mail"));
				application.setAttribute("phone", request.getParameter("mobile"));
				%>
				<td><form action="crud" method="post">
						<input type="submit" name="submit" value="edit">
					</form></td>
			</tr>
		</table> --%>
		
		<pre>
		
		
		
		
		</pre>

		
		<div style="margin-left: 50px;">
		<h2 style="margin-left: 30px;">Details</h2>
		<hr>
		<h3>
			Name :
			<%=request.getParameter("name")%></h3>
		<h3>
			Mail :
			<%=request.getParameter("mail")%></h3>
		<h3>
			Phone :
			<%=request.getParameter("mobile")%></h3>
			
		<hr>
		
		<form action="crud" method="post" style="margin-left: 35px;">
			<input type="submit" name="submit" value="edit">
		</form>
		</div>

		<%
		application.setAttribute("name", request.getParameter("name"));
		application.setAttribute("mail", request.getParameter("mail"));
		application.setAttribute("phone", request.getParameter("mobile"));
		%>

		
		
		</div>
	
</body>
</html>