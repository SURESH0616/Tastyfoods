package com.tap.DAOimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.tap.Connection.Connections;
import com.tap.DAO.MenuDAO;
import com.tap.model.Menu;

public class MenuDAOimpl implements MenuDAO {
	
	
	@Override
	public void addMenu(Menu menu) {

	try {
	
		Connection con=Connections.requestConnection();
		
		String INSERT ="INSERT into menu(menuId,resturantId,itemName,description,price,isAvailable,imagePath) values(?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt=con.prepareStatement(INSERT);
		
			pstmt.setInt(1,menu.getMenuId());
			pstmt.setInt(2, menu.getResturantId());
			pstmt.setString(3, menu.getItemName());
			pstmt.setString(4, menu.getDescription());
			pstmt.setInt(5, menu.getPrice());
			pstmt.setString(6,menu.getIsAvailable());
			pstmt.setString(7, menu.getImagePath());
		
			pstmt.executeUpdate();
			
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

	
	
	@Override
	public void upadateMenu(int menuId) {

		
		try {
			Connection con=Connections.requestConnection();
			
			String UPDATE="UPDATE menu set itemname='Briyani' where resturantid=?";
			
			PreparedStatement pstmt=con.prepareStatement(UPDATE);
			
				pstmt.setInt(1, menuId);
				//pstmt.setString(2, menu.getIsAvailable());
				
				pstmt.executeUpdate();			
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	
	
	@Override
	public void deleteMenu(int menuId) {
		
		
		try {
			Connection con=Connections.requestConnection();
			
			String DELETE="DELETE from menu where menuid=?";
			
			
			PreparedStatement pstmt=con.prepareStatement(DELETE);
			
			pstmt.setInt(1,menuId); 
			
			pstmt.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	
	
	
	@Override
	public List<Menu> getMenu(int MenuId) {
		
		List<Menu> list=new ArrayList<Menu>();
		try {
			Connection con=Connections.requestConnection();
			
			String query="SELECT * from menu where resturantid=?";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, MenuId);
			
			ResultSet res = pstmt.executeQuery();
			
			if(res.next()) {
				
				int MenuId1=res.getInt(1);
				int ResturantId=res.getInt(2);
				String ItemName=res.getString(3);
				String Description=res.getString(4);
				int Price=res.getInt(5);
				String IsAvailable=res.getString(6);
				String Imagepath=res.getString(7);
				
				Menu menu=new Menu(MenuId1,ResturantId,ItemName,Description,Price,IsAvailable,Imagepath);
				list.add(menu);
				
			}
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		
		return list;
	}

	
	@Override
	public List<Menu> getAllMenus(int restaurantId) {

		List<Menu> list=new ArrayList<Menu>();
		
		
		try {
			Connection con=Connections.requestConnection();
			
			String query="SELECT * from menu where ResturantId = ?";
			
			PreparedStatement pStmt=con.prepareStatement(query);
			pStmt.setInt(1,restaurantId);
			ResultSet res = pStmt.executeQuery();
			
			while(res.next()) {
				
				int MenuId=res.getInt(1);
				int ResturantId=res.getInt(2);
				String ItemName=res.getString(3);
				String Description=res.getString(4);
				int Price=res.getInt(5);
				String IsAvailable=res.getString(6);
				String Imagepath=res.getString(7);				
				
				Menu menu=new Menu(MenuId,ResturantId,ItemName,Description,Price,IsAvailable,Imagepath);
				System.out.println(list);
				list.add(menu);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return list;
	}

}
