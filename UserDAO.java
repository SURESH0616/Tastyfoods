package com.tap.DAO;

import java.util.List;

import com.tap.model.User;

public interface UserDAO {
	
	public void addUser(User user);
	public void upadateUser(int userId);
	public void deleteUser(int userId);
	public User getUser(int userId);
	public List<User> getAllUsers();
	

}
