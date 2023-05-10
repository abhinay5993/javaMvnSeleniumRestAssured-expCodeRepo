package com.prog.edubridgeindia.jdbconnects;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SnsensitiveCoursorResultSetExps {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empDb", "root", "password");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from BANK_AC_HOLDER");
		
		//Use of relative(3) ResultSet
		rs.relative(3);
		while(rs.next()) {
			//rs.refreshRow(); //Will not print the latest updated record.
			System.out.println(rs.getInt(1)+ "     "+rs.getString(3));
		}

		System.out.println("\nLets!! have some break  ");
		System.in.read();
		//Use of absolute(2); ResultSet
		rs.absolute(2);
		System.out.println("\nResult Set after absolute(2) : ");
		while(rs.next()) {
			//rs.refreshRow(); //Will not print the latest updated record.
			System.out.println(rs.getInt(1)+ "     "+rs.getString(3));
		}

		System.out.println("\nLets!! have some break  ");
		System.in.read();
		//Use of previous(); ResultSet
		rs.previous();
	    System.out.println("\nResult Set after previous() : ");
		while(rs.next()) {
		//rs.refreshRow(); //Will not print the latest updated record.
		System.out.println(rs.getInt(1)+ "     "+rs.getString(3));
		}
		
		
		System.out.println("\nLets!! have some break  ");
		System.in.read();
		//Use of rs.beforeFirst(); ResultSet
		rs.beforeFirst();
	    System.out.println("\nResult Set after rs.beforeFirst(); ");
		while(rs.next()) {
		//rs.refreshRow(); //Will not print the latest updated record.
		System.out.println(rs.getInt(1)+ "     "+rs.getString(3));
		}
		
		System.out.println("\nLets!! have some break  ");
		System.in.read();
		//Use of rs.afterLast(); ResultSet
		rs.afterLast();
	    System.out.println("\nResult Set after rs.afterLast(); ");
		while(rs.next()) {
		//rs.refreshRow(); //Will not print the latest updated record.
		System.out.println(rs.getInt(1)+ "     "+rs.getString(3));
		}

	}

}