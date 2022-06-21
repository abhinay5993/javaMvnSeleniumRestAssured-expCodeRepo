package com.prog.odinsexps.week5assign;
import java.util.Scanner;

public class VehicleInventorySystem {

	public static void main(String[] args) {
		System.out.println("\nWelcome to AUTOSHOP WORLD!!!");
		performRegistration();
		performRegistration();
		performRegistration();
//		UserImpl userImplObj=new UserImpl();
//		userImplObj.getAllUserDetails();
		doLogIn() ;
		doLogIn() ;
		doLogIn() ;
	}
	
	
	public static void performRegistration() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease signup with your details : ");
		System.out.print("\nPlease enter your first name : ");
		String firstName = sc.next();
		System.out.print("\nPlease enter your second name : ");
		String secName = sc.next();
		System.out.print("\nPlease enter your userName : ");
		String userName = sc.next();
		System.out.print("\nPlease enter your password : ");
		String passWord = sc.next();
		
		if (!firstName.isEmpty() && !secName.isEmpty() && !userName.isEmpty() && !passWord.isEmpty()) {
			User userObj = new User(firstName, secName, userName, passWord);
			UserImpl userImpObj = new UserImpl();
			if (userImpObj.addUserDetails(userObj)) {
				System.out.println("\nThank you… your registration success!!!");
			} else {
				System.out.println("\nregistration failed!!!");
			}
		} 
		else {
			System.out.println("\nAll details are mandatory hence should not be empty..");
		}

	}
	
	
	public static void doLogIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease sign with your details : ");
		System.out.print("\nPlease enter your userNname : ");
		String userName = sc.next();
		System.out.print("\nPlease enter your password : ");
		String passWord = sc.next();

		if (!userName.isEmpty() && !passWord.isEmpty()) {
			UserImpl userImpObj = new UserImpl();
			if (userImpObj.performLogIn(userName, passWord)) {
				System.out.println("\nHello!! " + userName + " Welcome to Autoshop world");
			} else {
				System.out.println("\nInvalid!! user..");
			}
		} else {
			System.out.println("\nboth userName and password Mandatory for login and it should not be empty!!..");
		}

	}
	

}