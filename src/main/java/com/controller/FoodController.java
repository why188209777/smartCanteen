package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.internal.util.StringUtils;
import com.model.Food;
import com.model.FoodCondition;
import com.model.Page;
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
	
	@RequestMapping(value = "getFoodByConditionAndPage")
	@ResponseBody
	public Object getFoodByConditionAndPage(String fname, int mid, int pageIndex, int pageSize) {
		/*当输入框没有输入值时*/
		if (StringUtils.isEmpty(fname)) {
			fname = null;
		}
		FoodCondition condition = new FoodCondition(fname, mid);
		int count = foodService.getFoodCountByCondition(condition);
		int totalSize = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
		Page page = new Page(pageIndex, pageSize, totalSize);
		List<Food> list = foodService.getFoodByConditionAndPage(condition, page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", page);
		map.put("list", list);
		return map;
	}
}
