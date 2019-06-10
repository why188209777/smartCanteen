package com.model;

/*
 * 商家模糊查询
 */
public class MerchantCondition {

	private String mname;  //商家名称
	private int cid;  //所属食堂

	public MerchantCondition() {
	}

	public MerchantCondition(String mname, int cid) {
		this.mname = mname;
		this.cid = cid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "MerchantCondition [mname=" + mname + ", cid=" + cid + "]";
	}

}
