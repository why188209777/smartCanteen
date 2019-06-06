package com.model;

public class Page {

	private int pageIndex;
	private int pageSize;
	private int first;

	public Page() {
		super();
	}

	/*可以通过构造器方式*/
	public Page(int pageIndex, int pageSize) {
		first = (pageIndex - 1) * pageSize;
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	/*也可以通过set方式*/
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

	@Override
	public String toString() {
		return "Page [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", first=" + first + "]";
	}

}
