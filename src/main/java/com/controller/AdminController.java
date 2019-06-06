package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Admin;
import com.service.AdminService;

@Controller
@RequestMapping(value = "admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@RequestMapping(value = "login")
	@ResponseBody
	public Admin login(String aname, String password) {
		Admin admin = adminService.login(aname, password);
		return admin;
	}
}
