package com.model;

/*
 * 餐品动态信息
 */
public class FoodDynamic {
	private int cid;//餐厅id
	private int mid;//餐厅下属店铺id
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public FoodDynamic(int cid, int mid) {
		super();
		this.cid = cid;
		this.mid = mid;
	}
	public FoodDynamic() {
		super();
	}
	@Override
	public String toString() {
		return "FoodDynamic [cid=" + cid + ", mid=" + mid + "]";
	}
	
	
}
