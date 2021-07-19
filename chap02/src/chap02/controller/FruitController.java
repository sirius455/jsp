package chap02.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chap02.model.Apple;

@WebServlet("/fruit/controller")
public class FruitController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fruit =req.getParameter("fruit");
		
	
		
		
		System.out.println("클라이언트가 클릭한 과일:" + fruit);
		
		
	
		// 해당 과일 이름의 파일의 내용을 읽어서 sysout으로 출력해보세요
		String path = String.format("C:\\Users\\1103-04\\Documents\\jsp-workspace\\chap02\\files\\%s.txt", fruit);
		File f = new File(path);
		StringBuilder detail = new StringBuilder();
		
		try(	
				FileInputStream fin = new FileInputStream(f);
				InputStreamReader iin = new InputStreamReader(fin, "UTF-8");
//				FileReader fin = new FileReader(f, Charset.forName("UTF-8"));
				BufferedReader in = new BufferedReader(iin);
		) {
			String line;
			while((line = in.readLine()) != null) {
				detail.append(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		// 리퀘스트 객체에 원하는 데이터를 실어놓으면 포워드하는 페이지로 해당 데이터를 그대로 가져간다.
		// 리쿼스트에 실려있는 어트리뷰트는 포워드하는 페이지로 그대로 전달한다.
		req.setAttribute("fruitName", fruit);
		req.setAttribute("fruitDetail", detail);
		
		// 어트리뷰트에는 자바의 모든 타입들을 실어 보낼 수 있다.
		// 어트리뷰트에 저장해놓으면 편하게 데이터를 꺼내쓸수있다.
		req.setAttribute("apple1", new Apple());
		req.setAttribute("apple2", new Apple());
		req.setAttribute("apple3", new Apple());
		req.setAttribute("appleArray", 
				new Apple[] {new Apple(), new Apple(), new Apple(), });
		
		// 포워드된 jsp페이지에서는 주로 화면을 구성한다.
		req.getRequestDispatcher("/attribute/view/fruitDetail.jsp").forward(req, resp);
		
		//resp.sendRedirect("/chap02/attribute/view/fruitDetail.jsp");
	}
	
}
