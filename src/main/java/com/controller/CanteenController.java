package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Canteen;
import com.model.Page;
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

	@RequestMapping(value = "delCanteen")
	@ResponseBody
	public boolean delCanteen(int cid) {
		int delCanteen = canteenService.delCanteen(cid);
		return delCanteen == 0 ? false : true;
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

	@RequestMapping(value = "getAllCanteen")
	@ResponseBody
	public List<Canteen> getAllCanteen() {
		List<Canteen> list = canteenService.getAllCanteen();
		return list;
	}

	@RequestMapping(value = "getCanteenByPage")
	@ResponseBody
	public Object getCanteenByPage(int pageIndex, int pageSize) {
		int count = canteenService.getCanteenCount();
		int totalSize = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
		Page page = new Page(pageIndex, pageSize, totalSize);
		List<Canteen> list = canteenService.getCanteenByPage(page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", page);
		map.put("list", list);
		return map;
	}
}
