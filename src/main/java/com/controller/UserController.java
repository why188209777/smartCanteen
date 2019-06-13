package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.internal.util.StringUtils;
import com.model.Page;
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
	public boolean addUser(String uname, @RequestParam(required = false) String idcard, String studentid,
			String classes, String password, String phonenum, String address) {
		User user = new User(uname, idcard, studentid, classes, password, phonenum, address);
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

	@RequestMapping(value = "getUserByUserId")
	@ResponseBody
	public User getUserByUserId(int id) {
		User user = userService.getUserByUserId(id);
		return user;
	}

	@RequestMapping(value = "login")
	@ResponseBody
	public User login(String uname, String password) {
		User user = userService.login(uname, password);
		return user;
	}

	@RequestMapping(value = "getUserByConditionAndPage")
	@ResponseBody
	public Object getUserByConditionAndPage(String uname, String idcard, String studentid, String classes,
			String phonenum, String address, int pageIndex, int pageSize) {
		/* 当输入框没有输入值时 */
		if (StringUtils.isEmpty(uname)) {
			uname = null;
		}
		if (StringUtils.isEmpty(idcard)) {
			idcard = null;
		}
		if (StringUtils.isEmpty(studentid)) {
			studentid = null;
		}
		if (StringUtils.isEmpty(classes)) {
			classes = null;
		}
		if (StringUtils.isEmpty(phonenum)) {
			phonenum = null;
		}
		if (StringUtils.isEmpty(address)) {
			address = null;
		}
		UserCondition condition = new UserCondition(uname, idcard, studentid, classes, phonenum, address);
		int count = userService.getUserCountByCondition(condition);
		int totalSize = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
		Page page = new Page(pageIndex, pageSize, totalSize);
		List<User> list = userService.getUserByConditionAndPage(condition, page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", page);
		map.put("list", list);
		return map;
	}

	@RequestMapping(value = "changePassword")
	@ResponseBody
	public boolean changePassword(String password, String phoneNum) {
		int changePassword = userService.changePassword(password, phoneNum);
		return changePassword == 0 ? false : true;
	}

	@RequestMapping(value = "applyCertification")
	@ResponseBody
	public boolean applyCertification(int id) {
		int applyCertification = userService.applyCertification(id);
		return applyCertification == 0 ? false : true;
	}

	@RequestMapping(value = "dealCertification")
	@ResponseBody
	public boolean dealCertification(int status, int id) {
		int dealCertification = userService.dealCertification(status, id);
		return dealCertification == 0 ? false : true;
	}
}
