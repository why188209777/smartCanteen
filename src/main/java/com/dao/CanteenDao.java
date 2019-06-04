package com.dao;

import com.model.Canteen;

public interface CanteenDao {
public int addCanteen(Canteen canteen);
public int updateCanteen(Canteen canteen);
public Canteen getCanteenByCid(int cid);
}
