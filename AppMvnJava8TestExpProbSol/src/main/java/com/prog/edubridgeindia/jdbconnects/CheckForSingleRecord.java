package com.prog.edubridgeindia.jdbconnects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CheckForSingleRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CheckForSingleRecord objCheck=new CheckForSingleRecord();
		objCheck.select1();
	}

	
	public void select1() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeMS", "root", "password");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from admin_info");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your UserName: ");
		String a = sc.next();
		System.out.println("Enter your Password: ");
		String n = sc.next();
		boolean blnStatus = false;
		while (rs.next()) {
			String userName = rs.getString(2);
			String password = rs.getString(3);
			blnStatus=(a.equals(userName) && n.equals(password))?true:false;
		}
		System.out.println("\nLogin Flag Status : "+blnStatus);
	}


}