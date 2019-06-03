package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.AdminDao;
import com.model.Admin;
import com.service.AdminService;

@Controller
@RequestMapping(value="admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	@RequestMapping(value="login")
	public String login(ModelMap map){
		String aname = "马云";
		String password = "123456";
		map.addAttribute("aname", aname);
		Admin admin = adminService.login(aname, password);
		return admin == null ? "error" : "adminSuccess";
	}
}
