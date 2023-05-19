package com.singleParentTwoChild.mappings;

public class RegularEmployeeDetails extends GenEmployee {
	
	private double salaryAmount;
	private double bonusAmount;
	
	public double getSalaryAmount() {
		return salaryAmount;
	}
	
	public double getBonusAmount() {
		return bonusAmount;
	}
	
	public void setSalaryAmount(double salaryAmount) {
		this.salaryAmount = salaryAmount;
	}
	
	public void setBonusAmount(double bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

}