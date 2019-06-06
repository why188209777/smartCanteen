package com.dao;

import java.util.List;

import com.model.Canteen;
import com.model.Food;

public interface CanteenDao {

	public int addCanteen(Canteen canteen);

	public int updateCanteen(Canteen canteen);

	public Canteen getCanteenByCid(int cid);
	List<Canteen> getAllCanteen();
}
