package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrderDao;
import com.model.Order;
import com.model.OrderCondition;
import com.model.Page;
import com.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

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

	@Override
	public List<Order> getOrderByMid(int mid) {
		// TODO Auto-generated method stub
		return orderDao.getOrderByMid(mid);
	}

	@Override
	public List<Order> getOrderByTime(int mid, String createtime) {
		// TODO Auto-generated method stub
		return orderDao.getOrderByTime(mid, createtime);
	}
	public int getOrderCountByCondition(OrderCondition condition) {
		// TODO Auto-generated method stub
		return orderDao.getOrderCountByCondition(condition);
	}

	@Override
	public List<Order> getOrderByConditionAndPage(OrderCondition condition, Page page) {
		// TODO Auto-generated method stub
		return orderDao.getOrderByConditionAndPage(condition, page);
	}

}
