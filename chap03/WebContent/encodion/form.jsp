<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�ѱ� ������ ������</title>
</head>
<body>
	
	<h3># JSP�� �������� charset ����</h3>
	
	<dd>
		<dt>1. meta �±��� charset ����:</dt>
		<dd>Ŭ���̾�Ʈ�� �� �������� �������� �ؼ��Ҷ� ����� charset�� �����Ѵ�</dd>
		<dt>2. pageEncoding�� charset ����:</dt>
		<dd>�� JSP �ڵ���� �������� ��Ȱ�� �� ����� charset�� �ǹ��Ѵ�</dd>
		<dt>3. contentType�� charset ����:</dt>
		<dd>�������� ������ �����(����)�� ���� �� ���ڵ� Ÿ���� �����Ѵ�</dd>
	</dd>
	
	<h3>�ѱ� �����غ��� ������</h3>
	
	<h5># GET ���</h5>
	<form action="/chap03/language/kr" method="GET">
		<input type="hidden" name="msg" value="�ȳ��ϼ���" />
		<input type="submit" value='"�ȳ��ϼ��� ������"' />
	</form>
	
	<h5># POST ���</h5>
	<form action="/chap03/language/kr" method="POST">
		<input type="hidden" name="msg" value="�ȳ��ϼ���" />
		<input type="submit" value='"�ȳ��ϼ��� ������"' />
	</form>

</body>
</html>