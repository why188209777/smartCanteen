package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.Page;
import com.model.User;
import com.model.UserCondition;

public interface UserService {
	public int addUser(User user);

	public int delUser(String studentId);

	public int updateUser(User user);

	public User getUserByStudentId(String studentId);

	public User getUserByUserId(int id);
	
	public List<User> getAllUser();

	public User login(String name, String password);

	public int getUserCountByCondition(UserCondition condition);

	public List<User> getUserByConditionAndPage(UserCondition condition, Page page);
	
	public int changePassword(String password, String phoneNum);
	
	public int applyCertification(int id);
	
	public int dealCertification(int status, int id);
}
