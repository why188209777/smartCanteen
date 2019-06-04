package com.service;

import com.model.Canteen;

public interface CanteenService {
	public int addCanteen(Canteen canteen);

	public int updateCanteen(Canteen canteen);

	public Canteen getCanteenByCid(int cid);
}
