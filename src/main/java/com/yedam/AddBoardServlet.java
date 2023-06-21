package com.yedam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.BoardDao;
import com.yedam.board.BoardVO;


@WebServlet("/boardAdd")
public class AddBoardServlet extends HttpServlet{
	//생성자 -> init -> service-> destroy
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//title, writer, content 받아오기---------req에서 받아옴
		String title = req.getParameter("title"); // input name = "title"
		String writer = req.getParameter("writer");
		String content = req.getParameter("content");
		
		BoardVO board = new BoardVO();
		board.setBrdTitle(title);
		board.setBrdWriter(writer);
		board.setBrdContent(content);
		
		BoardDao dao = BoardDao.getInstance();
		boolean result = dao.insert(board); // 입력처리
		
		if(result) {
			resp.sendRedirect("board/blist.jsp"); // 요청 재지정
		}else {
			resp.sendRedirect("board/add.jsp");
		}
	
	}
}
