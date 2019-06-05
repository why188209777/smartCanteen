package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Canteen;
import com.service.CanteenService;

@Controller
@RequestMapping(value = "canteen")
public class CanteenController {
	@Autowired
	private CanteenService canteenService;

	@RequestMapping(value = "addCanteen")
	public String addCanteen(String cname, String description, ModelMap map) {
		map.addAttribute("cname", cname);
		map.addAttribute("description", description);
		Canteen canteen = new Canteen(cname, description);
		System.out.println(canteen);
		int addcanteen = canteenService.addCanteen(canteen);
		return addcanteen == 0 ? "error" : "success";
	}

	@RequestMapping(value = "updateCanteen")
	public String updateCanteen(int cid, String cname, String description) {
		Canteen canteen = new Canteen(cid, cname, description);
		int updateCanteen = canteenService.updateCanteen(canteen);
		return updateCanteen == 0 ? "error" : "success";
	}

	@RequestMapping(value = "getCanteenByCid")
	public String getCanteenByCid(int cid) {
		Canteen canteenByCid = canteenService.getCanteenByCid(cid);
		return canteenByCid == null ? "error" : "success";
	}
}
