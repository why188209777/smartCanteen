package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.AdminDao;
import com.model.Admin;
import com.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;



	@Override
	public Admin login(String aname, String password) {
		// TODO Auto-generated method stub
		return adminDao.login(aname, password);
	}
	
	public static void main(String[] args) {
		System.out.println(new AdminServiceImpl().login("马云", "123456"));
	}

}
