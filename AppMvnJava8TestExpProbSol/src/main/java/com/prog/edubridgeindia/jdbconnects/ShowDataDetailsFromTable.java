package com.prog.edubridgeindia.jdbconnects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.github.javafaker.Faker;

/*
 * Using Switch case perform Select , Insert, Update , Delete Operation
 * 
 */

public class ShowDataDetailsFromTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Faker fkg=new Faker();
		String custId=fkg.numerify("#");
		String custName=fkg.name().firstName();
		String custAddress=fkg.address().cityName();
		String custCityData=fkg.address().city();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empDb", "root", "password");
		Statement st = con.createStatement();
		int exeUpdateIns = st.executeUpdate("insert into BANK_AC_HOLDER values("+custId+",'"+custName+"','"+custAddress+"','"+custCityData+"')");
		System.out.println("\nNo of Rows Effected - "+exeUpdateIns);
		ResultSet rs = st.executeQuery("select * from BANK_AC_HOLDER");
		System.out.println("\n************ BANK_AC_HOLDER *************\n");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+"  "+rs.getString(4));
		}
		rs.close();
		con.close();
	}
}