<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Ejemplo Servlet</h1>
	<form action = "${pageContext.request.contextPath}/AnotacionServlet" method = "POST">
		<label>Ingrese usuario:</label><input name = "username" type = "text">
		<label>Ingrese contrase�a:</label><input name = "password" type = "password">
		<input name = "login" type = "submit">
	</form>
</body>
</html>