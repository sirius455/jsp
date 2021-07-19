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
		<li>DB에 회원정보를 저장할 수 있는 테이블을 하나 생성한다. (ID/PASSWord/EMAIL) </li>
		<li>비밀번호는 해시값으로 저장해야 한다.</li>
		<li>사용자는 지금 이 페이지에서 아이디와 비밀번호를 입력한다.</li>
		<li>컨트롤러에서 DB에서 꺼내온 아이디/비밀번호와 사용자가 입력한 아이디/비밀번호를 대조하여
			세션에 로그인 성공여부를 저장한다.
		</li>
		<li>로그인 된 상태로 현재 페이지를 보면 로그인 폼은 사라지고 회원 정보와 로그아웃 버튼이 보여야한다 </li>
		<li>로그아웃 기능도 구현해야한다</li>
		<li>포트가겹칠경우 프로젝트탐지기 맨아래 아래 톰캣파일 아래 server.xml에서 수정</li>
	</ul>

	<hr>
	
	<h3># 자바로 만든 클래스를 .jsp에서 자유롭게 가져다 사용할 수 있다</h3>
	<%=MyHashing.hash("12345") %>

	<h3># Dynamic Web Project에 외부 라이브러리를 사용하기 위해서는 
		WEB-INF/lib 폴더에 .jar등을 넣어줘야 한다.</h3>

	<%if (session.getAttribute("user_info") == null){ %>
	<form id="sessionForm" action="./loginpage.jsp" ></form>
	<input type="text" form="sessionForm" name="id">
	<input type="text" form="sessionForm"  name="password"/>

	<input type="submit" form="sessionForm" value="로그인" />	
	
	<%} else { %>
	
	<% 
	session.getAttribute("user_id");
	session.getAttribute("user_password");
	session.getAttribute("user_email");
	%>
	
	<h3>아이디 :${user_id} 패스워드 : ${user_password} 이메일 : ${user_email}</h3>
	<button id="login-out">로그아웃</button>
	
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