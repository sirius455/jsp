package chap03.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/language/kr")
public class HanguelController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// GET방식 요청은 URL뒤에 추가 되어서 도착한다.
		// 그곳에 실려온 데이터의 인코딩은 웹 서버(Tomcat)가 담당한다.
		
		// 톰캣에는 인코딩 타입의 기본값으로 UTF-8을 사용한다
		// sever.xml의 <Connector태그의 URIEncoding 속성을 설정하면 GET방식>
		// GET방식 인코딩 타입을 변경할 수 있다
		System.out.println(req.getParameter("msg"));
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//POST방식의 요청은 요청 객체 내부에 실려서 도착한다. 
		req.setCharacterEncoding("EUC-KR");
		System.out.println(req.getParameter("msg"));
	}
	
}
