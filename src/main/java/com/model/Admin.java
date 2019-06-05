package com.model;

public class Admin {

	private int id;
	private String aname;
	private String password;
	private String phonenum;

	public Admin(int id, String aname, String password, String phonenum) {
		super();
		this.id = id;
		this.aname = aname;
		this.password = password;
		this.phonenum = phonenum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", aname=" + aname + ", password=" + password + ", phonenum=" + phonenum + "]";
	}

}
