package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.FoodDao;
import com.model.Food;
import com.service.FoodService;

public class FoodServiceImpl implements FoodService{

	@Autowired
	private FoodDao fooddao;
	
	
	public void setFooddao(FoodDao fooddao) {
		this.fooddao = fooddao;
	}

	@Override
	public int addFood(Food food) {
		// TODO Auto-generated method stub
		return fooddao.addFood(food);
	}

	@Override
	public int delFood(int foodid) {
		// TODO Auto-generated method stub
		return fooddao.delFood(foodid);
	}

	@Override
	public int updateFood(Food food) {
		// TODO Auto-generated method stub
		return fooddao.updateFood(food);
	}

	@Override
	public Food getFoodByFoodid(int foodid) {
		// TODO Auto-generated method stub
		return fooddao.getFoodByFoodid(foodid);
	}

	@Override
	public List<Food> getAllFood() {
		// TODO Auto-generated method stub
		return fooddao.getAllFood();
	}

	@Override
	public List<Food> getFoodByMid(int mid) {
		// TODO Auto-generated method stub
		return fooddao.getFoodByMid(mid);
	}

}
