package chap02.river;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet(
		description = "abcdefg", 
		urlPatterns = { "/river/register", "/cleanup/register" })
public final class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("������ ó�� �ʱ�ȭ �� �� �ѹ��� ����˴ϴ�.");
		System.out.println("�ʱ�ȭ ���Դϴ�...");
		System.out.println("�ʱ�ȭ�� �������ϴ�...");
	}
	
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��û ��İ� ������� service()�� ȣ��˴ϴ�.");
		// ���� service�� ó���� �� �˸��� doMethod()�� ȣ����
		// service�� �⺻ ������ ��û�� method�� ����
		// ��û�� �˸��� doMethod()�� �й��ϴ� ���̴�.
		super.service(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Get��� ��û�� ��� doGet()�� ȣ��˴ϴ�.");
		
		/*
			HttpServeltRequest���� ������� ��û�� ���� ��� ������ ��� �ִ�.
			
			�� �߿��� form�� ���� �Ƿ��� �����ʹ� ��û ��ü�� parameter�� ����ִ�
		*/
		
		String firstName = request.getParameter("first-name");
		String lastName = request.getParameter("Last-name");
		
		//�߸��� �Ķ���͸� �������� ��쿡 null�� ���ϵ�
		String nickName = request.getParameter("nick-name");
		
		System.out.printf("����ڰ� ���� �̸�: %s %s\n", firstName, lastName);
		
		response.getWriter()
			.append("Username: " + firstName)
			.append(" " + lastName)
			.append("<br> NickName: " + nickName);
		
		System.out.println("url: " + request.getRequestURL());
		System.out.println("uri: " + request.getRequestURI());
		System.out.println("method: " + request.getMethod());
		
		// contextPath: ���� ������Ʈ�� ��Ĺ�� ����� �� ����ϰ� �ִ� ��� �̸�
		System.out.println("contextPath: " + request.getContextPath());
		System.out.println("��û���� IP�ּ�: " + request.getRemoteAddr());
		System.out.println("��Ʈ��ȣ: " + request.getServerPort());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post ��� ��û�� ��� doPost()�� ȣ��˴ϴ�.");
		
	
		System.out.println(request.getParameter("first-name"));
		System.out.println(request.getParameter("Last-name"));
		
		//�ϳ��� name �Ӽ��� �������� ���� �޾ƾ� �ϴ� ��� (üũ�ڽ� ��)
		String[] intrests = request.getParameterValues("Interested");
		System.out.println(Arrays.toString(intrests));
		
		//name �Ӽ����� ���� ���� ��� ���� ���� �� �ִ�
		Enumeration<String> paramNames = request.getParameterNames();
		
		//java.sql�� resultSet�� ����� �������� ����Ѵ�
		while (paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();
			
			System.out.println("Enumeration���� ������: " 
					+ Arrays.toString(request.getParameterValues(name)));
		}
		
		
	}

}
