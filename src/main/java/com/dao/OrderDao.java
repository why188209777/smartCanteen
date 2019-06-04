package com.dao;

import java.util.List;

import com.model.Order;

public interface OrderDao {
	public int addOrder(Order order);

	public Order getOrderByOrderId(String orderId);

	public List<Order> getAllOrder();

	public List<Order> getOrderByUserId(int userId);
}
