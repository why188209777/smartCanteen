package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Food;
import com.service.FoodService;

@Controller
@RequestMapping(value = "food")
public class FoodController {
	@Autowired
	private FoodService foodService;

	@RequestMapping(value = "addFood")
	@ResponseBody
	public String addFood(String fname, double price, String image, int number, int mid) {
		Food food = new Food(fname, price, image, number, mid);
		int addFood = foodService.addFood(food);
		return addFood == 0 ? "error" : "success";
	}

	@RequestMapping(value = "delFood")
	@ResponseBody
	public String delFood(int foodId) {
		int delFood = foodService.delFood(foodId);
		return delFood == 0 ? "error" : "success";
	}

	@RequestMapping(value = "updateFood")
	@ResponseBody
	public String updateFood(int foodid, String fname, double price, String image, int number, int mid) {
		Food food = new Food(foodid, fname, price, image, number, mid);
		int ueFood = foodService.updateFood(food);
		return ueFood == 0 ? "error" : "success";
	}

	@RequestMapping(value = "getFoodByFoodId")
	@ResponseBody
	public String getFoodByFoodId(int foodId) {
		Food food = foodService.getFoodByFoodId(foodId);
		return food == null ? "error" : "success";
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
}
