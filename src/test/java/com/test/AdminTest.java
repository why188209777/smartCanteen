package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.AdminDao;
import com.model.Admin;
import com.service.AdminService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class AdminTest {

	@Autowired
	private AdminDao adminDao;
	
	@Test
	public void login(){
		Admin admin = adminDao.login("马云", "123456");
		System.out.println(admin);
	}
	
}
