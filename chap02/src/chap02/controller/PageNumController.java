package chap02.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/page/controller"})
public class PageNumController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO 자동 생성된 메소드 스텁
	
		String page = request.getParameter("page");
		
		System.out.printf("전달 받은 페이지는 %s페이지입니다.\n", page);
		
		//전달 받은 값에 따라서 다른 내용을 응답해줘야 하는 경우
		//서블릿만 사용하면 코드가 매우 지저분해진다
		
		//따라서 사용자의 요청을 다른페이지로 분배하여 응답을 생성하는 것이 바람직하다.
		
		//이 때, 다른 .jsp 페이지로 request를 그대로 전달하여 전달한 .jsp에서 응답을 생성하는 것을
		//forward라고 한다. 여기서 끝
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(String.format("/forward/view/page%s.jsp", page));
		
		// dispatcher.forward(request, response);
		
		// include는 다른 .jsp 페이지로 request를 보낸 후 생성된 결과를 이 서블릿으로 다시 가져온다.
		response.setCharacterEncoding("EUC-KR");
		dispatcher.include(request, response);
		
		//이어서 응답을 만들어 나갈 수 있다.
		
		response.getWriter().append("<h3> 서블릿에서 추가됨. by PageNumController <h3>");
		
		
	}
	
}
