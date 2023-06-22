package com.yedam;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContextsTest2")
public class ServletContextsTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletContextsTest2() {
		super();

	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init();
		ServletContext sc = config.getServletContext();// ServletContext 반환
		String msg = (String) sc.getAttribute("servletContext");
		System.out.println("공유메세지" + msg);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
