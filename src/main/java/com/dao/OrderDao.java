package com.dao;

import java.util.List;

import com.model.Order;
import com.model.OrderCondition;

public interface OrderDao {
	public int addOrder(Order order);

	public Order getOrderByOrderId(String orderId);

	public List<Order> getAllOrder();

	public List<Order> getOrderByUserId(int userId);

	public List<Order> getOrderByMid(int mid);

	// 条件分页查询
	public List<Order> getOrderByCondition(OrderCondition condition);
}
