<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<% 
	//������ �ٷ� ����Ű�Ŵ�	
	session.invalidate();
	response.sendRedirect("/chap02/scope/scope.jsp");
%>