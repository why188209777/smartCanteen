package com.model;

public class Item {
	private int itemid;
	private String orderid;
	private int foodid;
	private String fname;
	private double price;
	private int number;

	public Item() {
	}

	public Item(String orderid, int foodid, String fname, double price, int number) {
		super();
		this.orderid = orderid;
		this.foodid = foodid;
		this.fname = fname;
		this.price = price;
		this.number = number;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public int getFoodid() {
		return foodid;
	}

	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", orderid=" + orderid + ", foodid=" + foodid + ", fname=" + fname
				+ ", price=" + price + ", number=" + number + "]";
	}

}
