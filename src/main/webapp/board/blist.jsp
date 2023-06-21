<%@page import="com.yedam.board.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="com.yedam.board.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/blist.jsp</title>
</head>
<body>
	<h1>-=-=- 게 시 판 -=-=-</h1>
	<table border='1'>
		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<%
			BoardDao dao = BoardDao.getInstance();
			List<BoardVO> list = dao.list();
			for(BoardVO brd : list){
			%>
			<tr>
				<td><%=brd.getBrdNo() %></td>
				<td><a href="detail.jsp?no=<%=brd.getBrdNo()%>"><%=brd.getBrdTitle()%></a></td>
				<td><%=brd.getBrdWriter() %></td>
				<td><%=brd.getClickCnt() %></td>
			</tr>
			<%
			  }
			%>
		</tbody>
	</table>
</body>
</html>