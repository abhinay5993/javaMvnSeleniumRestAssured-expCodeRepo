package com.prog.odinsexps.week5assign;

public class User {

	String firstName;
	String secondName;
	String userName;
	String password;
	
	public User(String fName, String seName,String uName,String pass) {
		this.firstName = fName;
		this.secondName = seName;
		this.userName = uName;
		this.password = pass;
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

}