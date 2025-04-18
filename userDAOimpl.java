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
import com.tap.DAO.UserDAO;
import com.tap.model.User;

public class  userDAOimpl implements UserDAO {
	
	
	@Override
	public void addUser(User user) {
		
		try {
			Connection con=Connections.requestConnection();
	
	String INSERT_QUERY = "INSERT into user(username,password,email,address,role,createdDate,lastloginDate) values(?,?,?,?,?,?,?)";
		   
	 PreparedStatement stmt=con.prepareStatement(INSERT_QUERY);
			
			stmt.setString(1,user.getUserName());
			stmt.setString(2,user.getPassword());
			stmt.setString(3,user.getEmail());
			stmt.setString(4,user.getAddress());
			stmt.setString(5,user.getRole());
			stmt.setDate(6,user.getCreatedDate());
			stmt.setDate(7,user.getLastLoginDate());
			
			stmt.executeUpdate();
			
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
	   } 
		catch (SQLException e) {
		e.printStackTrace();
	}
	}


	@Override
	public void upadateUser(int userId) {

		try {
			Connection con=Connections.requestConnection();
			
			String Update="UPDATE user set password=? where userid=?";
			
			PreparedStatement pstmt=con.prepareStatement(Update);
			
			pstmt.setInt(1,userId);
			//pstmt.setString(2,user.getUserName());
			
			pstmt.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
		try {
			Connection con=Connections.requestConnection();
			
			String DELETE="DELETE from user where userid=?";
			
			PreparedStatement pstmt=con.prepareStatement(DELETE);
			
			pstmt.setInt(1,userId);
			
			pstmt.executeUpdate();
			
			 
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}




	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		
		try {
			Connection con=Connections.requestConnection();
			
			String query="SELECT * from user where username=?";
			
			Statement stmt=con.createStatement();
			
			ResultSet res=stmt.executeQuery(query);
			
			if(res.next()) {
				int userid=res.getInt(1);
				String username=res.getString(2);
				String password=res.getString(3);
				String email=res.getString(4);
				String address=res.getString(5);
				String role=res.getString(6);
				Date createDate=res.getDate(7);
				Date loginDate=res.getDate(8);
				
				User user=new User( userid,username,password,email,address,role,createDate,loginDate);
				
				return user;
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}


	@Override
	public List<User> getAllUsers() {

		List<User> List=new ArrayList<>();
		
		try {
			Connection con=Connections.requestConnection();
			
			String query="SELECT * from user";
			
			Statement stmt=con.createStatement();
			
			ResultSet res=stmt.executeQuery(query);
			
			while(res.next()) {
				int userid=res.getInt(1);
				String username=res.getString(2);
				String password=res.getString(3);
				String email=res.getString(4);
				String address=res.getString(5);
				String role=res.getString(6);
				Date createDate=res.getDate(7);
				Date loginDate=res.getDate(8);
				
				User user=new User( userid,username,password,email,address,role,createDate,loginDate);
				
				List.add(user);
				
				
			}
			
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return List;
	}

}
