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

	<h1>WebContent/JSP5/updatePro.jsp</h1>

	<%	
		// 한글처리
		request.setCharacterEncoding("UTF-8");
	
		// 전달된 파라미터값 저장
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String email = request.getParameter("email");
		
		
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
		final String DBID = "root";
		final String DBPW = "1234";
		
		// 1. 드라이버 로드
		Class.forName(DRIVER);
		
		System.out.print(" 드라이버 연결 성공! ");
		
		// 2. 디비 연결
		Connection conn = 
			DriverManager.getConnection(DBURL, DBID, DBPW);
		System.out.print(" DB연결 성공! ");
		
		// 3. sql작성 & pstmt 객체 생성
		String sql = "update itwill_member set email=? where id=? and pw=?";
		
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		
		//   ? 담기
		pstmt.setString(1, email);
		pstmt.setString(2, id);
		pstmt.setString(3, pw);
		
		
		// 4. sql 실행
		pstmt.executeUpdate();
		
	
	%>



</body>
</html>