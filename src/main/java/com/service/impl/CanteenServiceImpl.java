package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CanteenDao;
import com.model.Canteen;
import com.model.Page;
import com.service.CanteenService;

@Service
public class CanteenServiceImpl implements CanteenService {

	@Autowired
	private CanteenDao canteenDao;

	public void setCanteenDao(CanteenDao canteenDao) {
		this.canteenDao = canteenDao;
	}

	@Override
	public int addCanteen(Canteen canteen) {

		return canteenDao.addCanteen(canteen);
	}

	@Override
	public int delCanteen(int cid) {
		// TODO Auto-generated method stub
		return canteenDao.delCanteen(cid);
	}

	@Override
	public int updateCanteen(Canteen canteen) {
		// TODO Auto-generated method stub
		return canteenDao.updateCanteen(canteen);
	}

	@Override
	public Canteen getCanteenByCid(int cid) {
		// TODO Auto-generated method stub
		return canteenDao.getCanteenByCid(cid);
	}

	@Override
	public List<Canteen> getAllCanteen() {
		// TODO Auto-generated method stub
		return canteenDao.getAllCanteen();
	}

	@Override
	public List<Canteen> getCanteenByPage(Page page) {
		// TODO Auto-generated method stub
		return canteenDao.getCanteenByPage(page);
	}

	@Override
	public int getCanteenCount() {
		// TODO Auto-generated method stub
		return canteenDao.getCanteenCount();
	}

}
