package com.prog.odinsexps.week4assign;

public class User {

	private String firstName;
	private String secondName;
	private String userName;
	private String password;
	
	public User(String firstName, String secondName, String userName, String password) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.userName = userName;
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", secondName=" + secondName + ", userName=" + userName + ", password="
				+ password + "]";
	}

}