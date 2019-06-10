package com.model;

public class OrderCondition {

	private String startTime;
	private String endTime;
	private int status;

	public OrderCondition() {
	}

	public OrderCondition(String startTime, String endTime, int status) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderCondition [startTime=" + startTime + ", endTime=" + endTime + ", status=" + status + "]";
	}

}
