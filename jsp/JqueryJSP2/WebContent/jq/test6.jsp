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
		// append(): 특정요소의 가장 마지막에 추가 ,prepend(): 특정요소의 가장 처음에 추가
	
	$('body').append("<h2>마지막에 추가</h2>");
	$('body').prepend("<h2>처음에 추가</h2>");
	
		// div - "내용" => "내용0","내용1","내용2"
		// 요소의 값을 변경
		
// 		$('div').append(function(i){
// 			return i;
// 		})
		
		// html() 사용하여 위의 동작과 동일하게 처리
		
		$('div').html(function(i,oldHtml){
			return oldHtml+i;
		})
		
		// table 태그에 행을 추가
		// 열 추가
		//$('tr').append("<td>홍길동</td><td>부산</td>");
		
		// 행 추가
		//$('table').append("<tr><td>홍길동</td><td>부산</td></tr>");
		
		////////////////////////////////////////////////////////
		// 2차원 배열 => JSON 타입
		var data = [
			{name:"홍길동",region:"부산"},
			{name:"강길동",region:"서울"},
			{name:"고길동",region:"경기"}
		];
		
		// div 태그안에 "이름 :ㅇㅇㅇ, 지역: ㅇㅇㅇ" 형태로 출력
		// data 배열을 사용해서 출력
		
		$('div').append(function(idx){
			//alert(data[idx]); // object 형태
			//console.log(data[idx]);
			var item = data[idx];
			//alert(item.name+"//"+item.region);
			//return data[idx]
			return item.name+" // "+item.region;
		});
		
		// 배열의 정보를 각각의 테이블에 추가
		// each() / $.each() : 선택한 여러개의 요소에 순차적으로 접근하는 메서드
		
		// $.each(function(){});
		// 배열에 접근해서 배열의 요소를 순차적으로 접근
		$.each(data,function(idx,item){
			//alert(idx+"//"+item);
			console.log(idx+"//"+item);
			console.log(item);
			console.log(item.name+"//"+item.region);
			// 그 때 테이블에 행을 추가해서 배열의 요소의 값을 추가
			$('table').append(function(){
				return "<tr><td>"+item.name+"</td><td>"+item.region+"</td></tr>";
			});
			
			
		});
		
		$(data).each(function(idx,item){			
			$('table').append(function(){
				return "<tr><td>"+item.name+"</td><td>"+item.region+"</td></tr>";
			});
			
			
		});
		
		
		
		
	
	});
</script>



</head>
<body>
	<h1>WebContent/jq/test6.jsp</h1>

	<div>내용</div>
	<div>내용</div>
	<div>내용</div>

	<hr>
	
	<table border="1">
	<tr>
	 <td>이름</td>
	 <td>지역</td>
	</tr>
	</table>
	
	
	

</body>
</html>