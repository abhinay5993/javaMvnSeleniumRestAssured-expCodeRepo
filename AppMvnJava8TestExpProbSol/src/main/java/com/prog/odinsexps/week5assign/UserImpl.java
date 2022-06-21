package com.prog.odinsexps.week5assign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class UserImpl implements IUser {

	ArrayList<User> arrayListOfUsers;
	LinkedList<User> linkedUser;
	
	@Override
	public boolean addUserDetails(User userObj) {
		if (userObj != null) {
			LinkedList<User> linkedUserObj = new LinkedList<>();
			return linkedUserObj.add(userObj);
		}
		return false;
	}
	
	@Override
	public void getAllUserDetails() {
		try {
			arrayListOfUsers = new ArrayList<>(linkedUser);
			Iterator<User> itr = arrayListOfUsers.iterator();

			System.out.println("\nAll User Details : ");
			System.out.println("\n===================");
			while (itr.hasNext()) {
				User userObj = itr.next();
				System.out.println(" " + userObj.getFirstName() + "  " + userObj.getSecondName() + "  "
						+ userObj.getUserName() + "  " + userObj.getPassword() + " ");
			}
		} catch (Exception e) {
			System.out.println("\nException - " + e.toString());
		}
	}


	public boolean performLogIn(String userName, String password) {
		boolean fgBlnStatus = false;
		try {
			Iterator<User> itr = arrayListOfUsers.iterator();
			while (itr.hasNext()) {
				User userObj = itr.next();
				if (userObj.getUserName().equals(userName) && userObj.getPassword().equals(password)) {
					fgBlnStatus = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("\nException - " + e.toString());
		}
		return fgBlnStatus;
	}
	
	
}