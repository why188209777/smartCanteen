package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrderDao;
import com.model.Order;
import com.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDao orderDao;
	
	
	public void setOrderdao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public int addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.addOrder(order);
	}

	@Override
	public Order getOrderByOrderId(String orderId) {
		// TODO Auto-generated method stub
		return orderDao.getOrderByOrderId(orderId);
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderDao.getAllOrder();
	}

	@Override
	public List<Order> getOrderByUserId(int userId) {
		// TODO Auto-generated method stub
		return orderDao.getOrderByUserId(userId);
	}

}
