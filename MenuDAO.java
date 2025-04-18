package com.tap.DAO;

import java.util.List;

import com.tap.model.Menu;

public interface MenuDAO {
	
	public void addMenu(Menu menu);
	public void upadateMenu(int menuId);
	public void deleteMenu(int menuId);
	public List<Menu> getMenu(int MenuId);
	public List<Menu> getAllMenus(int restaurantId);
}
