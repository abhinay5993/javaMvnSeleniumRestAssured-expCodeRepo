package com.prog.odinsexps.jdbcEmsW6Assign;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDetails {

	private int employeeId;
	private String employeeName;
	private String mobileNo;
	private String dept;
	private String location;
	Scanner sc=new Scanner(System.in);
	
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public String getDept() {
		return dept;
	}
	public String getLocation() {
		return location;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void insertNewEmployeeDetails() throws ClassNotFoundException, SQLException {
		EmpMS_DBManager.getInstanceOfDBManager().setPrepStatement(EmpMS_DBManager.INSERT_EMPDET_QUERY);
		System.out.println("\nPlease Enter new Employee details : ");
		System.out.print("\nPlease enter employee id : ");
		setEmployeeId(sc.nextInt());
		System.out.print("\nPlease enter employee name : ");
		setEmployeeName(sc.next());
		System.out.print("\nPlease enter mobile number : ");
		setMobileNo(sc.next());
		System.out.print("\nPlease enter Dept : ");
		setDept(sc.next());
		System.out.print("\nPlease enter Location : ");
		setLocation(sc.next());
		// SettingUp the plance holder values
		EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().setInt(1, getEmployeeId());
		EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().setString(2, getEmployeeName());
		EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().setString(3, getMobileNo());
		EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().setString(4, getDept());
		EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().setString(5, getLocation());

		int insStatus = EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().executeUpdate();
		if (insStatus != 0 && getDept() != null && getDept().length() != 0 && getEmployeeName() != null && getEmployeeName().length() != 0 && getLocation() != null && getLocation().length() != 0) {
			System.out.println("\nThank you… employee details are inserted!!!");
		} else {
			System.out.println("\nUnable to insert data!!..");
		}

	}
	
	public void showAllEmployeeDetails() throws ClassNotFoundException, SQLException
	{
		EmpMS_DBManager.getInstanceOfDBManager().setPrepStatement(EmpMS_DBManager.SELECT_ALLEMP_QUERY);
		System.out.println("\nEmployee details:");
		System.out.println("\n=====================");
		//write DB Code for result set
		ResultSet empResSet=EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().executeQuery();
		while(empResSet.next())
		{
			System.out.println("\n "+empResSet.getInt(1)+"  "+empResSet.getString(2)+"  "+empResSet.getString(3)+"  "+empResSet.getString(4)+" "+empResSet.getString(5)+" ");
		}
	}
	
	
	public void updateEmployeeDetailsByEmpId() throws ClassNotFoundException, SQLException {
		EmpMS_DBManager.getInstanceOfDBManager().setPrepStatement(EmpMS_DBManager.UPDATE_EMPDET_QUERY);
		System.out.print("\nPlease enter existing employee id : ");
		setEmployeeId(sc.nextInt());
		System.out.print("\nPlease enter New employee name : ");
		setEmployeeName(sc.next());
		System.out.print("\nPlease enter New mobile number : ");
		setMobileNo(sc.next());
		System.out.print("\nPlease enter New Dept : ");
		setDept(sc.next());
		System.out.print("\nPlease enter New Location : ");
		setLocation(sc.next());

		// SettingUp the plance holder values
		EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().setInt(1, getEmployeeId());
		EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().setString(2, getEmployeeName());
		EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().setString(3, getMobileNo());
		EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().setString(4, getDept());
		EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().setString(5, getLocation());
		EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().setInt(6, employeeId);
		
		int updateStatus = EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().executeUpdate();
		if (updateStatus != 0 && getDept() != null && getDept().length() != 0 && getEmployeeName() != null && getEmployeeName().length() != 0 && getLocation() != null && getLocation().length() != 0) {
			System.out.println("\nDetails are Updated!!!..");
		} else {
			System.out.println("\nUnable to modify the details..");
		}
	}
	
	public void deleteRecordsByEmployeeId() throws ClassNotFoundException, SQLException {
		EmpMS_DBManager.getInstanceOfDBManager().setPrepStatement(EmpMS_DBManager.DEL_EMPDET_QUERY);
		System.out.print("\nPlease enter existing employee id : ");
		setEmployeeId(sc.nextInt());
		// SettingUp the plance holder values
		EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().setInt(1, getEmployeeId());
		int delStatus = EmpMS_DBManager.getInstanceOfDBManager().getPrepStatement().executeUpdate();
		if (delStatus != 0) {
			System.out.println("\nRecord deleted!!!..");
		} else {
			System.out.println("\nUnable to Delete record!!..");
		}
	}
	
	
}