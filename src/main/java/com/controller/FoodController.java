package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Food;
import com.service.CanteenService;
import com.service.FoodService;

@Controller
@RequestMapping(value = "food")
public class FoodController {
	@Autowired
	private FoodService foodService;

	@RequestMapping(value = "addFood")
	public String addFood(String fname, double price, String image, int number, int mid) {
		Food food = new Food(fname, price, image, number, mid);
		int addFood = foodService.addFood(food);
		return addFood == 0 ? "error" : "success";
	}

	@RequestMapping(value = "delFood")
	public String delFood(int foodId) {
		int delFood = foodService.delFood(foodId);
		return delFood == 0 ? "error" : "success";
	}

	@RequestMapping(value="updateFood")
	public String updateFood(int foodid,String fname, double price, String image, int number, int mid){
		Food food = new Food(foodid, fname, price, image, number, mid);
		int ueFood = foodService.updateFood(food);
		return ueFood == 0 ? "error" : "success";
	}
	@RequestMapping(value="getFoodByFoodId")
	public String getFoodByFoodId(int foodId){
		Food food = foodService.getFoodByFoodId(foodId);
		return food == null ? "error" : "success";
	}
	@RequestMapping(value="getAllFood")
	public String getAllFood(){
		List<Food> list = foodService.getAllFood();
		return list == null ? "error" : "success";
	}
	@RequestMapping(value="getFoodByMid")
	public String getFoodByMid(int mid){
		List<Food> list = foodService.getFoodByMid(mid);
		return list == null ? "error" : "success";
	}
} 
