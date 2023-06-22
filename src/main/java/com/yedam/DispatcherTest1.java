package com.yedam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DispatcherTest1")
public class DispatcherTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DispatcherTest1() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h2> Request 공유 ♥</h2>");
		request.setAttribute("request", "HELL");
		
//		RequestDispatcher rd= request.getRequestDispatcher("DispatcherTest2");
//		rd.forward(request, response); //요청을 재지정, 값을 넘겨줄때
		
		response.sendRedirect("DispatcherTest2"); // 값을 넘겨주지 않을때
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
