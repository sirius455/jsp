<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<% 
	//세션을 바로 만료키신다	
	session.invalidate();
	response.sendRedirect("/chap02/scope/scope.jsp");
%>