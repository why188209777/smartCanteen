package com.model;

public class Canteen {
	private int cid;
	private String cname;
	private String description;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Canteen(int cid, String cname, String description) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.description = description;
	}

	public Canteen(String cname, String description) {
		super();
		this.cname = cname;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Canteen [cid=" + cid + ", cname=" + cname + ", description=" + description + "]";
	}
}
