package com.service;

import java.util.List;

import com.model.Item;

public interface ItemService {
	public int addItem(Item item);

	public List<Item> getItemByOrderId(String orderId);
}
