<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%!
	private String getTimeLabel(String time) {
	if(time == null) {
		return "�ð��� �ΰ���";
	}
	
	switch (time) {
	case "am" :
		return "���� ���";		
	case "pm" :
		return "���� ���";
	case "other" :
		return "�� �� �ð�";
	case "any" :
		return "�ƹ����� �ʿ��� �ð�";
	default:
		return "������";
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
	
	FirstName : <%=firstName !=null ? firstName : "����" %>
	lastName : <%=lastName !=null ? lastName : "����" %>
	����ð� : <%= %>>
	
</body>
</html>