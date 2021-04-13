<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WebContent/member/loginPro.jsp</h1>
	
	
	<%
		// 한글처리
		request.setCharacterEncoding("UTF-8");
		
		// 전달정보를 저장(자바빈 객체 - 액션태그) id, pw
	%>
		<jsp:useBean id="mb" class="com.itwillbs.member.MemberBean"/>
	
		<jsp:setProperty property="*" name="mb"/>
	
	<% 	
		
		System.out.println("전달정보 : "+mb);
		////////////////////////////////////////////////
		// DB 이동후 로그인 상태 판별
		
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
		final String DBID = "root";
		final String DBPW = "1234";
		
		// 1. 드라이버 로드
		Class.forName(DRIVER);
		
		// 2. 디비연결
		Connection conn = 
				DriverManager.getConnection(DBURL, DBID, DBPW);
		
		// 3 sql 구문작성 & pstmt 객체 생성
		String sql 
		= "select pw from itwill_member where id=?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		// ??
		pstmt.setString(1, mb.getId());
		
		
		// 4 sql 구문 실행
		
		ResultSet rs= pstmt.executeQuery();
		
		// 5 데이터 처리
		if(rs.next()){	// sql 구문의 결과가 있을때
			// 회원이다.
			// 비밀번호를 사용해서 본인확인
			if(mb.getPw().equals(rs.getString("pw"))){
				// 비밀번호가 같다.(+회원이다) => 본인 => 로그인 성공
				
				// 로그인 성공의 의미로 회원 ID정보를 session 내장객체에 저장
				session.setAttribute("id", mb.getId());
				// main.jsp 페이지 이동
			//	response.sendRedirect("main.jsp");
				%>
				<script type="text/javascript">
					alert(" 로그인 성공");
					location.href="main.jsp";
				</script>
				<% 
				
			}else{
				// 비밀번호가 다름.(+회원이다)
				%>
				
				<script type="text/javascript">
					alert("비밀번호 오류!!");
					history.back();
				</script>
				
				<% 
			}
		}else{
			// 비회원이다.
			%>
			
			<script type="text/javascript">
				// confirm(" 비회원 입니다. 회원가입 하시겠습니까?")
				// Y - 회원가입 페이지 이동, N- 페이지 뒤로 가기
				var r = confirm("비회원입니다. 회원가입하시겠습니까?");
				
				if(r){
					location.href="insertForm.jsp";
					
				}else{
					history.back();
				}								
			
			</script>
			
			<% 
		}
	
	%>
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>