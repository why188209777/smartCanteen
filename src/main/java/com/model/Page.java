package com.model;

public class Page {

	private int pageIndex;  //当前页
	private int pageSize;  //每页数量
	private int first;  //数据库查询开始位置
	private int totalSize;  //总页数

	public Page() {
		super();
	}

	/* 可以通过构造器方式 */
	public Page(int pageIndex, int pageSize, int totalSize) {
		first = (pageIndex - 1) * pageSize;
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.totalSize = totalSize;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	/* 也可以通过set方式 */
	public void setPageIndex(int pageIndex) {
		first = (pageIndex - 1) * pageSize;
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	@Override
	public String toString() {
		return "Page [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", first=" + first + "]";
	}

}
