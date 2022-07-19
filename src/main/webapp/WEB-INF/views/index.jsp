<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>this is home page</h1>
	<h1>called by home controller</h1>
	<h1>url /home</h1>
	<%
	//String name = (String) request.getAttribute("name");
	List<String> friends = (List<String>)request.getAttribute("f");
	for (String s : friends) {
		out.println(s);

	}
	%>

	<h1>
		</h1>

</body>
</html>