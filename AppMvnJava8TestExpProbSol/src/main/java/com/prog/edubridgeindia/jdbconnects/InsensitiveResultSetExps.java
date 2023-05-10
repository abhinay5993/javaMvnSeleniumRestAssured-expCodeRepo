package com.prog.edubridgeindia.jdbconnects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsensitiveResultSetExps {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empDb", "root", "password");
				Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet rs=st.executeQuery("select * from BANK_AC_HOLDER");
				
				rs.relative(3);
//				rs.absolute(2);
//				rs.previous();
//				rs.beforeFirst();
//				rs.afterLast();

				while(rs.next()) {
					rs.refreshRow(); // Will help to print latest updated record.
					System.out.println(rs.getInt(1)+ "     "+rs.getString(3));
				}

	}

}