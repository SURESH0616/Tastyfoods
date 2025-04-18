package com.tap.suresh;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;

import com.tap.DAOimpl.userDAOimpl;
import com.tap.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Servlet extends HttpServlet  {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	PrintWriter out=resp.getWriter();
	
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	String email=req.getParameter("email");
	String address=req.getParameter("address");
	String role=req.getParameter("role");
	LocalDate createDate=LocalDate.now();
	LocalDate loginDate=LocalDate.now();
	
	Date createdDate=Date.valueOf(createDate);
	Date lastLogin =Date.valueOf(loginDate);
	
	User user=new User(username,password,email,address,role,createdDate,lastLogin);
	
	userDAOimpl userDao=new userDAOimpl();
	
	userDao.addUser(user);
	out.println("You have succesfully registered");
	
	
}
}
