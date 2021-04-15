<%@page import="com.itwillbs.member.MemberBean"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>WebContent/member/updateForm.jsp</h1>
		
		<%
		
			String id = (String) session.getAttribute("id");
		
		if(id == null){
			response.sendRedirect("main.jsp");
		}
		
		request.setCharacterEncoding("UTF-8");
		
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
		final String DBID = "root";
		final String DBPW = "1234";
		
		Class.forName(DRIVER);
		
		Connection conn 
		= DriverManager.getConnection(DBURL, DBID, DBPW);
		
		String sql 
		= "select * from itwill_member where id=?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, id);
		
		ResultSet rs = pstmt.executeQuery();
		
		MemberBean mb = null;
		
		if(rs.next()){
			mb = new MemberBean();
			mb.setId(rs.getString("id"));
			mb.setPw(rs.getString("pw"));
			mb.setName(rs.getString("name"));
			mb.setAge(rs.getInt("age"));
			mb.setGender(rs.getString("gender"));
			mb.setEmail(rs.getString("email"));
			mb.setRegdate(rs.getTimestamp("regdate"));
			
		}
		
		
		
		
		%>
		
		
		
		
		
		
		
		
		<h2> 회원정보수정 </h2>
		<!-- 아이디, 비밀번호, 이름, 나이, 성별(라디오버튼), 이메일 -->
		<fieldset border="1">
			<legend>아이티윌 회원정보 수정 페이지</legend>
			
			<%if(mb != null){ %>
				<form action="updatePro.jsp" method="post">
				<!-- 	input 태그
						readonly 속성 : 값을 변경 x, 데이터 전송(submit) 가능
						disabled 속성 : 값을 변경 x, 데이터 전송(submit) 불가능
				 -->
				아이디 : <input type="text" name="id" value="<%=mb.getId()%>" readonly><br>
				비밀번호 : <input type="password" name="pw" placeholder="비밀번호를 입력하세요."><br>
				<hr>
				이름 : <input type="text" name="name" value="<%=mb.getName()%>"><br>
				나이 : <input type="number" name="age" value="<%=mb.getAge()%>"><br>
				성별 : <input type="radio" name="gender" value="남"
				<% 
					if(mb.getGender().equals("남")){
						%>
						checked
						<%
					}
				
				%>
				> 남
					 <input type="radio" name="gender" value="여"
					 	<% 
					if(mb.getGender().equals("여")){
						%>
						checked
						<%
					}
				
				%>
					 > 여<br>
				이메일 : <input type="email" name="email" value="<%=mb.getEmail()%>"><br>
					<hr>
				<input type="submit" value="회원정보수정"> 
			
				</form>
				<%} %>
		</fieldset>
</body>
</html>