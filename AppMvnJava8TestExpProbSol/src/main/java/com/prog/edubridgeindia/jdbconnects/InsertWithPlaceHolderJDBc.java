package com.prog.edubridgeindia.jdbconnects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertWithPlaceHolderJDBc {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		InsertMethod();
	}

	public static void  InsertMethod() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empDb", "root", "password");
		PreparedStatement psmt=con.prepareStatement("insert into BANK_AC_HOLDER values(?,?,?,?)");
		psmt.setInt(1,901);
		psmt.setString(2, "Test");
		psmt.setString(3,"QA-Auto");
		psmt.setString(4,"Maven");
		int n=psmt.executeUpdate();
		System.out.println(n+" Record inserted in BANK_AC_HOLDER table!!!");
		con.close();
	}
	
	
	public static void updateMethod() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empDb", "root", "password");
		PreparedStatement psmt=con.prepareStatement("update BANK_AC_HOLDER set CADDR=? where CNO=?");
		psmt.setInt(2,201);
		psmt.setString(1, "Piyush");
		int n=psmt.executeUpdate();
		System.out.println(n+" Record updated in emp table!!!");
		con.close();
	}
	

}