package com.model;

/*
 * 餐品模糊查询
 */
public class FoodCondition {

	private String fname;  //餐品名称
	private int mid;  //所属商家

	public FoodCondition() {
	}

	public FoodCondition(String fname, int mid) {
		this.fname = fname;
		this.mid = mid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "FoodCondition [fname=" + fname + ", mid=" + mid + "]";
	}

}
