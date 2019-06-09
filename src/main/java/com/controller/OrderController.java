package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Order;
import com.model.OrderCondition;
import com.model.Page;
import com.service.OrderService;

@Controller
@RequestMapping(value = "order")
public class OrderController {
	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "addOrder")
	@ResponseBody
	public boolean addOrder(String orderid, String createtime, String remark, int status, double total, int userid,int mid) {
		Order order = new Order(orderid, createtime, remark, status, total, userid, mid);
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
	
	@RequestMapping(value = "getOrderByMid")
	@ResponseBody
	public List<Order> getOrderByMid(int mid) {
		List<Order> list = orderService.getOrderByMid(mid);
		return list;
	}
	
	@RequestMapping(value = "getOrderByConditionAndPage")
	@ResponseBody
	public Object getOrderByConditionAndPage(String startTime, String endTime, int status, int pageIndex, int pageSize) {
		OrderCondition condition = new OrderCondition(startTime, endTime, status);
		int count = orderService.getOrderCountByCondition(condition);
		int totalSize = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
		Page page = new Page(1, pageSize, totalSize);
		List<Order> list = orderService.getOrderByConditionAndPage(condition, page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", page);
		map.put("list", list);
		return map;
	}
}
