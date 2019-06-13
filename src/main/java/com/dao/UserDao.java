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

	public User getUserByUserId(int id);
	
	public List<User> getAllUser();

	public User login(@Param("name") String name, @Param("password") String password);

	public int getUserCountByCondition(UserCondition condition);

	// 模糊和分页查询
	public List<User> getUserByConditionAndPage(@Param("condition") UserCondition condition,
			@Param("page") Page page);
	
	//修改密码
	public int changePassword(@Param("password") String password, @Param("phonenum") String phoneNum);
	
	//申请认证
	public int applyCertification(int id);
	
	//处理认证
	public int dealCertification(@Param("status") int status, @Param("id") int id);
}
