<%@page import="com.yedam.board.BoardVO"%>
<%@page import="com.yedam.board.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/modify.jsp</title>
</head>
<body>
	<!-- 글번호 기준으로 한건 조회 -> 수정 선택 -> 페이지 작성 -> 저장버튼 클릭하면 변경 후 목록이동 -->
	<%
	String bid = request.getParameter("no");
	int bno = Integer.parseInt(bid);
	BoardDao dao = BoardDao.getInstance();
	BoardVO brd = dao.select(bno); //단건조회
	// null 인지 체크
	%>
	<form action="../ModifyBoardServlet">
		<table border="1">
			<tr>
				<th>글번호</th>
				<td><input type="text" name="pno" readonly value="<%=brd.getBrdNo() %>"></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="pti" value="<%=brd.getBrdTitle()%>"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" readonly
					value="<%=brd.getBrdWriter() %>"></td>
			</tr>
			<tr>
				<td colspan="2">
				<textarea rows="3" cols="30" name="pco"><%=brd.getBrdContent() %>
				</textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">저장</button>
				</td>
			</tr>

		</table>
	</form>
	<br>
	<a href="blist.jsp">목록으로</a>
</body>
</html>