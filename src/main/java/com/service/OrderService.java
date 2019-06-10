package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.Order;
import com.model.OrderCondition;
import com.model.Page;

public interface OrderService {
	public int addOrder(Order order);

	public Order getOrderByOrderId(String orderId);

	public List<Order> getAllOrder();

	public List<Order> getOrderByUserId(int userId);

	public List<Order> getOrderByMid(int mid);

	public int getOrderCountByCondition(OrderCondition condition);

	public List<Order> getOrderByConditionAndPage(@Param("condition") OrderCondition condition,
			@Param("page") Page page);
}
