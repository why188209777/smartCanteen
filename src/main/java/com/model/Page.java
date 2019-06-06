package com.model;

public class Page {

	private int pageIndex;
	private int pageSize;
	private int first;
	
	
	
	public Page() {
		super();
	}

	public Page(int pageIndex, int pageSize) {
		first = (pageIndex - 1) * pageSize;
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	public int getPageIndex() {
		return pageIndex;
	}

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
