package com.tap.suresh;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.tap.DAOimpl.MenuDAOimpl;
import com.tap.DAOimpl.ResturantDAOimpl;
import com.tap.model.Menu;
import com.tap.model.Resturant;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/menu")
public class MenuServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("menu servlet called");
		
		MenuDAOimpl rdao =new MenuDAOimpl();
		
		int id = Integer.parseInt(req.getParameter("restaurantId"));
					
		List<Menu> allMenus =rdao.getAllMenus(id);
		
		for(Menu menu:allMenus) {
			System.out.println(menu);
			
		}
		req.setAttribute("menus", allMenus);
		
		RequestDispatcher rd=req.getRequestDispatcher("menu.jsp");
		
		rd.forward(req, resp);
		
		
		
		
	}

}
