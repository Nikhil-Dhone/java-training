<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	display: flex;
	align-items: center;
	justify-content: center;
	height: 80vh;
}

.container {
	display: inline-block;
	border-radius: 8px;
	text-align: left;
	left: 50%;
	margin-top: 40px;
}

form {
	margin: 12px;
}
</style>
</head>
<body>
	<fieldset>
		<legend style="font-size: 175%"><b>Update Form</b></legend>
		<div class="container">
			<form action="crud" method="post">

				<!-- <h2 style="margin-left: 10px;">Update Form</h2> -->
				<label style="font-size: 125%;">Name</label><br> 
				<input type="text" name="name" value=<%=application.getAttribute("name")%>><br><br>
				
				<label style="font-size: 125%;">E-mail</label><br> 
				<input type="email" name="mail" value=<%=application.getAttribute("mail")%>><br><br> 
				
				<label style="font-size: 125%;">Mobile Number</label><br> 
				<input type="tel" name="mobile" value=<%=application.getAttribute("phone")%>><br> 
				
				<input type="submit" value="Update" name="submit" style="margin-left: 53px; margin-top: 10px;">


			</form>

		</div>
	</fieldset>
</body>
</html>