package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.CanteenDao;
import com.model.Canteen;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class CanteenTest {
	@Autowired
	private CanteenDao canteenDao;

	@Test
	public void addCanteenTest() {
		Canteen canteen = new Canteen("完美食堂", "非常好");
		int addCanteen = canteenDao.addCanteen(canteen);
		System.out.println(addCanteen);
	}

	@Test
	public void updateCanteen() {
		Canteen canteen = new Canteen(5, "东北食堂", "一般");
		int updateCanteen = canteenDao.updateCanteen(canteen);
		System.out.println(updateCanteen);
	}

	@Test
	public void getCanteenByCid() {
		Canteen canteenByCid = canteenDao.getCanteenByCid(1);
		System.out.println("Canteen:" + canteenByCid);
	}

   @Test
   
   public void  getAllCanteen(){
	   List<Canteen> list = canteenDao.getAllCanteen();
	   System.out.println(list);
   }
}