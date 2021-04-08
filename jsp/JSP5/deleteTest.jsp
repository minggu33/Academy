<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>WebContent/JSP5/deleteTest.jsp</h1>
	
	
	<%
		int idx = 11;
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
		final String DBID = "root";
		final String DBPW = "1234";
		
		// 1단계 드라이버 로드
		// 2단계 디비 연결
		// 3단계 sql구문 작성 & pstmt 객체 생성
		//			? 추가
		//			(sql - delete 구문, 특정 회원만 삭제(12번))
		// 4단계  sql 구문 실행
		
		
		Class.forName(DRIVER);
		
		System.out.print(" 드라이버 연결 성공! ");
		
		Connection conn = 
			DriverManager.getConnection(DBURL, DBID, DBPW);
		System.out.print(" DB연결 성공! ");
		
		String sql = "delete from itwill_member where idx=?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, idx);
	
		pstmt.executeUpdate();
	
	
	%>

</body>
</html>