package com.dao;

import java.util.List;

import com.model.Item;

public interface ItemDao {
	public int addItem(Item item);
	public List<Item> getItemByorderId(String orderId);
}
