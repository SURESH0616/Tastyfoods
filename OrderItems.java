package com.tap.model;

public class OrderItems {
	
	private int OrderItemId;
	private int OrderId;
	private int MenuId;
	private String Quantity;
	private int TotalPrice;
	
	
	public OrderItems() {
		
	}

	public OrderItems(int orderId, int menuId, String quantity, int totalPrice) {
		super();
		OrderId = orderId;
		MenuId = menuId;
		Quantity = quantity;
		TotalPrice = totalPrice;
	}

	
	public OrderItems(int orderItemId, int orderId, int menuId, String quantity, int totalPrice) {
		super();
		OrderItemId = orderItemId;
		OrderId = orderId;
		MenuId = menuId;
		Quantity = quantity;
		TotalPrice = totalPrice;
	}

	public int getOrderItemId() {
		return OrderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		OrderItemId = orderItemId;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public int getMenuId() {
		return MenuId;
	}

	public void setMenuId(int menuId) {
		MenuId = menuId;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public int getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}
	
	
}
