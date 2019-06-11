package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FoodDao;
import com.model.Food;
import com.model.FoodCondition;
import com.model.FoodDynamic;
import com.model.Page;
import com.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodDao foodDao;

	public void setFooddao(FoodDao foodDao) {
		this.foodDao = foodDao;
	}

	@Override
	public int addFood(Food food) {
		// TODO Auto-generated method stub
		return foodDao.addFood(food);
	}

	@Override
	public int delFood(int foodId) {
		// TODO Auto-generated method stub
		return foodDao.delFood(foodId);
	}

	@Override
	public int updateFood(Food food) {
		// TODO Auto-generated method stub
		return foodDao.updateFood(food);
	}

	@Override
	public Food getFoodByFoodId(int foodId) {
		// TODO Auto-generated method stub
		return foodDao.getFoodByFoodId(foodId);
	}

	@Override
	public List<Food> getAllFood() {
		// TODO Auto-generated method stub
		return foodDao.getAllFood();
	}

	@Override
	public List<Food> getFoodByMid(int mid) {
		// TODO Auto-generated method stub
		return foodDao.getFoodByMid(mid);
	}

	@Override
	public int getFoodCountByCondition(FoodCondition condition) {
		// TODO Auto-generated method stub
		return foodDao.getFoodCountByCondition(condition);
	}

	@Override
	public List<Food> getFoodByConditionAndPage(FoodCondition condition, Page page) {
		// TODO Auto-generated method stub
		return foodDao.getFoodByConditionAndPage(condition, page);
	}

	@Override
	public List<Food> getFoodByCanteenAndMerchant(FoodDynamic foodDynamic) {
		// TODO Auto-generated method stub
		return foodDao.getFoodByCanteenAndMerchant(foodDynamic);
	}

}
