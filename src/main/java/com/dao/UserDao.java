package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.Page;
import com.model.User;
import com.model.UserCondition;

public interface UserDao {

	public int addUser(User user);

	public int delUser(String studentId);

	public int updateUser(User user);

	public User getUserByStudentId(String studentId);

	public List<User> getAllUser();

	public User login(@Param("uname") String uname, @Param("password") String password);

	public int getUserCountByCondition(UserCondition condition);

	// 模糊和分页查询
	public List<User> getUserByConditionAndPage(@Param("condition") UserCondition condition,
			@Param("page") Page page);
}
