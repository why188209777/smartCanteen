package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.FoodDao;
import com.model.Food;

@Controller
@RequestMapping(value="food")
public class FoodController {
	
	@Autowired
	private FoodDao fooddao;

	public void setFooddao(FoodDao fooddao) {
		this.fooddao = fooddao;
	}
	
	@RequestMapping(value="get")
	public String getfood(HttpSession session){
		List<Food> allFood = fooddao.getAllFood();
		session.setAttribute("list",allFood);
		return "adminSuccess";
	}
}
