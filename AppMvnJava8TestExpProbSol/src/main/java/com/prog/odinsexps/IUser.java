package com.prog.odinsexps;

public interface IUser {

	boolean isNewRegistration(User userObj, int indexPosition);

	boolean isLoginSuccess(String username, String password);
}