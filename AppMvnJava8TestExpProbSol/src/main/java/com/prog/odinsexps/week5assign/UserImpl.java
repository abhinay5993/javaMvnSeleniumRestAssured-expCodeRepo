package com.prog.odinsexps.week5assign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UserImpl implements IUser {

	List<User> userCollect;
	ArrayList<User> userArrayListObj;
	
	@Override
	public boolean addUserDetails(List<User> lnkUserObj) {
		    userCollect=new LinkedList<User>();
		    return userCollect.addAll(lnkUserObj);
	}
	
	public void getAllUserDetails() {
		try {
			userArrayListObj=new ArrayList<User>(userCollect);
			Iterator<User> itr = userArrayListObj.iterator();
			System.out.println("\nList of Registered Users Count : "+userArrayListObj.size());
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
			Iterator<User> itr = userArrayListObj.iterator();
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