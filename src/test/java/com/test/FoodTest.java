package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.FoodDao;
import com.model.Food;
import com.model.FoodCondition;
import com.model.FoodDynamic;
import com.model.Page;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class FoodTest {

	@Autowired
	private FoodDao foodDao;
	
	@Test
	public void getfoodbyid(){
		Food food = foodDao.getFoodByFoodId(1);
		System.out.print(food);
	} 
	
	@Test
	public void addfood(){
		Food food = new Food(13,"炒蛋番茄2",5,"123",2,10);
		int updateFood = foodDao.updateFood(food);
		//int addFood = foodDao.addFood(food);
		System.out.print(updateFood);
	} 
	
	@Test
	public void test(){
		
		//int delFood = foodDao.delFood(14);
		List<Food> allFood = foodDao.getAllFood();
		List<Food> foodByMid = foodDao.getFoodByMid(1);
		for (Food list : allFood) {
			System.out.println(list);
		 }
		for (Food list2 : foodByMid) {
			System.out.println(list2);
		 }
		
	}
	
	@Test
	public void getFoodByConditionAndPage(){
		int pageSize = 5;
		FoodCondition condition = new FoodCondition("冬瓜", 1);
		int count = foodDao.getFoodCountByCondition(condition);
		int totalSize = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
		Page page = new Page(1, pageSize, totalSize);
		System.out.println(condition);
		System.out.println(page);
		List<Food> list = foodDao.getFoodByConditionAndPage(condition, page);
		System.out.println(list);
	}
	
	@Test
	public void getFoodByCanteenAndMerchant(){
		FoodDynamic foodDynamic=new FoodDynamic(1,1);
		List<Food> list = foodDao.getFoodByCanteenAndMerchant(foodDynamic);
		for (Food food : list) {
			System.out.println(food);
		}
	}
}
