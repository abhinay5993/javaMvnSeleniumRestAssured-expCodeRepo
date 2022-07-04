package com.prog.odinsexps.week5assign;
import java.util.List;

public interface IUser {
	
	boolean addUserDetails(List<User> lnkUserObj);
	
	boolean performLogIn(String userName, String passWord);

}