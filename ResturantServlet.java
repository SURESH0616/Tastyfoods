package com.tap.suresh;

import java.io.IOException;
import java.io.PrintWriter;

import com.tap.DAOimpl.ResturantDAOimpl;
import com.tap.model.Resturant;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/resturant")

public class ResturantServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ResturantDAOimpl resDAO = new ResturantDAOimpl();
		PrintWriter out= resp.getWriter();
		
		String ResturantName = req.getParameter("ResturantName");
		String CuisineType =req.getParameter("CuisineType");
		String DeliveryTime= req.getParameter("DeliveryTime");
		int AdminUserId= Integer.parseInt(req.getParameter("AdminuserId"));
		float Rating= Float.parseFloat(req.getParameter("Rating"));
		String IsActive= req.getParameter("IsActive");
		String ImagePath= req.getParameter("ImagePath");
		
		Resturant resturant = new Resturant(ResturantName,CuisineType,DeliveryTime,AdminUserId,Rating,IsActive,ImagePath);
		
		resDAO.addResturant(resturant);
		out.println("Resturant added Succuessfully");
	}
}
