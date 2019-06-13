package com.model;

public class User {

	private int id;
	private String uname;
	private String idcard;
	private String studentid;
	private String classes;
	private String password;
	private String phonenum;
	private String address;
	private int status;  //学生认证情况

	
	
	public User(int id, String uname, String idcard, String studentid, String classes, String password, String phonenum,
			String address, int status) {
		super();
		this.id = id;
		this.uname = uname;
		this.idcard = idcard;
		this.studentid = studentid;
		this.classes = classes;
		this.password = password;
		this.phonenum = phonenum;
		this.address = address;
		this.status = status;
	}

	public User(int id, String uname, String idcard, String studentid, String classes, String password, String phonenum,
			String address) {
		super();
		this.id = id;
		this.uname = uname;
		this.idcard = idcard;
		this.studentid = studentid;
		this.classes = classes;
		this.password = password;
		this.phonenum = phonenum;
		this.address = address;
	}

	public User(String uname, String idcard, String studentid, String classes, String password, String phonenum,
			String address) {
		super();
		this.uname = uname;
		this.idcard = idcard;
		this.studentid = studentid;
		this.classes = classes;
		this.password = password;
		this.phonenum = phonenum;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", idcard=" + idcard + ", studentid=" + studentid + ", classes="
				+ classes + ", password=" + password + ", phonenum=" + phonenum + ", address=" + address + ", status="
				+ status + "]";
	}

}
