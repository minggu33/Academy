<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   <%@ include file="../include/header.jsp" %>
<%
	System.out.println("V : 컨트롤러에서 전달된 정보를 사용해서 화면에 출력");
%>
   
<%--    ${vo } --%>

   <h1>views/board/read.jsp</h1>
   <h2> 글 본문보기</h2>
   
   <form role="form" action="" method="post">
   		<!-- 글 번호 정보만 전달 -->
   		<input type="hidden" name="bno" value="${vo.bno }">
   </form>
  
       <div class="box-body">
       
         <div class="form-group">
           <label for="exampleInputEmail1">글번호</label>
           <input type="text" class="form-control" id="exampleInputEmail1" readonly value="${vo.bno }">
         </div>
         <div class="form-group">
           <label for="exampleInputEmail1">제목</label>
           <input type="text"  class="form-control" id="exampleInputEmail1" readonly value="${vo.title }">
         </div>
         
         <div class="form-group">
           <label for="exampleInputEmail1">글쓴이</label>
           <input type="text" class="form-control" id="exampleInputEmail1" readonly value="${vo.writer }">
         </div>

         <div class="form-group">
           <label for="exampleInputEmail1">글내용</label>
           <textarea class="form-control" rows="3" placeholder="내용을 입력하세요" readonly >${vo.content }</textarea>
         </div>
         
         <!-- <div class="form-group">
           <label for="exampleInputFile">File input</label>
           <input type="file" id="exampleInputFile">
   
           <p class="help-block">Example block-level help text here.</p>
         </div>
         
         <div class="checkbox">
           <label>
             <input type="checkbox"> Check me out
           </label>
         </div> -->
         
       </div>
       <!-- /.box-body -->
   
       <div class="box-footer">
         <button type="submit" class="btn btn-warning">수정하기</button>
         <button type="submit" class="btn btn-danger">삭제하기</button>
         <button class="btn btn-primary">목록으로</button>
       </div>
       
       
       <script>
//        	$(function(){       			
//        	});
       		$(document).ready(function(){
       			
       			// 폼태그 정보를 가져오기
       			var formObj = $("form[role='form']");
      			
       			
       			// 목록으로 버튼 클릭시
       			$(".btn-primary").click(function(){
       				location.href="/board/listAll";
       				
       			});
       			
       			// 수정하기 버튼 클릭시
	       		$(".btn-warning").on("click",function(){
	       			// /board/modify 주소로 이동 (get방식) => submit()
	       			formObj.attr("action","/board/modify");
	       			formObj.attr("method","get");
	       			formObj.submit();
	       			
	       		});
       			
       			// 삭제하기 버튼 클릭시
       			$('.btn-danger').click(function{
       				formObj.attr("action","/board/delete");
       				formObj.submit();
       			});
       			
       			
       			
       		});       
       </script>
  
   <%@ include file="../include/footer.jsp" %>