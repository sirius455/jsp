<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%!
	private String getTimeLabel(String time) {
	if(time == null) {
		return "시간이 널값임";
	}
	
	switch (time) {
	case "am" :
		return "오전 희망";		
	case "pm" :
		return "오후 희망";
	case "other" :
		return "그 외 시간";
	case "any" :
		return "아무때나 필요한 시간";
	default:
		return "버그임";
	}
}
%>

<%
	request.setCharacterEncoding("EUC-KR");

	String firstName = request.getParameter("first-name");
	String lastName =request.getParameter("Last-name");
	String time =request.getParameter("worktime");
	String intrest =request.getParameter("Interested");

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	FirstName : <%=firstName !=null ? firstName : "없음" %>
	lastName : <%=lastName !=null ? lastName : "없음" %>
	희망시간 : <%= %>>
	
</body>
</html>