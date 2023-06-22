package com.yedam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LocalServlet")
public class LocalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LocalServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int number = 0;
		response.setContentType("text/html;charset=UTF-8");
		String msg = request.getParameter("msg");
		PrintWriter out = response.getWriter();
		out.print("<h2> 지역변수 : </h2>");
		
		while(number++ < 10) {
			out.print("<p> " + msg + " : " + number + "</p>");
			out.flush();
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		out.print("<h2>DONE : </h2>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
