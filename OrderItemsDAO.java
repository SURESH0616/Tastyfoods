package com.tap.DAO;

import java.util.List;

import com.tap.model.OrderItems;

public interface OrderItemsDAO {

	public void addOrderItems(OrderItems orderitems);
	public void updateOrderItem(OrderItems orderitems);
	public void deleteOrderItem(OrderItems orderitems);
	public OrderItems getOrderItems(String OrderItems);
	public List<OrderItems>getAllOrderItems();

}
