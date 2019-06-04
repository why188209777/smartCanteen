package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Admin;
import com.service.AdminService;

@Controller
@RequestMapping(value = "admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@RequestMapping(value = "login")
	public Admin login(String aname, String password, ModelMap map) {
		map.addAttribute("aname", aname);
		Admin admin = adminService.login(aname, password);
		// return admin == null ? "error" : "adminSuccess";
		return admin;
	}
}
