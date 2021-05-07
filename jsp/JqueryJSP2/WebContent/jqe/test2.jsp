<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="../js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
	
	$('a').click(function(){
		
			$(this).css('background-color','skyblue');
			
			// 기본기능-하이퍼링크를 동작X	
			// event.preventDefault();	
			
			// 페이지 이동 이벤트 동작 X
			// return false;
			
			
			// return; 페이지 이동 O
			$(this).unbind();
		});
		
		$('h3').click(function(){
			$(this).append("+");
			
			// 이벤트 종료- 이벤트 한번만 실행하고 종료
			$(this).unbind();
		});
	
		// textarea에 글자를 입력 -> 200자 이상일경우 -> 빨강으로 변경 출력
		// 글자를 입력할때마다 글자수만큼 감소 출력
		
		// 1) 키보드 입력시 - 입력된 글자수 체크
		$('textarea').keyup(function(){
		// 2) 200-글자수 => 원래 h2태그에 표시
			var tmp = $(this).val().length;
			// alert(tmp);
			$("#txtCnt").html(200-tmp);
		});
	
			var colorCnt = 200-tmp;
		// 글자의 길이가 200보다 크면 -> RED
		//  		"          -> BLACK
		  if( colorCnt >= 0 ){ // 양수-200자 포함
			   $("#txtCnt").css('color','black');
		   }else{ // 음수 - 200 초과
			   $("#txtCnt").css('color','red');
		   }
	});

</script>
</head>
<body>
	<h1>WebContent/jqe/test2.jsp</h1>
	
	<h2><a href="http://www.naver.com">네이버 페이지로</a></h2>
	<h3> 테스트 </h3>
	
	<hr>
	<h2 id="txtCnt">200</h2>
	<textarea rows="5" cols="700"></textarea>
	
</body>
</html>