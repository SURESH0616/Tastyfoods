package com.tap.DAO;

import java.util.List;

import com.tap.model.Order;

public interface OrderDAO {
	
	public void addOrder(Order order);
	public void upadateOrder(Order order);
	public void deleteOrder(Order order);
	public Order getOrder(String OrderName);
	public List<Order> getAllOrders();

}
