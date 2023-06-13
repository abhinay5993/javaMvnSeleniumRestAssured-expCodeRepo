package com.spr.radapps.SprTryAnnotatationExps.authentitymodel;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UsersAuthModel {
	
	@Id
	private int userId;
	private String userName;
	private String strPwd;
	
	public UsersAuthModel() {
		
	}
	
	public UsersAuthModel(int userId, String userName, String strPwd) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.strPwd = strPwd;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getStrPwd() {
		return strPwd;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setStrPwd(String strPwd) {
		this.strPwd = strPwd;
	}
	

}
