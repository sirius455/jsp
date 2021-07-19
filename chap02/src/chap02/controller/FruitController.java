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
		
	
		
		
		System.out.println("Ŭ���̾�Ʈ�� Ŭ���� ����:" + fruit);
		
		
	
		// �ش� ���� �̸��� ������ ������ �о sysout���� ����غ�����
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
	
		// ������Ʈ ��ü�� ���ϴ� �����͸� �Ǿ������ �������ϴ� �������� �ش� �����͸� �״�� ��������.
		// ������Ʈ�� �Ƿ��ִ� ��Ʈ����Ʈ�� �������ϴ� �������� �״�� �����Ѵ�.
		req.setAttribute("fruitName", fruit);
		req.setAttribute("fruitDetail", detail);
		
		// ��Ʈ����Ʈ���� �ڹ��� ��� Ÿ�Ե��� �Ǿ� ���� �� �ִ�.
		// ��Ʈ����Ʈ�� �����س����� ���ϰ� �����͸� ���������ִ�.
		req.setAttribute("apple1", new Apple());
		req.setAttribute("apple2", new Apple());
		req.setAttribute("apple3", new Apple());
		req.setAttribute("appleArray", 
				new Apple[] {new Apple(), new Apple(), new Apple(), });
		
		// ������� jsp������������ �ַ� ȭ���� �����Ѵ�.
		req.getRequestDispatcher("/attribute/view/fruitDetail.jsp").forward(req, resp);
		
		//resp.sendRedirect("/chap02/attribute/view/fruitDetail.jsp");
	}
	
}
