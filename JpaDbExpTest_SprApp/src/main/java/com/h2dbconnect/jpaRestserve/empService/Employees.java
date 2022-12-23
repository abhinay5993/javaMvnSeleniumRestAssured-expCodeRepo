package com.h2dbconnect.jpaRestserve.empService;

public class Employees {
	
	private long empId;
	private String empName;
	private String empEmailId;
	private String emailId;
	private long salary;
	private String dateOfJoining;
	
	public Employees(long empId, String empName, String empEmailId, String emailId, long salary, String dateOfJoining) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmailId = empEmailId;
		this.emailId = emailId;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}



	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + ", empEmailId=" + empEmailId + ", emailId="
				+ emailId + ", salary=" + salary + ", dateOfJoining=" + dateOfJoining + "]";
	}



	public long getEmpId() {
		return empId;
	}



	public String getEmpName() {
		return empName;
	}



	public String getEmpEmailId() {
		return empEmailId;
	}



	public String getEmailId() {
		return emailId;
	}



	public long getSalary() {
		return salary;
	}



	public String getDateOfJoining() {
		return dateOfJoining;
	}

}