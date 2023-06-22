package com.yedam;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletContextsTest1")
public class ServletContextsTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletContextsTest1() {
        super();
    }

    //ServletContext(객체) -> 생성자 -> ServletConfig -> init() -> service() 순서로 진행된다
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init();
    	ServletContext sc = config.getServletContext();//ServletContext 반환
    	sc.setAttribute("servletContext", "HELL");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

}
