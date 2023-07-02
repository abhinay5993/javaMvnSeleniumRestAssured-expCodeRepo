package com.prog.edubridgeindia.jdbconnects;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BothCaseSensitiveAndInsensitiveResultSet {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empDb", "root", "password");

		Statement st_2 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs_2 = st_2.executeQuery("select * from BANK_AC_HOLDER");

		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery("select * from BANK_AC_HOLDER");

		System.out.println("Result before Update operation on table");
		System.out.println("ResultSet Object-1  :rs");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " ===> " + rs.getString(2)+" ===> "+rs.getString(4));
		}
		
		System.out.println("Pause ResultSet for sometime: ");
		System.in.read();// pause enter
		rs.beforeFirst();
		while (rs.next()) {
			rs.refreshRow();
			System.out.println(rs.getInt(1) + " ===> " + rs.getString(2)+" ===> "+rs.getString(4));
		}

		System.out.println("\n\nResultSet Object-2  :rs_2");
		while (rs_2.next()) {
			System.out.println(rs.getInt(1) + " ===> " + rs.getString(2)+" ===> "+rs.getString(4));

		}
	}

}