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
		System.out.println("서블릿을 처음 초기화 할 때 한번만 실행됩니다.");
		System.out.println("초기화 중입니다...");
		System.out.println("초기화가 끝났습니다...");
	}
	
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("요청 방식과 상관없이 service()가 호출됩니다.");
		// 원래 service를 처리한 후 알맞은 doMethod()를 호출함
		// service의 기본 동작은 요청의 method에 따라
		// 요청을 알맞은 doMethod()로 분배하는 것이다.
		super.service(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Get방식 요청인 경우 doGet()이 호출됩니다.");
		
		/*
			HttpServeltRequest에는 사용자의 요청에 대한 모든 정보가 담겨 있다.
			
			그 중에서 form을 통해 실려온 데이터는 요청 객체의 parameter에 담겨있다
		*/
		
		String firstName = request.getParameter("first-name");
		String lastName = request.getParameter("Last-name");
		
		//잘못된 파라미터를 가저오는 경우에 null이 리턴됨
		String nickName = request.getParameter("nick-name");
		
		System.out.printf("사용자가 보낸 이름: %s %s\n", firstName, lastName);
		
		response.getWriter()
			.append("Username: " + firstName)
			.append(" " + lastName)
			.append("<br> NickName: " + nickName);
		
		System.out.println("url: " + request.getRequestURL());
		System.out.println("uri: " + request.getRequestURI());
		System.out.println("method: " + request.getMethod());
		
		// contextPath: 현재 프로젝트를 톰캣에 등록할 때 사용하고 있는 경로 이름
		System.out.println("contextPath: " + request.getContextPath());
		System.out.println("요청자의 IP주소: " + request.getRemoteAddr());
		System.out.println("포트번호: " + request.getServerPort());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post 방식 요청인 경우 doPost()가 호출됩니다.");
		
	
		System.out.println(request.getParameter("first-name"));
		System.out.println(request.getParameter("Last-name"));
		
		//하나의 name 속성에 여러개의 값을 받아야 하는 경우 (체크박스 등)
		String[] intrests = request.getParameterValues("Interested");
		System.out.println(Arrays.toString(intrests));
		
		//name 속성값을 몰라도 받은 모든 것을 꺼낼 수 있다
		Enumeration<String> paramNames = request.getParameterNames();
		
		//java.sql의 resultSet과 비슷한 느낌으로 사용한다
		while (paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();
			
			System.out.println("Enumeration으로 꺼내봄: " 
					+ Arrays.toString(request.getParameterValues(name)));
		}
		
		
	}

}
