<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WebContent/jstl/core/formatDate.jsp</h1>

	<c:set var="date" value="<%=new Date() %>" />
	
	${date }<br>
	<hr>
	<!-- 날짜정보 출력 -->
	<fmt:formatDate value="${date }"/>
	<hr>
	
	<!-- 시간정보 출력 -->
	<fmt:formatDate value="${date }" type="time"/>
	<hr>
	<!-- 날짜 + 시간정보 출력 -->
	<fmt:formatDate value="${date }" type="both"/>
	
	<hr>
	
	<fmt:formatDate value="${date }" dateStyle="full"/><br>
	<fmt:formatDate value="${date }" dateStyle="long"/><br>
	<fmt:formatDate value="${date }" dateStyle="medium"/><br>
	<fmt:formatDate value="${date }" dateStyle="short"/><br>
	
	<hr>
	<fmt:formatDate value="${date }" type="time" timeStyle="full"/><br>
	<fmt:formatDate value="${date }" type="time" timeStyle="long"/><br>
	<fmt:formatDate value="${date }" type="time" timeStyle="medium"/><br>
	
	<hr><hr>
	<!-- 2021년 5월 14일 (금) 오후 4시 16분 --초 -->
	<fmt:formatDate value="${date }" type="both" dateStyle="long" timeStyle="long"/><br>
	
	<!-- 2021/5/14(금) -->
	<fmt:formatDate value="${date }" pattern="yyyy/MM/dd(E)"/><br>
	
	<!-- (오후) 04:23:00 -->
	<fmt:formatDate value="${date }" type="time"
					pattern="(a) hh:mm:ss"/><br>
					
					
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>