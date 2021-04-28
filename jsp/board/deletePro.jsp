<%@page import="com.itwillbs.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WebContent/board/deletePro.jsp</h1>
	
	<% 
		// 전달정보 저장 - pageNum
		String pageNum = request.getParameter("pageNum");
		// 전달정보 저장 - 액션태그 (자바빈) - num, pass				
	%>
	<jsp:useBean id="bb" class="com.itwillbs.board.BoardBean"/>
	<jsp:setProperty property="*" name="bb"/>
	
	<% 
		System.out.println("삭제 정보 : "+bb);
		
		// BoardDAO 객체 생성
		BoardDAO bdao = new BoardDAO();		
		
		
		// -> 글 정보를 사용해서 글 삭제 기능(메서드) deleteBoard(bb)
		bdao.deleteBoard(bb); 
				
		// 처리결과를 1(정상처리), 0(오류-비밀번호 오류), -1(오류-글 없음) 리턴
		int check = bdao.updateBoard(bb);
		
		System.out.println("check : "+check);
				
		// 처리결과에 따른 페이지 이동
		if(check==1){
			%>
			<script type="text/javascript">
				alert("정보수정 완료!");
				location.href="list.jsp?pageNum=<%=pageNum%>";	 		
			</script>			
			<% 
		}
		else if(check == 0){
		// 0 => (비밀번호 오류 - 수정실패)
			%>
			<script type="text/javascript">
				alert("비밀번호 오류!");
				history.back();			
			</script>
			<% 			
		}else{
		// -1 => (없는 글 접근 - 수정실패)
			%>
			<script type="text/javascript">
				alert("비밀번호 오류!");
				history.back();			
			</script>
			<% 			
		}
	%>
	
	

</body>
</html>