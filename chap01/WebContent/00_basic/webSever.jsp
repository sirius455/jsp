<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�� ���� ����</title>
</head>
<body>
	
	<h3># ������(loopback) �ּ�</h3>

<ul>
	<li>127.0.0.1 : �ڱ� �ڽ��� ����Ű�� IP�ּ�</li>
	<li>localhost : ��������� ������ �ʰ� �׳� �ڱ� �ڽ��� ��ǻ�ͷ� ����</li>
</ul>	
	 
<h3># HTTP URL�� ����</h3>

<p>��������://IP�ּ�:��Ʈ��ȣ/���ϴ� �ڿ��� ���</p>

<ul>
	<li>
	<a href="http://localhost:8080/chap01/00_basic/index.jsp">�����ϱ�</a>
	</li>
	<li>8080�� ������ �⺻������ ����ϴ� ��Ʈ��ȣ�̴�.</li>
	<li>
		https://www.naver.com
		��������: https <br>
		IP�ּ� : www.naver.com (���������� ��ü) <br>
		��Ʈ��ȣ : http�� �⺻ ��Ʈ��ȣ�� 80, https�� 443 <br>
		���ϴ� �ڿ��� ���: / (�⺻�ڿ�)
	</li>
</ul>

<h3># Domain Name Service (DNS)</h3>
<ul>
	<li>URL���� IP�ּҰ� �ԷµǾ�� �ϴ� �ڸ��� IP�ּ� ��� �ٸ� ����ε� ���ڰ� ����ִٸ� 
		�ٷ� �ش� ������ ã�ư��� ���� �ƴ϶� DNS������ �鷯 IP�ּҸ� ���� �� ã�ư��� �ȴ�.
	</li>
	<li>
	�츮 IP�ּҴ� DNS������ ��ϵǾ����� �ʱ� ������ ������ ������ �̸��� ����� �� ����
	</li>
	<li>��¥�� ������ �̸��� ����� �� �ִ� ���񽺵鵵 ���� �ִ�</li>
</ul>

<h3># �� ����</h3>
<ul>
	<li>
		24�ð� ����ϰ� �մٰ�����ڰ� �����ϸ� ����ڰ� ���ϴ� �� �������� ����(response)���ִ� ���α׷�
	</li>
	<li>����ڰ� � �� �������� ���ϴ����� ����ڰ� ��û(request)�ϴ� URL�� ���� �����Ѵ�</li>
</ul>

<h3># Dynamic Web Project </h3>
<ul>
	<li>java, src/main/java, Java Resources <br>
		- �ڹ� �ڵ带 �ۼ��ϴ� ����</li>
	<li>webapp �Ǵ� WebContent <br> 
		- �� ������ ��ϵ� �ڿ����� �����ϴ� ���� <br>
		- �����ϴ� ����ڿ��� �̰��� ��ϵ� .html, .jsp���� �������ش� <br>	
	</li>
</ul>
	
</body>
</html>