package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Food;
import com.model.FoodCondition;
import com.service.FoodService;

@Controller
@RequestMapping(value = "food")
public class FoodController {
	@Autowired
	private FoodService foodService;

	@RequestMapping(value = "addFood")
	@ResponseBody
	public boolean addFood(String fname, double price, String image, int number, int mid) {
		Food food = new Food(fname, price, image, number, mid);
		int addFood = foodService.addFood(food);
		return addFood == 0 ? false : true;
	}

	@RequestMapping(value = "delFood")
	@ResponseBody
	public boolean delFood(int foodId) {
		int delFood = foodService.delFood(foodId);
		return delFood == 0 ? false : true;
	}

	@RequestMapping(value = "updateFood")
	@ResponseBody
	public boolean updateFood(int foodId, String fname, double price, String image, int number, int mid) {
		Food food = new Food(foodId, fname, price, image, number, mid);
		int ueFood = foodService.updateFood(food);
		return ueFood == 0 ? false : true;
	}

	@RequestMapping(value = "getFoodByFoodId")
	@ResponseBody
	public Food getFoodByFoodId(int foodId) {
		Food food = foodService.getFoodByFoodId(foodId);
		return food;
	}

	@RequestMapping(value = "getAllFood")
	@ResponseBody
	public List<Food> getAllFood() {
		List<Food> list = foodService.getAllFood();
		return list;
	}

	@RequestMapping(value = "getFoodByMid")
	@ResponseBody
	public List<Food> getFoodByMid(int mid) {
		List<Food> list = foodService.getFoodByMid(mid);
		return list;
	}
	
	@RequestMapping(value = "getFoodByCondition")
	@ResponseBody
	public List<Food> getFoodByCondition(String fname, int mid, int pageIndex, int pageSize) {
		FoodCondition condition = new FoodCondition(fname, mid, pageIndex, pageSize);
		List<Food> list = foodService.getFoodByCondition(condition);
		return list;
	}
}
