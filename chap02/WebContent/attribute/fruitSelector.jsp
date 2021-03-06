<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>fruitSelector.jsp</title>

<style>
#fruit-title {
	text-align:center;
}

#fruit-container{
	display: grid;
	grid-template-columns: 1fr 1fr 1fr;
	width: 600px;
	margin: auto;
	height: 100px;
	
	
}

#fruit-container > div {
	margin: 10px;
	height: 200px;
	background-size: contain;
	background-repeat: no-repeat;
	background-position: center;
	border: solid 1px black;
}

#pineapple {
	background-image: url('https://t1.daumcdn.net/cfile/tistory/999455375DB92A1530');
}
#orange {
	background-image: url('https://ww.namu.la/s/a3a55ed786fa2a473b7d26f13057d80eed4fa6bad05fcaca9c62b891fdf6560f4e90b09291872978ee4e7e598121b8ce8b078e7a3c0f12f6ab935eae19c219b7566758dbf4810314d5e738843ce2f82e91449825f190445c071bed6ad4886e1fad42396ae49fb7250dabd3b05c91f833');
}
#mango {
	background-image: url('data:image/jpeg;base64,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')
}



</style>

</head>
<body>
	
	<h3 id="fruit-title">?????? ??????????</h3>

<!-- data-* : ???? ?????? ?????? ???? ???????????????? ?????? ???? ?????????? ?????????? -->
<div id="fruit-container">
	<div id="pineapple" class="fruit" data-fruit-name="pineapple" data-fruit-price="5000"></div>
	<div id="orange" class="fruit" data-fruit-name="orange" data-fruit-price="1000"></div>
	<div id="mango" class="fruit" data-fruit-name="mango" data-fruit-price="2500"></div>	
</div>

<script src="./js/fruit.js">
	
</script>

	
</body>
</html>