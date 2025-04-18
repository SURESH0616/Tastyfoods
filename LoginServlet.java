package com.tap.suresh;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
	
	  @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        
	        // Get username and password from request
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        // Hardcoded validation (You can connect to DB later)
	        if ("suresh".equals(username) && "123456".equals(password)) {
	            // Redirect to home page on success
	            request.getRequestDispatcher("login.jsp").forward(request, response);
	        
	        }
	  }

}
