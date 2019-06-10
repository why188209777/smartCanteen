package com.service;

import java.util.List;

import com.model.Food;
import com.model.Order;

public interface FoodService {
	public int addFood(Food food);

	public int delFood(int foodId);

	public int updateFood(Food food);

	public Food getFoodByFoodId(int foodId);

	List<Food> getAllFood();

	List<Food> getFoodByMid(int mid);

}
