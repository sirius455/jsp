package chap02.movie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ticket
 */
@WebServlet("/movie/ticket")
public class Ticket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ticket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("MS949");
		
		PrintWriter ticket = response.getWriter();
		
		String playTime = request.getParameter("play_time");
		String adult = request.getParameter("adult");
		String youth = request.getParameter("youth");
		String senior = request.getParameter("senior");
		String disabled = request.getParameter("disabled");
		System.out.println(playTime);
		int adult_price = 0;
		int youth_price = 0;
		int senior_price = 0;
		int disabled_price = 0;
		
		ticket.print("<table>");
		ticket.print("<table border='1'>");
		ticket.printf("<tr><th>%s</th>", playTime);
		
		if(!adult.equals(null)) {
			ticket.printf("<th>성인 %s명</th>", adult);
			if(playTime.equals("morning")) {
			adult_price = Integer.parseInt(adult) * 6000;
			System.out.println(adult_price);
			} else if(playTime.equals("normal") || playTime.equals("night")) {
			adult_price = Integer.parseInt(adult) * 7000;	
			} else if(playTime.equals("prime")) {
			adult_price = Integer.parseInt(adult) * 9000;	
			}
		}
		
		if(!adult.equals(null)) {
			ticket.printf("<th>청소년 %s명</th>", youth);
			if(playTime.equals("morning")) {
				youth_price = Integer.parseInt(youth) * 6000;
				System.out.println(youth_price);
				} else if(playTime.equals("normal") || playTime.equals("night")) {
				youth_price = Integer.parseInt(youth) * 7000;	
				} else if(playTime.equals("prime")) {
				youth_price = Integer.parseInt(youth) * 8000;	
				}
		}
		
		if(!adult.equals(null)) {
			ticket.printf("<th>시니어 %s명</th>", senior);
			senior_price = Integer.parseInt(senior) * 5000;	
		}
		
		if(!adult.equals(null)) {
			ticket.printf("<th>장애인 %s명</th>", disabled);
			disabled_price = Integer.parseInt(disabled) * 5000;	
		}
		
		ticket.printf("<th>총가격: %d원</th></tr>", (adult_price + youth_price + senior_price + disabled_price));
		
		ticket.print("</table>");
	
	}

}
