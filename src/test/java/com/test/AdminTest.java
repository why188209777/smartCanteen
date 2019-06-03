package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model.Admin;
import com.service.AdminService;
import com.service.impl.AdminServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class AdminTest {

	@Autowired
	private AdminService adminService;
	
	@Test
	public void login(){
		Admin admin = adminService.login("马云", "123456");
		System.out.println(admin);
	}
	
}
