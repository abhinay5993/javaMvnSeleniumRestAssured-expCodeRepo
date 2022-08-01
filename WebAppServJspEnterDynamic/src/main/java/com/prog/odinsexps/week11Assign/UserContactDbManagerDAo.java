package com.prog.odinsexps.week11Assign;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserContactDbManagerDAo {
	
	private static final String MYSQL_DRIVERNAME="com.mysql.cj.jdbc.Driver";
	private static final String CONNECTION_STR="jdbc:mysql://localhost:3306/";
	private static final String DB_NAME="UserContactMS";
	private static final String USER_NAME="root";
	private static final String PWD="password";
	
	public static final String SELECT_ADMIN_QUERY="select * from adminUser_info";
	public static final String INSERT_USERCONTACT_QUERY="insert into userContact_details values(?,?,?,?,?)";
	public static final String SELECT_USERCONTACT_QUERY="select * from userContact_details";
	public static final String SELECT_USERCONTACT_BYUSERID="select * from userContact_details where user_Id=?";
	public static final String UPDATE_USERCONTACT_QUERY="update userContact_details set user_Name=?,user_EmailId=?,user_MobileNo=?,user_Country=? where user_Id=?";
	public static final String DEL_USERCONTACT_QUERY="delete from userContact_details where user_Id=?";
	
	private Connection connect;
	private PreparedStatement prepStatement;
	private static UserContactDbManagerDAo objManager;
	
	private UserContactDbManagerDAo() {

	}
	
	public static UserContactDbManagerDAo getInstanceOfDBManager() {
		if (objManager == null) {
			objManager = new UserContactDbManagerDAo();
		}
		return objManager;
	}
	
	public Connection getConnectionInstance() throws ClassNotFoundException, SQLException {
		if (connect == null) {
			// Register the driver
			Class.forName(MYSQL_DRIVERNAME);
			connect = DriverManager.getConnection(CONNECTION_STR + DB_NAME, USER_NAME, PWD);
			System.out.println("\nDB Connection Successfully established!!..");
		}
		return connect;
	}

	public PreparedStatement getPrepStatement() {
		return prepStatement;
	}

	public void setPrepStatement(String exceQuery) throws ClassNotFoundException, SQLException {
		this.prepStatement = getConnectionInstance().prepareStatement(exceQuery);
	}
	
	public void closeConnections() throws SQLException, ClassNotFoundException {
		if (connect != null && prepStatement != null) {
			getPrepStatement().close();
			getConnectionInstance().close();
			System.out.println("\nConnections closed!!..");
		}
	}
	
	
	
}