package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Item;
import com.mysql.cj.xdevapi.Result;
import com.service.FoodService;
import com.service.ItemService;

@Controller
@RequestMapping(value = "item")
public class ItemController {
	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "addItem")
	public String addItem(String orderid, int foodid, String fname, Double price, int number) {
		Item item = new Item(orderid, foodid, fname, price, number);
		int addItem = itemService.addItem(item);
		return addItem == 0 ? "error" : "success";
	}

	@RequestMapping(value = "getItemByOrderId")
	public String getItemByOrderId(String orderId) {
		List<Item> list = itemService.getItemByOrderId(orderId);
		return list == null ? "error" : "success";
	}
}
