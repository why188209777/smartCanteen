package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.Order;

public interface OrderDao {
	public int addOrder(Order order);

	public Order getOrderByOrderId(String orderId);

	public List<Order> getAllOrder();

	public List<Order> getOrderByUserId(int userId);
	
	public List<Order> getOrderByMid(int mid);
	
	public List<Order> getOrderByTime(@Param("mid") int mid, @Param("createtime") String createtime);
}
