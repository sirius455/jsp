<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�ڹٺ�</title>
</head>
<body>
	
	<h3># �ڹٺ� ��ü (JavaBean Object)</h3>
	
	<ul>
		<li>JSP���� �����͸� �����ϰ� �ְ��ޱ� ���� Ŭ������ ǥ�� ����</li>
		<li>�ڹٺ� ǥ�ؿ� ���� ������ Ŭ������ JSP���� �����ϰ� ����� �� �ִ�</li>
	</ul>
	
	<h3># �ڹٺ� ��ü�� ��Ģ</h3>
	
	<ol>
		<li>�ݵ�� public class���� �Ѵ�</li>
		<li>�⺻ �����ڰ� �ݵ�� �����ؾ� �Ѵ�</li>
		<li>�ʵ��� ���� �����ڰ� private�̾�� �Ѵ�</li>
		<li>�ʵ忡�� �ݵ�� getter/setter�� ���� �����ؾ� �Ѵ� </li>
	</ol>
	
	<hr>
	
	<h3># ��������</h3>
	
	<ol>
		<li>���� �������� �Ʒ��� �л��� �̸��� ������ �Է��ϴ� ���� �����Ѵ�.</li>
		<li>�̸��� ������ �Բ� ������ ��û�� ������ ����ǥ �������� ��ȯ�޴´�</li>
		<li>����ǥ���� �̸�/�� ���� ����/���/����� �����ִ�.</li>
		<li>Student Ŭ������ �޼���� �ʵ�� �����Ӱ� �߰��� �� �ִ�.</li>
	</ol>
	

	<form id="student-form" action="./add" method="POST"></form>
	
	<ul type="none">
		<li>�̸� : <input type ="text" name="name" form="student-form"></li>
		<li>���� : <input type ="text" name="kor" form="student-form"></li>
		<li>���� : <input type ="text" name="eng" form="student-form"></li>
		<li>���� : <input type ="text" name="math" form="student-form"></li>
		<li><input type="submit" value="���" form="student-form"></li>
	</ul>
	
	<form id="student-form2" action="/chap03/javabean/useBeanController.jsp" method="POST"></form>
	
	<ul type="none">
		<li>�̸� : <input type ="text" name="name" form="student-form2"></li>
		<li>���� : <input type ="text" name="kor" form="student-form2"></li>
		<li>���� : <input type ="text" name="eng" form="student-form2"></li>
		<li>���� : <input type ="text" name="math" form="student-form2"></li>
		<li><input type="submit" value="���" form="student-form2"></li>
	</ul>
	
</body>
</html>	
