<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>WebContent/JSP1/testPro3.jsp</h1>
<% 
String name = request.getParameter("myName");
int age = Integer.parseInt(request.getParameter("age"));
String gender = request.getParameter("gender");
int classNum = Integer.parseInt(request.getParameter("classNum"));

	// 취미 (동일한 이름의 파라미터를 처리)
String hobby[] = request.getParameterValues("hobby");
%>

 이름 : <%=name %>  <br>
 나이 : <%=age %><br>
 성별 : <%=gender %> <br>
 강의실 : <%=classNum+1 %>강의장 <br>
 취미 : <%
 		if(hobby != null){
 for(int i=0;i<hobby.length;i++){
	 out.print(hobby[i]+" ");
	 }
 }
 %>

</body>
</html>