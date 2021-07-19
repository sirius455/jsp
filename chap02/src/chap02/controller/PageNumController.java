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
		// TODO �ڵ� ������ �޼ҵ� ����
	
		String page = request.getParameter("page");
		
		System.out.printf("���� ���� �������� %s�������Դϴ�.\n", page);
		
		//���� ���� ���� ���� �ٸ� ������ ��������� �ϴ� ���
		//������ ����ϸ� �ڵ尡 �ſ� ������������
		
		//���� ������� ��û�� �ٸ��������� �й��Ͽ� ������ �����ϴ� ���� �ٶ����ϴ�.
		
		//�� ��, �ٸ� .jsp �������� request�� �״�� �����Ͽ� ������ .jsp���� ������ �����ϴ� ����
		//forward��� �Ѵ�. ���⼭ ��
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(String.format("/forward/view/page%s.jsp", page));
		
		// dispatcher.forward(request, response);
		
		// include�� �ٸ� .jsp �������� request�� ���� �� ������ ����� �� �������� �ٽ� �����´�.
		response.setCharacterEncoding("EUC-KR");
		dispatcher.include(request, response);
		
		//�̾ ������ ����� ���� �� �ִ�.
		
		response.getWriter().append("<h3> �������� �߰���. by PageNumController <h3>");
		
		
	}
	
}
