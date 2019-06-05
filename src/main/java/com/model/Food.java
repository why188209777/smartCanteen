package com.model;

public class Food {
	private int foodid;
	private String fname;
	private double price;
	private String image;
	private int number;
	private int mid;

	public Food() {
	}

	public Food(int foodid, String fname, double price, String image, int number, int mid) {
		super();
		this.foodid = foodid;
		this.fname = fname;
		this.price = price;
		this.image = image;
		this.number = number;
		this.mid = mid;
	}

	public Food(String fname, double price, String image, int number, int mid) {
		super();
		this.fname = fname;
		this.price = price;
		this.image = image;
		this.number = number;
		this.mid = mid;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "Food [foodid=" + foodid + ", fname=" + fname + ", price=" + price + ", image=" + image + ", number="
				+ number + ", mid=" + mid + "]";
	}

}
