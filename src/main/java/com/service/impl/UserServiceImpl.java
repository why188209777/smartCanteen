package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.Page;
import com.model.User;
import com.model.UserCondition;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public int addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public int delUser(String studentid) {
		return userDao.delUser(studentid);
	}

	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public List<User> getAllUser() {
		List<User> list = userDao.getAllUser();
		return list;
	}

	@Override
	public User getUserByStudentId(String studentId) {
		User user = userDao.getUserByStudentId(studentId);
		return user;
	}

	@Override
	public User login(String name, String password) {
		return userDao.login(name, password);
	}

	@Override
	public int getUserCountByCondition(UserCondition condition) {
		// TODO Auto-generated method stub
		return userDao.getUserCountByCondition(condition);
	}

	@Override
	public List<User> getUserByConditionAndPage(UserCondition condition, Page page) {
		// TODO Auto-generated method stub
		return userDao.getUserByConditionAndPage(condition, page);
	}

}
