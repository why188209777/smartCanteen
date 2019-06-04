package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Item;
import com.service.ItemService;

@Controller
@RequestMapping(value = "item")
public class ItemController {
	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "add")
	public String add(String itemid, HttpServletRequest request, HttpServletResponse response) {
		String orderid = request.getParameter("orderid");
		int foodid = Integer.parseInt(request.getParameter("foodid"));
		String fname = request.getParameter("fname");
		int price = Integer.parseInt(request.getParameter("price"));
		int number = Integer.parseInt(request.getParameter("number"));
		Item item = new Item(orderid, foodid, fname, price, number);
		int a = itemService.addItem(item);
		if (a == 1) {
			return "success";
		} else {
			return "error";
		}
	}

	@RequestMapping(value = "getAll")
	public ModelAndView getList() {
		ModelAndView mav = new ModelAndView();
		List<Item> iList = itemService.getItemByOrderId("1");
		mav.addObject("ilist", iList);
		mav.setViewName("getall");
		return mav;

	}

}
