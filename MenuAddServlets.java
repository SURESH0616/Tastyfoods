package com.tap.suresh;

import java.io.IOException;
import java.io.PrintWriter;

import com.tap.DAOimpl.MenuDAOimpl;
import com.tap.model.Menu;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/addmenu")
public class MenuAddServlets extends HttpServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		MenuDAOimpl mdao=new MenuDAOimpl();
		PrintWriter out= resp.getWriter();
		
		int ResturantId=Integer.parseInt(req.getParameter("ResturantId"));
		String ItemName=req.getParameter("ItemName");
		String Description=req.getParameter("Description");
		int Price=Integer.parseInt(req.getParameter("Price"));
		String IsAvailable=req.getParameter("IsAvailable");
		String ImagePath=req.getParameter("ImagePath");
		
		Menu menu= new Menu(ResturantId,ItemName,Description,Price,IsAvailable,ImagePath); 
		
		mdao.addMenu(menu);
		out.println("Menu added Succuessfully");
		
	}

}
