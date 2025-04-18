package com.tap.DAOimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.tap.Connection.Connections;
import com.tap.DAO.OrderItemsDAO;
import com.tap.model.OrderItems;

public class OrderItemsDAOimpl implements OrderItemsDAO {

	@Override
	public void addOrderItems(OrderItems orderitems) {

		
		try {
			Connection con=Connections.requestConnection();
			
			String INSERT="INSERT into orderitems(orderitemid,orderid,menuid,quantity,totalprice)";
			
			PreparedStatement pstmt=con.prepareStatement(INSERT);
			
			pstmt.setInt(1,orderitems.getOrderItemId());
			pstmt.setInt(2, orderitems.getOrderId());
			pstmt.setInt(3,orderitems.getMenuId());
			pstmt.setString(4, orderitems.getQuantity());
			pstmt.setInt(5,orderitems.getTotalPrice());
			
			pstmt.execute();
				
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
			
	}

	@Override
	public void updateOrderItem(OrderItems orderitems) {

		try {
			Connection con=Connections.requestConnection();
			
			String UPDATE="UPDATE orderitems where menuid=?";
			
			PreparedStatement pstmt=con.prepareStatement(UPDATE);
			
			pstmt.setInt(1,orderitems.getMenuId() );
			
			pstmt.execute();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
			
	}

	@Override
	public void deleteOrderItem(OrderItems orderitems) {

			try {
				Connection con=Connections.requestConnection();
				
				String DELETE="DELETE from orderitems where menuid=?";
				
				PreparedStatement pstmt=con.prepareStatement(DELETE);
				
				pstmt.setInt(1,orderitems.getMenuId());
				
				pstmt.execute();				
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		
	}

	@Override
	public OrderItems getOrderItems(String OrderItems) {

			try {
				Connection con=Connections.requestConnection();
				
				String QUERY="SELECT * from orderitems where orderitemid=?";
				
				Statement stmt=con.createStatement();
				
				ResultSet res=stmt.executeQuery(QUERY);
				
				if(res.next()) {
					
					int OrderItemId=res.getInt(1);
					int OrderId    =res.getInt(2);
					int MenuId     =res.getInt(3);
					String Quantity=res.getString(4);
					int TotalPrice =res.getInt(5);
					
					OrderItems orderitems=new OrderItems(OrderItemId,OrderId,MenuId,Quantity,TotalPrice);
					
					return orderitems;
					
				}				
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return null;
	}

	@Override
	public List<OrderItems> getAllOrderItems() {

		List<OrderItems> orderitemsList=new ArrayList<>();
		
			try {
				Connection con=Connections.requestConnection();
				
				String QUERY="SELECT * from orderitems";
				
				Statement stmt=con.createStatement();
				
				ResultSet res=stmt.executeQuery(QUERY);
				
				while(res.next()) {
					
					int OrderItemId=res.getInt(1);
					int OrderId    =res.getInt(2);
					int MenuId     =res.getInt(3);
					String Quantity=res.getString(4);
					int TotalPrice =res.getInt(5);
					
					OrderItems orderitems=new OrderItems(OrderItemId,OrderId,MenuId,Quantity,TotalPrice);
					
					orderitemsList.add(orderitems);
					
					
				}
					
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return null;
	}
	
		
	

}
