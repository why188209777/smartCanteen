package com.model;

public class Order {
	private int id;
	private String orderid;
	private String createtime;
	private String remark;
	private int status;
	private double total;
	private int userid;
	private int mid;
	
	public Order(String orderid, int status) {
		super();
		this.orderid = orderid;
		this.status = status;
	}

	public Order(String orderid, String createtime, String remark, int status, double total, int userid, int mid) {
		super();
		this.orderid = orderid;
		this.createtime = createtime;
		this.remark = remark;
		this.status = status;
		this.total = total;
		this.userid = userid;
		this.mid = mid;
	}

	public Order(int id, String orderid, String createtime, String remark, int status, double total, int userid,
			int mid) {
		super();
		this.id = id;
		this.orderid = orderid;
		this.createtime = createtime;
		this.remark = remark;
		this.status = status;
		this.total = total;
		this.userid = userid;
		this.mid = mid;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}


	public Order() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderid=" + orderid + ", createtime=" + createtime + ", remark=" + remark
				+ ", status=" + status + ", total=" + total + ", userid=" + userid + ", mid=" + mid + "]";
	}

}
