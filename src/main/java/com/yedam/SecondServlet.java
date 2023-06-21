package com.yedam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.ParkDao;
import com.yedam.common.ParkVO;


@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter(); //출력스트림은 웹브라우저
		out.print("<h1> Dotoryman's house </h1>");
		
		ParkDao dao = new ParkDao();
		List<ParkVO> List = dao.list();
		
		for(ParkVO vo : List) {
			out.print("<li>차량번호 : " +vo.toString() + "</li>");
		}
		
		
		out.close();
		
	}
}
