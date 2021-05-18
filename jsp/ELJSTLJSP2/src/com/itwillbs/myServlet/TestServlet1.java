package com.itwillbs.myServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


// http://localhost:8088/ELJSTLJSP2/test1
public class TestServlet1 extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
         System.out.println("get방식 호출 발생!");
         
         // request 영역에 속성을 저장
         req.setAttribute("cnt", 100);
         
         // session 영역에 속성을 저장
         HttpSession session = req.getSession();
         
         session.setAttribute("cnt", 200);
         
         
         
         
         // 화면에 표시될 view 페이지 연결 - forward 방식(request, session, application)
         RequestDispatcher dis
          = req.getRequestDispatcher("/el/AttributeTest.jsp");
         
         dis.forward(req, resp);
      
   }

   
   
}