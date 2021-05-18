package com.itwillbs.myServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("get 방식 호출");
		
		// request 객체에 정보 저장
		
		String[] subjects = {"java","jsp","python","DB","WEB"};
		
		request.setAttribute("subjects", subjects);
		
		//
		ArrayList<String> movie = new ArrayList<String>();
		movie.add("지금만나러갑니다.");
		movie.add("인셉션");
		movie.add("아이언맨");
		movie.add("월터의 상상은 현실이된다.");
		movie.add("신세계");
		
		request.setAttribute("movie", movie);
		
		
		
		
		// forward 방식으로 페이지 처리
		// "array_collection.jsp"
		
		RequestDispatcher dis
		 = request.getRequestDispatcher("/el/array_collection.jsp");

		dis.forward(request, response);
		
		
	}

	
}
