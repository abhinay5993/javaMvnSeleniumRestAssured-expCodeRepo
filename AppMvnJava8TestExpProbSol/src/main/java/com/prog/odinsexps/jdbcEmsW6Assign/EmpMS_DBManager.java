package com.prog.odinsexps.jdbcEmsW6Assign;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpMS_DBManager {
	
	private static final String MYSQL_DRIVERNAME="com.mysql.cj.jdbc.Driver";
	private static final String CONNECTION_STR="jdbc:mysql://localhost:3306/";
	private static final String DB_NAME="EmployeeMS";
	private static final String USER_NAME="root";
	private static final String PWD="password";
	
	public static final String SELECT_ADMIN_QUERY="select * from admin_info";
	public static final String INSERT_EMPDET_QUERY="insert into employee_info values(?,?,?,?,?)";
	public static final String SELECT_ALLEMP_QUERY="select * from employee_info";
	public static final String UPDATE_EMPDET_QUERY="update employee_info set emp_id=?,emp_name=?,emp_mobileno=?,emp_dept=?,emp_location=? where emp_id=?";
	public static final String DEL_EMPDET_QUERY="delete from employee_info where emp_id=?";
	
	private Connection connect;
	private PreparedStatement prepStatement;
	private static EmpMS_DBManager objManager;
	
	private EmpMS_DBManager() {

	}
	
	public static EmpMS_DBManager getInstanceOfDBManager() {
		if (objManager == null) {
			objManager = new EmpMS_DBManager();
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
