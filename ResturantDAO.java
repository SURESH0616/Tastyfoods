package com.tap.DAO;

import java.util.List;

import com.tap.model.Resturant;

public interface ResturantDAO {
	
	public void addResturant(Resturant resturant);
	public void upadateResturant(int resturantId);
	public void deleteResturant(int resturantId);
	public Resturant getResturant(int resturantId);
	public  List<Resturant> getAllResturants();
		
	
}
