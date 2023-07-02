package com.prog.edubridgeindia.jdbconnects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.github.javafaker.Faker;

public class PlayWithJDBCApp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Faker fkg=new Faker();
		String custId=fkg.numerify("#");
		String custName=fkg.name().firstName();
		String custAddress=fkg.address().cityName();
		String custCityData=fkg.address().city();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nPlease enter your SQL query : ");
		String sql=sc.nextLine();
		System.out.println("\nPassed SQL Query Data : "+sql);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empDb", "root", "password");
		Statement st = con.createStatement();
		boolean b=st.execute(sql);//true or false: select : true: non select: false: 
		if(b==true){
		ResultSet rs=st.getResultSet();
		while(rs.next()){
		System.out.println("\n "+rs.getInt(1)+" ==> "+rs.getString(2)+" ==> "+rs.getString(3));
		}
		}
		else{
		int n=st.getUpdateCount();
		System.out.println(n+" records are modified !!");
		}

	}
	
}