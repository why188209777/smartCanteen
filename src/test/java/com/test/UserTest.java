package com.test;

import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.UserDao;
import com.model.Page;
import com.model.User;
import com.model.UserCondition;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserTest {

	@Autowired
	UserDao userDao;

	@Test
	public void addTest() {
		User user = new User("金日成", "1", "1", "1", "123456", "1", "3号楼");
		System.out.println(userDao.addUser(user));
	}

	@Test
	public void delTest() {
		System.out.println(userDao.delUser("1"));
	}

	@Test
	public void updateTest() {
		User user = new User("金日成", "1", "1", "1", "123456", "1", "5号楼");
		userDao.updateUser(user);
	}

	@Test
	public void getIdTest() {
		/*User user = userDao.getUserByStudentId("2018b11065");*/
		User user = userDao.getUserByUserId(1);
		System.out.println(user);
	}

	@Test
	public void getAllTest() {
		List<User> list = userDao.getAllUser();
		for (User u : list) {
			System.out.println(u);
		}
	}

	@Test
	public void loginTest() {
		String name = "赵旭尧";
		String password = "4awaa42";
		User user = userDao.login(name, password);
		System.out.println(user);
	}
	
	@Test
	public void getUserByConditionAndPage(){
		int pageSize = 5;
		UserCondition condition = new UserCondition(null, null, "2018", null, null, null);
		int count = userDao.getUserCountByCondition(condition);
		int totalSize = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
		Page page = new Page(1, pageSize, totalSize);
		List<User> list = userDao.getUserByConditionAndPage(condition, page);
		System.out.println(list);
	}
	
	@Test
	public void changePassword(){
		String phoneNum = "18989471454";
		int changePassword = userDao.changePassword("123456", phoneNum);
		System.out.println(changePassword);
	}

}
