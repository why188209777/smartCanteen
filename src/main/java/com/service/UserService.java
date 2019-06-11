package com.service;

import java.util.List;

import com.model.Page;
import com.model.User;
import com.model.UserCondition;

public interface UserService {
	public int addUser(User user);

	public int delUser(String studentId);

	public int updateUser(User user);

	public User getUserByStudentId(String studentId);

	public List<User> getAllUser();

	public User login(String name, String password);

	public int getUserCountByCondition(UserCondition condition);

	public List<User> getUserByConditionAndPage(UserCondition condition, Page page);
}
