package com.dao;

import java.util.List;

import com.model.Food;

public interface FoodDao {
	public int addFood(Food food);
	public int delFood(int foodid);
	public int updateFood(Food food);
	public Food getFoodByFoodid(int foodid);
	List<Food> getAllFood();
	List<Food> getFoodByMid(int mid);
}
