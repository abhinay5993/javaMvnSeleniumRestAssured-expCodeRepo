package com.prog.odinsexps.jdbcEmsW6Assign;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminLogin {
	String userName;
	String password;
	int choiceInfo;
	Scanner sc=new Scanner(System.in);
	
	public void performAdminLogin() throws ClassNotFoundException, SQLException {
		EmpMS_DBManager.getInstanceOfDBManager().setPrepStatement(EmpMS_DBManager.SELECT_ADMIN_QUERY);
		ResultSet resSet = EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().executeQuery();
		System.out.println("\nPlease login with your credentials:");
		System.out.print("\nPlease enter username : ");
		userName = sc.nextLine();
		System.out.print("\nPlease enter password : ");
		password = sc.nextLine();
		while (resSet.next()) {
			boolean flagVal=(resSet.getString("ad_userName").equals(userName) && resSet.getString("ad_password").equals(password));
			if (flagVal) {
				choiceInfo = chooseOptionForValidUser(flagVal);
			}
		}
	}

	public int chooseOptionForValidUser(boolean loginFlag)
	{
		if(userName != null && password != null && userName.length() != 0 && password.length() != 0 && loginFlag)
		{
			System.out.println("\nUser loggedIn as Admin Successfylly!!...");
			System.out.println("\nPress To Choose your option!!");
			System.out.print(
					"\n1.To insert new employee details\n"
					+ "2.Show all employee details\n"
					+ "3.Update employee details\n"
					+ "4.Delete employee details\n");
			
			System.out.println("\nEnter Your Choice : ");
			choiceInfo=sc.nextInt();
		}
		return choiceInfo;
	}
	
}