package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.Order;
import com.model.OrderCondition;
import com.model.Page;

public interface OrderDao {
	public int addOrder(Order order);

	public Order getOrderByOrderId(String orderId);

	public List<Order> getAllOrder();

	public List<Order> getOrderByUserId(int userId);

	public List<Order> getOrderByMid(int mid);
	
	public List<Order> getOrderByTime(@Param("mid") int mid, @Param("createtime") String createtime);

	public int getOrderCountByCondition(OrderCondition condition);

	public int updateOrderStatus(Order order);
	
	// 模糊和分页查询
	public List<Order> getOrderByConditionAndPage(@Param("condition") OrderCondition condition,
			@Param("page") Page page);
}
