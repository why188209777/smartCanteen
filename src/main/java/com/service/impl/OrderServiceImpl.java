package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.OrderDao;
import com.model.Order;
import com.service.OrderService;

public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDao orderdao;
	
	
	public void setOrderdao(OrderDao orderdao) {
		this.orderdao = orderdao;
	}

	@Override
	public int addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderdao.addOrder(order);
	}

	@Override
	public Order getOrderByOrderId(String orderid) {
		// TODO Auto-generated method stub
		return orderdao.getOrderByOrderId(orderid);
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderdao.getAllOrder();
	}

	@Override
	public List<Order> getOrderByUserId(int userid) {
		// TODO Auto-generated method stub
		return orderdao.getOrderByUserId(userid);
	}

}
