<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<form id="ticket" action="http://localhost:8080/chap02/movie/ticket" method="Get"></form>
	
	<img src="./��ȭ���.png" width="1000"><br><br><br>
	
	<input type="radio" value="morning" name="play_time" id="morning" form="ticket" > 
    <label for="morning"> ���� </label>
    <input type="radio" value="normal" name="play_time" id="normal" form="ticket" checked> 
    <label for="normal"> �Ϲ� </label> 
    <input type="radio" value="prime" name="play_time" id="prime" form="ticket" > 
    <label for="prime"> ������ </label> 
    <input type="radio" value="night" name="play_time" id="night" form="ticket" > 
    <label for="night"> �ɾ� </label> <br>
    
         ����  <input name=adult form="ticket" type="text" size="15"><br>
         û�ҳ�  <input name=youth form="ticket" type="text" size="15"><br> 
         �ôϾ� <input name=senior form="ticket" type="text" size="15"><br>
         �����  <input name=disabled form="ticket" type="text" size="15"><br>  
         
    <input type="submit" style="padding: 15px;"
             	form="ticket" value="�����ϱ�">     

</body>
</html>