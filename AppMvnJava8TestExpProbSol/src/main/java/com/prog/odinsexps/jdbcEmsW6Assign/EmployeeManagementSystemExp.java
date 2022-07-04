package com.prog.odinsexps.jdbcEmsW6Assign;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagementSystemExp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("\nWelcome to Employee Management Portal!!!");
		try {
			Scanner sc=new Scanner(System.in);
			AdminLogin loginObj = new AdminLogin();
			EmployeeDetails empObj = new EmployeeDetails();
			loginObj.performAdminLogin();
			int choice = loginObj.choiceInfo;

			while (true) {
				if (choice == 1) {
					empObj.insertNewEmployeeDetails();
					break;
				} else if (choice == 2) {
					empObj.showAllEmployeeDetails();
					break;
				} else if (choice == 3) {
					empObj.updateEmployeeDetailsByEmpId();
					break;
				} else if (choice == 4) {
					empObj.deleteRecordsByEmployeeId();
					break;
				} else {
					System.out.println("\nWrong!! choice..");
					System.out.println("\nPress - 0 to Contiune : ");
					choice=sc.nextInt();
					if (choice == 0) {
						continue;
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			EmpMS_DBManager.getInstanceOfDBManager().closeConnections();
		}

	}
}