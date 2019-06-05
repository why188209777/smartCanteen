package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Order;
import com.service.OrderService;

@Controller
@RequestMapping(value = "order")
public class OrderController {
	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "addOrder")
	@ResponseBody
	public boolean addOrder(String orderid, String createtime, String remark, int status, double total, int userid) {
		Order order = new Order(orderid, createtime, remark, status, total, userid);
		int addOrder = orderService.addOrder(order);
		return addOrder == 0 ? false : true;
	}

	@RequestMapping(value = "getOrderByOrderId")
	@ResponseBody
	public Order getOrderByOrderId(String orderid) {
		Order order = orderService.getOrderByOrderId(orderid);
		return order;
	}

	@RequestMapping(value = "getAllOrder")
	@ResponseBody
	public List<Order> getAllOrder() {
		List<Order> list = orderService.getAllOrder();
		return list;
	}

	@RequestMapping(value = "getOrderByUserId")
	@ResponseBody
	public List<Order> getOrderByUserId(int userId) {
		List<Order> list = orderService.getOrderByUserId(userId);
		return list;
	}
}
