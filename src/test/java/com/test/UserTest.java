package com.test;

import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.UserDao;
import com.model.User;

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
		User user = userDao.getUserByStudentId("2018b11065");
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
		String sname;
		String password;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入id");
		sname = scanner.next();
		System.out.println("请输入密码");
		password = scanner.next();
		User user = userDao.login(sname, password);
		System.out.println(user);
	}

}
