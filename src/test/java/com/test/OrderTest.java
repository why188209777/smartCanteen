package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.OrderDao;
import com.model.Order;
import com.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class OrderTest {
	
	@Autowired
	private OrderService orderdao;
	
	@Test
	public void test(){
		/*List<Order> allOrder = orderdao.getAllOrder();
		List<Order> orderByUserId = orderdao.getOrderByUserId(1);
		for(Order list:allOrder){
			System.out.println(list);
		}
		for(Order list2:orderByUserId){
			System.out.println(list2);
		}
		Order order = new Order("14", "2019-6-4", "1234", 1, 100, 1,1);
		int addOrder = orderdao.addOrder(order);
		System.out.println(addOrder);
		Order orderByOrderId = orderdao.getOrderByOrderId("2");
		System.out.println(orderByOrderId);*/
		/*List<Order> orderByMid = orderdao.getOrderByMid(2);
		for(Order list3:orderByMid){
			System.out.println(list3);
		}*/
		List<Order> orderByTime = orderdao.getOrderByTime(1,"2019-06-02");
		for(Order list4:orderByTime){
			System.out.println(list4);
		}
	}
}
