package com.model;

/*
 * 商家条件分页查询
 */
public class MerchantCondition extends Page {

	private String mname;
	private int cid;

	public MerchantCondition() {
	}

	public MerchantCondition(String mname, int cid, int pageIndex, int pageSize) {
		super(pageIndex, pageSize);
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
