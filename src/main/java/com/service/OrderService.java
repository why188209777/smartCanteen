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
	
	public List<Order> getOrderByTime(int mid,String createtime);

	public int getOrderCountByCondition(OrderCondition condition);

	public int updateOrderStatus(Order order);
	
	public List<Order> getOrderByConditionAndPage(@Param("condition") OrderCondition condition,
			@Param("page") Page page);
}
