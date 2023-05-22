package com.hbmonetonemapptbl.mappojo;

public class EmployeeDetails {
	
	private int empId;
	private String empName;
	private AddressDetails addressDetails;
	
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public AddressDetails getAddressDetails() {
		return addressDetails;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}
	

}