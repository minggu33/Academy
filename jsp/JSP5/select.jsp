<%@page import="java.sql.ResultSet"%>
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
	<h1>WebContent/JSP5/select.jsp</h1>
		<table border=1>
			
			<tr>
				<td>id</td>
				<td>pw</td>
				<td>email</td>
			</tr>
				
	
<%
	//모든 회원의 정보를 출력 => 테이블 생성
	
	
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
		final String DBID = "root";
		final String DBPW = "1234";
	
		// 1 드라이버로드
		Class.forName(DRIVER);
		System.out.println("드라이버 로드 성공");
		
		// 2 디비연결
		Connection conn = 
			DriverManager.getConnection(DBURL, DBID, DBPW);
		
		System.out.println("디비 연결 성공");
		
		// 3 sql작성 & pstmt 객체 생성
		String sql = "select * from itwill_member";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){	
			// 데이터가 있다.
			
			// 1) rs.getXXXXX("컬럼명");
			// -> XXXXX 가져오는 컬럼의 데이터타입에 따라서 변경
			// => rs 객체의 커서가 가리키고 있는 한줄에 데이터 중에서 찾아오는 메서드
			// 2) rs.getString(컬럼인덱스번호);
			
			// => 인덱스 번호를 사용하는 방법이 훨씬 처리속도가 빠르다.
			
			//String name = rs.getString("name");
			String id = rs.getString(1);
			String pw = rs.getString(4);
			String email = rs.getString(5); 
								
			%>
			

			<tr>
				<td><%=id %></td>
				<td><%=pw %></td>
				<td><%=email %></td>
			</tr>
		<% 
		}		
		%>
						
	</table>
			
	
		
	

</body>
</html>