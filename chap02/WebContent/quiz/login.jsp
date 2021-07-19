<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="chap02.hash.MyHashing" %> <%--JSP Import --%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login.jsp</title>
</head>
<body>
	
	<h3># login.jsp</h3>
	
	<ul>
		<li>DB�� ȸ�������� ������ �� �ִ� ���̺��� �ϳ� �����Ѵ�. (ID/PASSWord/EMAIL) </li>
		<li>��й�ȣ�� �ؽð����� �����ؾ� �Ѵ�.</li>
		<li>����ڴ� ���� �� ���������� ���̵�� ��й�ȣ�� �Է��Ѵ�.</li>
		<li>��Ʈ�ѷ����� DB���� ������ ���̵�/��й�ȣ�� ����ڰ� �Է��� ���̵�/��й�ȣ�� �����Ͽ�
			���ǿ� �α��� �������θ� �����Ѵ�.
		</li>
		<li>�α��� �� ���·� ���� �������� ���� �α��� ���� ������� ȸ�� ������ �α׾ƿ� ��ư�� �������Ѵ� </li>
		<li>�α׾ƿ� ��ɵ� �����ؾ��Ѵ�</li>
		<li>��Ʈ����ĥ��� ������ƮŽ���� �ǾƷ� �Ʒ� ��Ĺ���� �Ʒ� server.xml���� ����</li>
	</ul>

	<hr>
	
	<h3># �ڹٷ� ���� Ŭ������ .jsp���� �����Ӱ� ������ ����� �� �ִ�</h3>
	<%=MyHashing.hash("12345") %>

	<h3># Dynamic Web Project�� �ܺ� ���̺귯���� ����ϱ� ���ؼ��� 
		WEB-INF/lib ������ .jar���� �־���� �Ѵ�.</h3>

	<%if (session.getAttribute("user_info") == null){ %>
	<form id="sessionForm" action="./loginpage.jsp" ></form>
	<input type="text" form="sessionForm" name="id">
	<input type="text" form="sessionForm"  name="password"/>

	<input type="submit" form="sessionForm" value="�α���" />	
	
	<%} else { %>
	
	<% 
	session.getAttribute("user_id");
	session.getAttribute("user_password");
	session.getAttribute("user_email");
	%>
	
	<h3>���̵� :${user_id} �н����� : ${user_password} �̸��� : ${user_email}</h3>
	<button id="login-out">�α׾ƿ�</button>
	
	<% } %>
	
	<script>
		const btn = document.querySelector("#login-out");
		function logout() {
			location.href = "./logout.jsp"
		}
		
		btn.addEventListener('click', (e) => {
			logout();
		});
		
		
		
	</script>
	

	
</body>
</html>