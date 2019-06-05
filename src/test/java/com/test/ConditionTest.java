package com.test;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.UserDao;
import com.model.User;
import com.model.UserCondition;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class ConditionTest {

	@Autowired
	private UserDao userDao;
	
	@Test
	public void getUserByCondition(){
		UserCondition condition = new UserCondition(
			null,null,null,null,null,"2",1,3
		);
		List<User> list = userDao.getUserByCondition(condition);
		System.out.println(list);
	}
}
