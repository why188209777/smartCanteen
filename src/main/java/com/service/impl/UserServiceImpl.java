package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public int addUser(User user) {
		userDao.addUser(user);
		return 1;
	}

	@Override
	public int delUser(String studentid) {
		userDao.delUser(studentid);
		return 1;
	}

	@Override
	public int updateUser(User user) {
		userDao.updateUser(user);
		return 1;
	}

	@Override
	public List<User> getAllUser() {
		List<User> lUsers=userDao.getAllUser();
		return lUsers;
	}

	@Override
	public User getUserByStudentId(String studentId) {
		User user = userDao.getUserByStudentId(studentId);
		return user;
	}

	@Override
	public User login(int id, String password) {
		// TODO Auto-generated method stub
		return null;
	}


}
