package com.prog.edubridgeindia.jdbconnects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatedAbleResultSetApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empDb", "root", "password");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from BANK_AC_HOLDER");

		System.out.println("\nResult before Update operation on table");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " ===> " + rs.getString(2)+" ===> "+rs.getString(4));
		}
		System.out.println("\nLets Modify the ResultSet\n");
		rs.beforeFirst();
		while(rs.next()) 
		{
			int sal=rs.getInt(1)+100;
			rs.updateInt(1, sal);
			rs.updateRow();
		}
		rs.beforeFirst();
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " ===> " + rs.getString(2)+" ===> "+rs.getString(4));
		}
		
	}

}