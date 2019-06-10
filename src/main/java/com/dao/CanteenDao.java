package com.dao;

import java.util.List;

import com.model.Canteen;
import com.model.Page;

public interface CanteenDao {

	public int addCanteen(Canteen canteen);

	public int delCanteen(int cid);

	public int updateCanteen(Canteen canteen);

	public Canteen getCanteenByCid(int cid);

	public List<Canteen> getAllCanteen();

	public int getCanteenCount();
	
	public List<Canteen> getCanteenByPage(Page page);
}
