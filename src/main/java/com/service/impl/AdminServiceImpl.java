package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.AdminDao;
import com.model.Admin;
import com.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public Admin getAdminById(int id) {
		// TODO Auto-generated method stub
		return adminDao.getAdminById(id);
	}

}
