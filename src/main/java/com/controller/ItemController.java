package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Item;
import com.service.ItemService;

@Controller
@RequestMapping(value = "item")
public class ItemController {
	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "addItem")
	@ResponseBody
	public boolean addItem(String orderid, int foodid, String fname, Double price, int number) {
		Item item = new Item(orderid, foodid, fname, price, number);
		int addItem = itemService.addItem(item);
		return addItem == 0 ? false : true;
	}

	@RequestMapping(value = "getItemByOrderId")
	@ResponseBody
	public List<Item> getItemByOrderId(String orderId) {
		List<Item> list = itemService.getItemByOrderId(orderId);
		return list;
	}
}
