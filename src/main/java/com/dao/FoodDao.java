package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.Food;
import com.model.FoodCondition;
import com.model.FoodDynamic;
import com.model.Page;

public interface FoodDao {
	public int addFood(Food food);

	public int delFood(int foodId);

	public int updateFood(Food food);

	public Food getFoodByFoodId(int foodId);

	public List<Food> getAllFood();

	public List<Food> getFoodByMid(int mid);

	public int getFoodCountByCondition(FoodCondition condition);

	// 模糊和分页查询
	public List<Food> getFoodByConditionAndPage(@Param("condition") FoodCondition condition, @Param("page") Page page);
	
	//根据餐厅id和店铺id动态查询
	public List<Food> getFoodByCanteenAndMerchant(FoodDynamic foodDynamic);
}
