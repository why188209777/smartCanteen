package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping(value = "user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value = "addUser")
	public String addUser(String uname, String idcard, String studentid, String classes, String password, String phonenum,
			String address){
		User user=new User(address, address, address, address, address, address, address);
		int addUser=userService.addUser(user);
		return addUser == 0 ? "error" : "success";
	}
	@RequestMapping(value = "delUser")
	public String delUser(String studentId){
		int delUser=userService.delUser(studentId);
		return delUser == 0 ? "error" : "success";
	}
	@RequestMapping(value = "updateUser")
	public String updateUser(String uname, String idcard, String studentid, String classes, String password, String phonenum,
			String address){
		User user=new User(uname, idcard, studentid, classes, password, phonenum, address);
		int updateuser=userService.updateUser(user);
		return updateuser == 0 ? "error" : "success";
	}
	@RequestMapping(value = "getAllUser")
	public String getAllUser(){
		List<User> users= userService.getAllUser();
		return users == null ? "error" : "success";
	}
	@RequestMapping(value = "getUserByStudentId")
	public String getUserByStudentId(String studentId){
		User user=userService.getUserByStudentId(studentId);
		return user == null ? "error" : "success";
	}
	@RequestMapping(value = "login")
	public String login(String uname,String password){
		User user=userService.login(uname, password);
		return user == null ? "error" : "success";
	}
}
