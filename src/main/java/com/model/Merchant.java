package com.model;

public class Merchant {
	private int mid;
	private String mname;
	private String description;
	private int cid;

	public Merchant() {
	}

	public Merchant(int mid, String mname, String description, int cid) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.description = description;
		this.cid = cid;
	}

	public Merchant(String mname, String description, int cid) {
		super();
		this.mname = mname;
		this.description = description;
		this.cid = cid;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Merchant [mid=" + mid + ", mname=" + mname + ", description=" + description + ", cid=" + cid + "]";
	}

}
