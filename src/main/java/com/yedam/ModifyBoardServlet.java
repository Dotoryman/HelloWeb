package com.yedam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.BoardDao;
import com.yedam.board.BoardVO;

@WebServlet("/ModifyBoardServlet")
public class ModifyBoardServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//title, writer, content 받아오기---------req에서 받아옴
		String title = req.getParameter("pti"); // input name = "title"
		int no = Integer.parseInt(req.getParameter("pno"));
		String content = req.getParameter("pco");
		
		BoardVO board = new BoardVO();
		board.setBrdTitle(title);
		board.setBrdNo(no);
		board.setBrdContent(content);
		
		BoardDao dao = BoardDao.getInstance();
		boolean result = dao.update(board); // 입력처리
		
		if(result) {
			resp.sendRedirect("board/blist.jsp"); // 요청 재지정
		}else {
			resp.sendRedirect("board/add.jsp");
		}
	
	}
}
