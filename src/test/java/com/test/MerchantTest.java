package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.MerchantDao;
import com.model.Item;
import com.model.Merchant;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class MerchantTest {
	@Autowired
	private MerchantDao merchantDao;
	
	@Test
	public void addMerchant(){
		Merchant merchant=new Merchant("地下广场","种类齐全",3);
		int addMerchant = merchantDao.addMerchant(merchant);
		System.out.println(addMerchant);
	}
	@Test
	public void getMerchantsByCid(){
		List<Merchant> merchant = merchantDao.getMerchantsByCid(1);
		System.out.println(merchant);
	}
	@Test
	public void delMerchant(){
		int delMerchant = merchantDao.delMerchant(1);
		System.out.println(delMerchant);
	}
	@Test
	public void updateMerchant(){
		Merchant merchant=new Merchant(2,"地上广场","种类",5);
		int updateMerchant = merchantDao.updateMerchant(merchant);
		System.out.println(updateMerchant);
	}
	@Test
	public void getMerchantByMid(){
		Merchant merchant = merchantDao.getMerchantByMid(1);
		System.out.println(merchant);
	}
}
