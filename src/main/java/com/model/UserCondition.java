package com.model;

/*
 * 用户条件分页查询
 */
public class UserCondition extends Page {

	private String uname;
	private String idcard;
	private String studentid;
	private String classes;
	private String phonenum;
	private String address;
	

	public UserCondition() {
	}

	public UserCondition(String uname, String idcard, String studentid, String classes, String phonenum, String address,int pageIndex, int pageSize) {
		super(pageIndex, pageSize);
		this.uname = uname;
		this.idcard = idcard;
		this.studentid = studentid;
		this.classes = classes;
		this.phonenum = phonenum;
		this.address = address;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserCondition [uname=" + uname + ", idcard=" + idcard + ", studentid=" + studentid + ", classes="
				+ classes + ", phonenum=" + phonenum + ", address=" + address + "]";
	}

}
