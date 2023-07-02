package com.hbmonetonemapptbl.mappojo;

public class AddressDetails {
	
	private int addresId;
	private String addPinCode,laneno,city,state;
	private EmployeeDetails employeeDetails;
	
	public int getAddresId() {
		return addresId;
	}
	
	public String getAddPinCode() {
		return addPinCode;
	}
	
	public String getLaneno() {
		return laneno;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}
	
	public void setAddresId(int addresId) {
		this.addresId = addresId;
	}
	
	public void setAddPinCode(String addPinCode) {
		this.addPinCode = addPinCode;
	}
	
	public void setLaneno(String laneno) {
		this.laneno = laneno;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	
	
}