package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.User;

public interface UserDao {
	
	public int addUser(User user);

	public int delUser(String studentId);

	public int updateUser(User user);

	public User getUserByStudentId(String studentId);

	public List<User> getAllUser();

	public User login(@Param("uname") String uname, @Param("password") String password);
}
