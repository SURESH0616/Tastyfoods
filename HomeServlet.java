package com.tap.suresh;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import com.tap.Connection.Connections;
import com.tap.DAO.ResturantDAO;
import com.tap.DAOimpl.ResturantDAOimpl;
import com.tap.model.Resturant;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


	@WebServlet("/home")
   public class HomeServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("home servlet called");
		
			ResturantDAOimpl rdao =new ResturantDAOimpl();
						
			List<Resturant> allResturants =rdao.getAllResturants();
			
			req.setAttribute("resturants", allResturants);
			
			RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
			
			rd.forward(req, resp);
			
			
	}
} 