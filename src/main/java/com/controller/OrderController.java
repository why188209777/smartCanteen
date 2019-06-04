package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Order;
import com.service.OrderService;

@Controller
@RequestMapping(value = "order")
public class OrderController {
	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "addOrder")
	public String addOrder(String orderid, String createtime, String remark, int status, double total, int userid) {
		Order order = new Order(orderid, createtime, remark, status, total, userid);
		int addOrder = orderService.addOrder(order);
		return addOrder == 0 ? "error" : "success";
	}

	@RequestMapping(value = "getOrderByOrderId")
	public String getOrderByOrderId(String orderid) {
		Order order = orderService.getOrderByOrderId(orderid);
		return order == null ? "error" : "success";
	}

	@RequestMapping(value = "getAllOrder")
	public String getAllOrder() {
		List<Order> order = orderService.getAllOrder();
		return order == null ? "error" : "success";
	}

	@RequestMapping(value = "getAllOrder")
	public String getOrderByUserId(int userId) {
		List<Order> order = orderService.getOrderByUserId(userId);
		return order == null ? "error" : "success";
	}
}
