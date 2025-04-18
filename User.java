package com.tap.model;

import java.sql.Date;

public class User {
	private int userId;
	private String userName;
	private String password;
	private String email;
	private String address;
	private String role;
	private Date createdDate;
	private Date lastLoginDate;
	
     public User() { 
     }

     
     
	public User(String userName, String password, String email, String address, String role, Date createdDate,
			Date lastLoginDate) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.role = role;
		this.createdDate = createdDate;
		this.lastLoginDate = lastLoginDate;
	}



	public User(int userId, String userName, String password, String email, String address, String role, Date createdDate, Date lastLoginDate)
	{
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.role = role;
		this.createdDate = createdDate;
		this.lastLoginDate = lastLoginDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}



}
