package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.FoodDao;
import com.dao.MerchantDao;
import com.dao.OrderDao;
import com.dao.UserDao;
import com.model.Food;
import com.model.FoodCondition;
import com.model.Merchant;
import com.model.MerchantCondition;
import com.model.Order;
import com.model.OrderCondition;
import com.model.User;
import com.model.UserCondition;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class ConditionTest {

	@Autowired
	private UserDao userDao;
	@Autowired
	private MerchantDao merchantDao;
	@Autowired
	private FoodDao foodDao;
	@Autowired
	private OrderDao orderDao;

	@Test
	public void getUserByCondition() {
		UserCondition userCondition = new UserCondition(null, null, null, null, null, null, 2, 3);
		List<User> list = userDao.getUserByCondition(userCondition);
		System.out.println(list);
	}

	@Test
	public void getMerchantByCondition() {
		MerchantCondition merchantCondition = new MerchantCondition("食", 1, 1, 3);
		List<Merchant> list = merchantDao.getMerchantByCondition(merchantCondition);
		System.out.println(list);
	}

	@Test
	public void getFoodByCondition() {
		FoodCondition foodCondition = new FoodCondition("肉", 1, 1, 3);
		List<Food> list = foodDao.getFoodByCondition(foodCondition);
		System.out.println(list);
	}

	@Test
	public void getOrderByCondition() {
		OrderCondition orderCondition = new OrderCondition("2019-06-01", "2019-06-03", 1, 1, 3);
		List<Order> list = orderDao.getOrderByCondition(orderCondition);
		for (Order order : list) {
			System.out.println(order);
		}
	}
}
