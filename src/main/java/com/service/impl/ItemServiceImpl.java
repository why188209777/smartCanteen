package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.AdminDao;
import com.dao.ItemDao;
import com.model.Admin;
import com.model.Item;
import com.service.ItemService;

public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;

	public void setAdminDao(AdminDao adminDao) {
		this.itemDao = itemDao;
	}

	@Override
	public int addItem(Item item) {
		// TODO Auto-generated method stub
		return itemDao.addItem(item);
	}

	@Override
	public List<Item> getItemByorderId(String orderId) {
		// TODO Auto-generated method stub
		return itemDao.getItemByorderId(orderId);
	}
}
