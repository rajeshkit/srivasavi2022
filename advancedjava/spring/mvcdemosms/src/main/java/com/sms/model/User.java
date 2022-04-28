package com.sms.model;

public class User {
	private int userId;
	private String userName;
	private String phone;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int userId, String userName, String phone) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phone = phone;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
