<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="../js/jquery-3.6.0.js"></script>

<!-- 추가 기능을 위한 라이브러리 추가 -->
<script src="../js/jquery.innerfade.js"></script>

<style type="text/css">
ul{list-style: none;}
</style>

<script type="text/javascript">
   $(document).ready(function(){
	   $('#news').innerfade({
		   animationtype:'slide',
	   		speed:700,
	   		type:"random_start"
	   });	
	   		
   });
</script>
</head>
<body>
	<h1>WebContent/jqe/test5.jsp</h1>
	
	<ul id="news">
		<li>
		<img src="../jq/1.jpg">
		</li>
		<li>
		<img src="../jq/2.jpg">
		</li>
		<li>
		<img src="../jq/4.jpg">
		</li>
	</ul>
	
	
	
	
</body>
</html>