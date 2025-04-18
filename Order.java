package com.tap.model;

import java.sql.Date;

public  class Order {
	
	private int orderId;
	private int resturantId;
	private int userId;
	private Date orderDate;
	private int totalAmount;
	private String status;
	private int paymentMode;
	
	public Order() {
		
	}
	
	
	public Order(int resturantId, int userId, Date orderDate, int totalAmount, String status, int paymentMode) {
		super();
		this.resturantId = resturantId;
		this.userId = userId;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		this.status = status;
		this.paymentMode = paymentMode;
	}


	public Order(int orderId, int resturantId, int userId, Date orderDate, int totalAmount, String status,
			int paymentMode) {
		super();
		this.orderId = orderId;
		this.resturantId = resturantId;
		this.userId = userId;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		this.status = status;
		this.paymentMode = paymentMode;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getResturantId() {
		return resturantId;
	}


	public void setResturantId(int resturantId) {
		this.resturantId = resturantId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public int getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	

	
	

}
