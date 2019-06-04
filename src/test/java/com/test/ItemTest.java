package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.dao.ItemDao;

import com.model.Item;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class ItemTest {
	@Autowired
	private ItemDao itemDao;
	
	@Test
	public void addItem(){
		Item item=new Item("1",2,"茶叶蛋",15.0,3);
		int addItem = itemDao.addItem(item);
		System.out.println(addItem);
	}
	@Test
	public void getItemByorderId(){
		List<Item> item = itemDao.getItemByOrderId("1");
		System.out.println(item);
	}
}
