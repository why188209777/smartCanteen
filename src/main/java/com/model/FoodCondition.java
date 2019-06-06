package com.model;

public class FoodCondition extends Page {

	private String fname;
	private int mid;

	public FoodCondition() {
	}

	public FoodCondition(String fname, int mid, int pageIndex, int pageSize) {
		super(pageIndex, pageSize);
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
