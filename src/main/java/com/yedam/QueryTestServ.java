package com.yedam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/QueryTestServ", "/queryTest" })
public class QueryTestServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public QueryTestServ() {
		super();
	}

	// service() 또는 init()을 따로 정의하지 않으면
	// 요청방식에 따라서 get 방식 요청이면 doGet() 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 응답정보 stream이 기본문자나 영어 숫자는 보여주는데 한글은 처리가안된다
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("Get 방식의 호출입니다");
		// param 전달
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");

		String[] hobbies = request.getParameterValues("hobby");
		String gender = request.getParameter("gender");
		String religion = request.getParameter("religion");
		String intro = request.getParameter("intro");

		// 출력스트림
		PrintWriter out = response.getWriter(); // 출력스트림
		out.print("<p>ID : " + id + "</p>");
		out.print("<p>PW : " + pwd + "</p>");
		out.print("<p>이름 : " + name + "</p>");
		for (String hobby : hobbies) {
			out.print("<p>취미 : " + hobby + "</p>");
		}
		out.print("<p>성별 : " + gender + "</p>");
		out.print("<p>종교 : " + religion + "</p>");
		out.print("<p>자기소개 : " + intro + "</p>");

		out.print("<p>QueryString : " + request.getQueryString() + "</p>");
	}

	// 요청방식에 따라서 post 방식 요청이면 doPost() 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Post 방식의 호출입니다");

		Enumeration<String> enm = request.getHeaderNames();
		while (enm.hasMoreElements()) {
			String elem = enm.nextElement();
			System.out.println("header : " + elem + ", val" + request.getHeader(elem));
		}
		// 응답정보 stream이 기본문자나 영어 숫자는 보여주는데 한글은 처리가안된다
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		// param 전달
//		String id = request.getParameter("id");
//		String pwd = request.getParameter("pwd");
//		String name = request.getParameter("name");
//
//		String[] hobbies = request.getParameterValues("hobby");
//		String gender = request.getParameter("gender");
//		String religion = request.getParameter("religion");
//		String intro = request.getParameter("intro");

		// 출력스트림
		PrintWriter out = response.getWriter(); // 출력스트림
//		out.print("<p>ID : " + id + "</p>");
//		out.print("<p>PW : " + pwd + "</p>");
//		out.print("<p>이름 : " + name + "</p>");
//		for (String hobby : hobbies) {
//			out.print("<p>취미 : " + hobby + "</p>");
//		}
//		out.print("<p>성별 : " + gender + "</p>");
//		out.print("<p>종교 : " + religion + "</p>");
//		out.print("<p>자기소개 : " + intro + "</p>");

		
		
		ServletInputStream sis = request.getInputStream();
		int len = request.getContentLength();
		byte[] buf =new byte[len];
		sis.readLine(buf, 0, len);
		
		String queryString = new String(buf);
		out.print("<p>QueryString : " + queryString + "</p>");
	}

}
