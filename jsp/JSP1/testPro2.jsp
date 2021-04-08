<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>WebContent/JSP1/testPro2.jsp</h1>
<%
	// 한글처리(인코딩 복구)	-> post방식으로 전송받았을때
	request.setCharacterEncoding("UTF-8");


String name = request.getParameter("nm");
int age = Integer.parseInt(request.getParameter("age"));
String ad = request.getParameter("address");

%>

이름 : <%=name %><br>
나이 : <%=age %> <br>
주소 : <%=ad %> <br>

<h2> 회원정보 확인 </h2>
<h3> 회원의 나이가 20살 미만이면 "수업 참여 불가" <br>
	  "        20살 이상이면 "수업 참여 가능" 
	  </h3>
	  <%
	  if(age>=20){
		  %>
		 <h3> "수업 참여 가능" </h3>
	  <%
	  }else{
		  %>
		  <h3> "수업 참여 불가" </h3>
	  <% }
	  %>

</body>
</html>