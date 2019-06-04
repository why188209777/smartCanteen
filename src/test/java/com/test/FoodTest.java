package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.FoodDao;
import com.model.Food;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class FoodTest {

	@Autowired
	private FoodDao foodDao;
	
	@Test
	public void getfoodbyid(){
		Food food = foodDao.getFoodByFoodid(1);
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
}
