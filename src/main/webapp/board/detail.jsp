<%@page import="com.yedam.board.BoardVO"%>
<%@page import="com.yedam.board.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/detail.jsp</title>
</head>
<body>
	<!-- 글번호 한건 조회 / 조회한 정보 페이지 작성 -->
	<%
	String bid = request.getParameter("no");
	int bno = Integer.parseInt(bid);
	BoardDao dao = BoardDao.getInstance();
	BoardVO brd = dao.select(bno); //단건조회
	dao.updateCnt(bno);
	// null 인지 체크
	%>
	<table border="1">
		<tr>
			<th>글번호</th>
			<td><%=brd.getBrdNo()%></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><%=brd.getBrdTitle()%></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><%=brd.getBrdWriter()%></td>
		</tr>
		<tr>
			<td colspan="2"><textarea rows="3" cols="30"><%=brd.getBrdContent()%></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><button>수 정</button>
				<button onclick="location.href='delete.jsp?no=<%=brd.getBrdNo()%>'">삭 제</button></td>
		</tr>

	</table>
	<br>
	<a href="blist.jsp">목록으로</a>
</body>
</html>