package com.firstorm.feedpojo;

public class CustomerFeedbackDetails {
	
	private int feedId;
	private String userEmail;
	private String feedBackMsg;
	private int rateCount;
	
	public int getFeedId() {
		return feedId;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	
	public String getFeedBackMsg() {
		return feedBackMsg;
	}
	
	public int getRateCount() {
		return rateCount;
	}
	
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public void setFeedBackMsg(String feedBackMsg) {
		this.feedBackMsg = feedBackMsg;
	}
	
	public void setRateCount(int rateCount) {
		this.rateCount = rateCount;
	}
	
}