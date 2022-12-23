package com.h2dbconnect.jpaRestserve.usersService;
import java.time.LocalDate;

public class UsersBean {
	
	private int userId=-1;
	private String userName="";
	private LocalDate dateOfBirth;
	private String errorMsg="";
	
	
	public UsersBean(int userId, String userName, LocalDate dateOfBirth) {
		this.userId = userId;
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
	}

    public UsersBean(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return errorMsg;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


}