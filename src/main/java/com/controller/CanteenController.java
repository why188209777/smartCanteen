package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Canteen;
import com.service.CanteenService;

@Controller
@RequestMapping(value = "canteen")
public class CanteenController {
	@Autowired
	private CanteenService canteenService;

	@RequestMapping(value = "addCanteen")
	@ResponseBody
	public boolean addCanteen(String cname, String description) {
		Canteen canteen = new Canteen(cname, description);
		int addcanteen = canteenService.addCanteen(canteen);
		return addcanteen == 0 ? false : true;
	}

	@RequestMapping(value = "updateCanteen")
	@ResponseBody
	public boolean updateCanteen(int cid, String cname, String description) {
		Canteen canteen = new Canteen(cid, cname, description);
		int updateCanteen = canteenService.updateCanteen(canteen);
		return updateCanteen == 0 ? false : true;
	}

	@RequestMapping(value = "getCanteenByCid")
	@ResponseBody
	public Canteen getCanteenByCid(int cid) {
		Canteen canteen = canteenService.getCanteenByCid(cid);
		return canteen;
	}
}
