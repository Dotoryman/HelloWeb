package com.yedam;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	public FirstServlet() {
		System.out.println("생성자 호출"); 
		
	}
	
	
//	init() -> req , resp(톰캣이 만들어주는거) -> service() -> destroy() --이걸 servlet life cycle 이라함
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init() 를 호출했습니다"); //init()은 서버 실행후에 최초 한번만 실행
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
		System.out.println("service() 를 호출했습니다"); //service() 는 서버 실행후 요청이 있을때 마다 실행
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() 를 호출했습니다");
		super.destroy(); // destory() 는 서버 종료될 때 한번만 실행
	}
}
