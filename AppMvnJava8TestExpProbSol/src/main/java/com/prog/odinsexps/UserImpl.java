package com.prog.odinsexps;

public class UserImpl implements IUser {

	private User userArrayObjectsRef[];
	
	public UserImpl(int noOfUsers) {
		super();
		userArrayObjectsRef = new User[noOfUsers];
	}

	@Override
	public boolean isNewRegistration(User userObjValue, int indexPosition) {
		System.out.println("\nUser info : " + userObjValue);
		userArrayObjectsRef[indexPosition++] = userObjValue;
		return false;
	}

	@Override
	public boolean isLoginSuccess(String username, String password) {
		boolean flagVal = false;
		System.out.println("\nLoggedIn userName : - " + username + " and password : " + password);
		for (User userRef : userArrayObjectsRef) {

			flagVal = (userRef != null && username.equals(userRef.getUserName())
					&& password.equals(userRef.getPassword()));
		}
		return flagVal;
	}

}