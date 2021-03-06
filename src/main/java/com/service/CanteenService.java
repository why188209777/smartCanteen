package com.service;

import java.util.List;

import com.model.Canteen;
import com.model.Page;

public interface CanteenService {
	public int addCanteen(Canteen canteen);

	public int delCanteen(int cid);

	public int updateCanteen(Canteen canteen);

	public Canteen getCanteenByCid(int cid);

	public List<Canteen> getAllCanteen();

	public List<Canteen> getCanteenByPage(Page page);

	public int getCanteenCount();
}
