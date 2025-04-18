package com.tap.DAOimpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tap.Connection.Connections;
import com.tap.DAO.OrderDAO;
import com.tap.model.Order;

public class OrderDAOimpl implements OrderDAO {

	@Override
	public void addOrder(Order order) {

		try {
			Connection con=Connections.requestConnection();
			
			String INSERT="INSERT into oder(orderid,resturantid,userid,orderdate,totalamount,status,paymentmode) values(?,?,?,?,?,?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(INSERT);
			
			pstmt.setInt(1,order.getOrderId());
			pstmt.setInt(2,order.getResturantId());
			pstmt.setInt(3,order.getUserId());
			pstmt.setDate(4,order.getOrderDate());
			pstmt.setInt(5,order.getTotalAmount());
			pstmt.setString(6, order.getStatus());
			pstmt.setInt(7,order.getPaymentMode());
			
			pstmt.execute();
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void upadateOrder(Order order) {

		try {
			Connection con=Connections.requestConnection();
			
			String UPDATE="UPDATE order where paymentmode=?";
			
			PreparedStatement pstmt=con.prepareStatement(UPDATE);
			
			pstmt.setInt(1, order.getPaymentMode());
			
			pstmt.execute();
			
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
			
	}

	@Override
	public void deleteOrder(Order order) {

		
		try {
			Connection con=Connections.requestConnection();
			
			String DELETE="DELETE from order where status=?";
			
			PreparedStatement pstmt=con.prepareStatement(DELETE);
			
			pstmt.setString(1,order.getStatus());
			
			pstmt.execute();
			
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}

	@Override
	public Order getOrder(String OrderName) {

		try {
			Connection con=Connections.requestConnection();
			
			String Query="SELECT * from order where resturantid=?";
			
			Statement stmt=con.createStatement();			
			
			ResultSet res=stmt.executeQuery(Query);
			
			if(res.next()) {
				
				int OrderId=res.getInt(1);
				int ResturantId=res.getInt(2);
				int UserId     =res.getInt(3);
				Date OrderDate =res.getDate(4);
				int TotalAmount=res.getInt(5);
				String Status  =res.getString(6);
				int PaymentMode=res.getInt(7);
				
				Order order=new Order(OrderId,ResturantId,UserId,OrderDate,TotalAmount,Status,PaymentMode);
				
				return order;	
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return null;
	}
	
	
	@Override
	public List<Order> getAllOrders() {

		
		List<Order> orderList=new ArrayList<>();
		
		try {
			Connection con=Connections.requestConnection();
			
			String QUERY="SELECT * from order";
			
			Statement stmt=con.createStatement();
			
			ResultSet res=stmt.executeQuery(QUERY);
			
			while(res.next()) {
				
				int OrderId    =res.getInt(1);
				int ResturantId=res.getInt(2);
				int UserId     =res.getInt(3);
				Date OrderDate =res.getDate(4);
				int TotalAmount=res.getInt(5);
				String Status  =res.getString(6);
				int PaymentMode=res.getInt(7);
				
				Order order=new Order(OrderId,ResturantId,UserId,OrderDate,TotalAmount,Status,PaymentMode);
				
				orderList.add(order);
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
