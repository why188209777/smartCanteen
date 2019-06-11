package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.MerchantDao;
import com.model.Merchant;
import com.model.MerchantCondition;
import com.model.Page;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class MerchantTest {
	@Autowired
	private MerchantDao merchantDao;

	@Test
	public void addMerchant() {
		Merchant merchant = new Merchant("地下广场", "种类齐全", 3);
		int addMerchant = merchantDao.addMerchant(merchant);
		System.out.println(addMerchant);
	}

	@Test
	public void getMerchantByCid() {
		List<Merchant> merchant = merchantDao.getMerchantByCid(2);
		System.out.println(merchant);
	}

	@Test
	public void delMerchant() {
		int delMerchant = merchantDao.delMerchant(1);
		System.out.println(delMerchant);
	}

	@Test
	public void updateMerchant() {
		Merchant merchant = new Merchant(2, "地上广场", "种类", 5);
		int updateMerchant = merchantDao.updateMerchant(merchant);
		System.out.println(updateMerchant);
	}

	@Test
	public void getMerchantByMid() {
		Merchant merchant = merchantDao.getMerchantByMid(1);
		System.out.println(merchant);
	}

	@Test
	public void getMerchantByConditionAndPage() {
		int pageSize = 5;
		MerchantCondition condition = new MerchantCondition("", 1);
		int count = merchantDao.getMerchantCountByCondition(condition);
		int totalSize = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
		Page page = new Page(1, pageSize, totalSize);
		System.out.println(condition);
		System.out.println(page);
		List<Merchant> list = merchantDao.getMerchantByConditionAndPage(condition, page);
		System.out.println(list);
	}
}
