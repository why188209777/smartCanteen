package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MerchantDao;
import com.model.Merchant;
import com.model.MerchantCondition;
import com.service.MerchantService;

@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	private MerchantDao merchantDao;

	public void setMerchantDao(MerchantDao merchantDao) {
		this.merchantDao = merchantDao;
	}

	@Override
	public int addMerchant(Merchant merchant) {
		// TODO Auto-generated method stub
		return merchantDao.addMerchant(merchant);
	}

	@Override
	public int delMerchant(int mid) {
		// TODO Auto-generated method stub
		return merchantDao.delMerchant(mid);
	}

	@Override
	public int updateMerchant(Merchant merchant) {
		// TODO Auto-generated method stub
		return merchantDao.updateMerchant(merchant);
	}

	@Override
	public List<Merchant> getAllMerchant() {
		// TODO Auto-generated method stub
		return merchantDao.getAllMerchant();
	}

	@Override
	public Merchant getMerchantByMid(int mid) {
		// TODO Auto-generated method stub
		return merchantDao.getMerchantByMid(mid);
	}

	@Override
	public List<Merchant> getMerchantByCid(int cid) {
		// TODO Auto-generated method stub
		return merchantDao.getMerchantByCid(cid);
	}

	@Override
	public List<Merchant> getMerchantByCondition(MerchantCondition condition) {
		// TODO Auto-generated method stub
		return merchantDao.getMerchantByCondition(condition);
	}

}
