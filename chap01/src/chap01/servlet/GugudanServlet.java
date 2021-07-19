package chap01.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
	
	/*
		.jsp -> ���� -> .java -> compile ->
	 	.class(����Ʈ �ڵ�, �ڹ� ���� �ӽ��� ������ �� �ִ� ����) ���·� tomcat�� �����
	*/
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//<%!
		
		// %>
		
		// <%
		PrintWriter gugudan = resp.getWriter();
		
		gugudan.print("<style>tr > * {padding:10px} </style>");
		
		gugudan.print("<table border='1'>");
		for (int dan = 2; dan < 10; dan++) {
			gugudan.printf("<tr><th>%dDan</th>", dan);
			for (int gop = 1; gop < 10; gop++) {
				gugudan.printf("<td>%d x %d = %d</td>", dan, gop, dan * gop);
			}
			gugudan.print("</tr>");
		}
		gugudan.print("</table>");
		// %>
	}
	
	
}
