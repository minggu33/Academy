<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
   
   
  <%@ include file="../include/header.jsp" %>

	<h1>views/board/listAll.jsp</h1>

	<h2>글 목록 </h2>
	<%
	// request.getAttribute("boardList");
	%>
<%-- 	${boardList } --%>
	
	<table class="table table-bordered">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>글쓴이</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
	
	<c:forEach var="boardVO" items="${boardList }">
		<tr>
			<td>${boardVO.bno }</td>
			<td>
			<a href="/board/read?bno=${boardVO.bno }">
				${boardVO.title }
			</a>
			</td>
			<td>${boardVO.writer }</td>
			<td>
				<fmt:formatDate value="${boardVO.regdate }" pattern="yyyy-MM-dd HH:mm:ss"/>
			</td>
			<td>
				<span class="badge bg-red">	${boardVO.viewcnt } </span>
			</td>
		</tr>
	</c:forEach>
	
	
	</table>



	<script type="text/javascript">
		var result = '${result}';
// 		alert(result);
		if(result=='success'){
			alert(" 정상 처리 완료 ! ");
		}
	
	</script>


















   <%@ include file="../include/footer.jsp" %>