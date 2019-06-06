package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;
import com.model.UserCondition;
import com.service.UserService;

@Controller
@RequestMapping(value = "user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "addUser")
	@ResponseBody
	public boolean addUser(String uname, String idcard, String studentid, String classes, String password,
			String phonenum, String address) {
		User user = new User(address, address, address, address, address, address, address);
		int addUser = userService.addUser(user);
		return addUser == 0 ? false : true;
	}

	@RequestMapping(value = "delUser")
	@ResponseBody
	public boolean delUser(String studentId) {
		int delUser = userService.delUser(studentId);
		return delUser == 0 ? false : true;
	}

	@RequestMapping(value = "updateUser")
	@ResponseBody
	public boolean updateUser(String uname, String idcard, String studentid, String classes, String password,
			String phonenum, String address) {
		User user = new User(uname, idcard, studentid, classes, password, phonenum, address);
		int updateuser = userService.updateUser(user);
		return updateuser == 0 ? false : true;
	}

	@RequestMapping(value = "getAllUser")
	@ResponseBody
	public List<User> getAllUser() {
		List<User> list = userService.getAllUser();
		return list;
	}

	@RequestMapping(value = "getUserByStudentId")
	@ResponseBody
	public User getUserByStudentId(String studentId) {
		User user = userService.getUserByStudentId(studentId);
		return user;
	}

	@RequestMapping(value = "login")
	@ResponseBody
	public User login(String uname, String password) {
		User user = userService.login(uname, password);
		return user;
	}
	
	@RequestMapping(value = "page")
	@ResponseBody
	public List<User> getUserByCondition(String uname, String idcard, String studentid, String classes, String phonenum, String address, int pageIndex, int pageSize){
		UserCondition condition = new UserCondition(uname, idcard, studentid, classes, phonenum, address, pageIndex, pageSize);
		List<User> list = userService.getUserByCondition(condition);
		return list;
	}
}
