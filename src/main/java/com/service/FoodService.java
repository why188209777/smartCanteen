package com.service;

import java.util.List;

import com.model.Food;
import com.model.FoodCondition;
import com.model.FoodDynamic;
import com.model.Page;

public interface FoodService {
	public int addFood(Food food);

	public int delFood(int foodId);

	public int updateFood(Food food);

	public Food getFoodByFoodId(int foodId);

	List<Food> getAllFood();

	List<Food> getFoodByMid(int mid);

	public int getFoodCountByCondition(FoodCondition condition);

	public List<Food> getFoodByConditionAndPage(FoodCondition condition, Page page);
	
	//根据餐厅id和店铺id动态查询
	public List<Food> getFoodByCanteenAndMerchant(FoodDynamic foodDynamic);
}
