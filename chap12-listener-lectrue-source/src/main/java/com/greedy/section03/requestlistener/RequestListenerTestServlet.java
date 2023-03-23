package com.greedy.section03.requestlistener;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request")
public class RequestListenerTestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("request listener 확인용 서블릿");
		
		request.setAttribute("username", "honggildong");
		request.setAttribute("age", 20);
		request.setAttribute("gender", "M");
		
		request.setAttribute("username", "hong");
		
		request.removeAttribute("gender");
	}
}