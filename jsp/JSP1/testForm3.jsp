<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>WebContent/JSP1/testForm3.jsp</h1>

	<h2> 사용자 정보를 입력받아서 testPro3.jsp페이지로 전달 (출력) </h2>
	<!-- 이름, 나이, 성별(radio)-2개, 강의장(select)-7개, 취미(checkbox)-3개 -->
	
	<fieldset>
		<legend>사용자 정보를 입력 하시오.</legend>
		<form action="testPro3.jsp" method="get">
		이름 : <input type="text" name="myName"><br>
		나이  : <input type="text" name="age"><br>
		성별 : <input type="radio" name="gender" value="남">남자
		 	 <input type="radio" name="gender" value="여">여자<br>
		강의장 : <select name="classNum">
		<option value="">1강의장</option>
		<option value="1">2강의장</option>
		<option value="2">3강의장</option>
		<option value="3">4강의장</option>
		<option value="4">5강의장</option>
		<option value="5">6강의장</option>
		<option value="6">7강의장</option>		
		</select><br>
		취미 : <input type="checkbox" name="hobby" value="농구">농구
		<input type="checkbox" name="hobby" value="게임">게임
		<input type="checkbox" name="hobby" value="축구">축구<br>
		
		
		<input type="submit" value="전송">
		</form>
	</fieldset>
	
	
</body>
</html>