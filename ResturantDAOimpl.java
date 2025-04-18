package com.tap.DAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tap.Connection.Connections;
import com.tap.DAO.ResturantDAO;
import com.tap.model.Resturant;


public  class ResturantDAOimpl implements ResturantDAO {
	
	
		@Override
		public void addResturant(Resturant resturant) {
	
		try {
		
			Connection con=Connections.requestConnection();
			
			String INSERT=" INSERT into resturant(resturantname,cuisineType,deliveryTime,adminUserId,rating,isActive,imagepath) values(?,?,?,?,?,?,?) ";
			
			PreparedStatement pstmt=con.prepareStatement(INSERT);
			
			pstmt.setString(1,resturant.getResturantName());
			pstmt.setString(2,resturant.getCuisineType());
			pstmt.setString(3, resturant.getDeliveryTime());
			pstmt.setInt(4, resturant.getAdminuserId());
			pstmt.setFloat(5, resturant.getRating());
			pstmt.setString(6,resturant.getIsActive());
			pstmt.setString(7,resturant.getImagepath());
			
			pstmt.executeUpdate();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
	}
	}


		@Override
		public void upadateResturant(int resturantId) {

			try {
				Connection con=Connections.requestConnection();
				
				String UPDATE="UPDATE resturant set resturantname='Student Resturant' where resturantid=?";
				
				PreparedStatement pstmt=con.prepareStatement(UPDATE);
				
				pstmt.setInt(1,resturantId);
				//pstmt.setInt(2, resturant.getRating());
				
				pstmt.executeUpdate();
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}


		@Override
		public void deleteResturant(int resturantId) {

			try {
				Connection con=Connections.requestConnection();
				
				String DELETE="DELETE from resturant where resturantid=?";
				
				PreparedStatement pstmt=con.prepareStatement(DELETE);
				
				pstmt.setInt(1,resturantId);
				
				pstmt.executeUpdate();
			
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


		@Override
		public Resturant getResturant(int resturantId) {
			
			try {
				Connection con=Connections.requestConnection();
				
				String query="SELECT * from resturant where resturantid=?";
				
				Statement stmt=con.createStatement();
				ResultSet res=stmt.executeQuery(query);
				while(res.next()) {
					
					int resturantid=res.getInt(1);
					String resturantName=res.getString(2);
					String cuisineType=res.getString(3);
					String deliveryTime=res.getString(4);
					int adminuserId=res.getInt(5);
					float rating=res.getFloat(6);
					String isActive=res.getString(7);
					String imagepath=res.getString(8);
					
					Resturant resturant =new Resturant(resturantid,resturantName,cuisineType,deliveryTime,adminuserId,rating,isActive,imagepath);
					
					return resturant;
				
				}
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			return null;
		}


		
		
		@Override
		public   ArrayList<Resturant> getAllResturants() {
			ArrayList<Resturant> List=new ArrayList<Resturant>();

			try {
				
				Connection con=Connections.requestConnection();
				
				String Query="SELECT * from resturant ";
				
				Statement stmt=con.createStatement();
							
				ResultSet res=stmt.executeQuery(Query);
				
				while(res.next()) {
				Resturant resturant =new Resturant();
				
				resturant.setResturantId(res.getInt(1));
				resturant.setResturantName(res.getString(2));			
				resturant.setCuisineType(res.getString(3));
				resturant.setDeliveryTime(res.getString(4));
				resturant.setAdminuserId(res.getInt(5));
				resturant.setRating(res.getFloat(6));
				resturant.setIsActive(res.getString(7));
				resturant.setImagepath(res.getString(8));
				
				
				List.add(resturant);
				}
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
		}

		
			
			return List;
		}
	
}
