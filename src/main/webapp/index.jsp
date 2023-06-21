<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dotoryman made</title>
</head>
<body>
	<h1>Hello Jamie</h1>
	<p>This is JAVA Server Page</p>
	<%
	String name = "Dotoryman";
	int age = 99;
	%>
	<h1>제 이름은 <%=name %> 이고 나이는 <%=age %> 살입니다.</h1>
</body>
</html>