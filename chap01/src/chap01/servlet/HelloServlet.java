package chap01.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
  	# �� ����Ʈ�� Ŭ���̾�Ʈ���� �������� ����
  	
  	 ȣ��Ʈ : �� �������� ������ �ִ� �� �������� ����
  	 Ŭ���̾�Ʈ : �� ������ �����ϴ� �����
	
	(1) Ŭ���̾�Ʈ�� ȣ��Ʈ���� ���ϴ� �� �������� �����޶�� ��û�Ѵ�,
		��û�� �� ���ϴ� �������� �������� �� �ּ� (URL)�� ��� ������.
		
		http://naver.com/news
		
		http:// - ��� ��� (http, https, ftp...)
		naver.com - IP �ּ� (�Ǵ� ������)
		/new - ����ڰ� �ش� �� �������� Ư���� ���ϴ� �ڿ� (�� ������ �Ǵ� �׸� ��);
	
	(2) ������� ��û�� Apache-Tomcat�� �����Ѵ� 
		Apache-Tomcat�� ��ϵǾ��ִ� URL ���ε� �� ��ġ�ϴ� �ڿ��� ã�´�.
		
		����� �� �ִ� �ڿ��� - .jsp, .java(Servlet), .html, 
						 ��Ÿ �ڿ���(.js, .css, .jpg ..)
		��� ����� - @WebServlet ������̼�, webapp(webContent) �ؿ� ���� �ֱ�.. ��
	
	(3) ��ϵ� �ڿ��� �� ������� ��û�� ���� �������� �ٸ� ������� ������ �������� ���� �� ��������� �Ѵ�.
	
	(4) Ŭ���̾�Ʈ�� ��û�� �ùٸ� ��û�̾��ٸ� (��Ĺ�� ��ϵ� �ڿ��� �´ٸ�)
		�ش� �ڿ��� ����(Servlet ���α׷� ����) �����Ѵ�. 
		(�Ǵ� �̹� �ִ� �ڿ��� �״�� �����Ѵ�, ���� �� �������� �ƴ� �ڿ���)
	
	(5) �� �������� ������ �ڿ��� ��û ���´� Ŭ���̾�Ʈ�� �� �������� �����Ѵ�.
		�� �������� ���� ���� ������ �ؼ��Ͽ� ����ڿ��� �����ش�.
	
		
		
*/

//�� ���������� �����Ϸ��� � URL�� �����ؾ��ϴ��� �����ϴ� ������̼� (/chap01/hello)
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		// HttpServletRequest: ����ڰ� ���� ��� ��û ������ ���� �� �ִ� Ŭ����
		// HttpServletReponse: ���� ��û�� ���� �˸��� ������ ��Ƴ��� �� �ִ� Ŭ����
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>�ȳ��ϼ���</title></head><body>");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n" + 
				"    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">");
		out.println("<h1>Hello!</h1>");
		out.println("<table class=\"table table-hover\">\r\n" + 
				"\r\n" + 
				"        <tr class=\"active\">\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"        </tr>\r\n" + 
				"        <tr class=\"success\">\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"        </tr>\r\n" + 
				"        <tr class=\"warning\">\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"        </tr>\r\n" + 
				"        <tr class=\"danger\">\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"        </tr>\r\n" + 
				"        <tr class=\"info\">\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"            <td>table content</td>\r\n" + 
				"        </tr>\r\n" + 
				"\r\n" + 
				"    </table>");
		out.println("</html>");
		
	}
	
}