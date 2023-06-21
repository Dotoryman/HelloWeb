<%@page import="java.util.List"%>
<%@page import="com.yedam.common.ParkVO"%>
<%@page import="com.yedam.common.ParkDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>차량목록</title>
</head>
<body>
	<ul>
	<%
		ParkDao dao = new ParkDao();
		List<ParkVO> list = dao.list();
		for (ParkVO vo : list){
	%>
	<li>차량번호 : <%=vo.getCarNo() %></li>
	<%
		}
	%>
	</ul>
	<a href = "../second">second servlet</a> 
</body>
</html>