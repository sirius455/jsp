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
	
	<img src="./영화요금.png" width="1000"><br><br><br>
	
	<input type="radio" value="morning" name="play_time" id="morning" form="ticket" > 
    <label for="morning"> 조조 </label>
    <input type="radio" value="normal" name="play_time" id="normal" form="ticket" checked> 
    <label for="normal"> 일반 </label> 
    <input type="radio" value="prime" name="play_time" id="prime" form="ticket" > 
    <label for="prime"> 프라임 </label> 
    <input type="radio" value="night" name="play_time" id="night" form="ticket" > 
    <label for="night"> 심야 </label> <br>
    
         성인  <input name=adult form="ticket" type="text" size="15"><br>
         청소년  <input name=youth form="ticket" type="text" size="15"><br> 
         시니어 <input name=senior form="ticket" type="text" size="15"><br>
         장애인  <input name=disabled form="ticket" type="text" size="15"><br>  
         
    <input type="submit" style="padding: 15px;"
             	form="ticket" value="예매하기">     

</body>
</html>