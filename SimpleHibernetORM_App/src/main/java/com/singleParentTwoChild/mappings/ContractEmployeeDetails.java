package com.singleParentTwoChild.mappings;

public class ContractEmployeeDetails extends GenEmployee {
	
	private double ratePerHrsAmount;
	private long period;
	
	public double getRatePerHrsAmount() {
		return ratePerHrsAmount;
	}
	
	public long getPeriod() {
		return period;
	}
	
	public void setRatePerHrsAmount(double ratePerHrsAmount) {
		this.ratePerHrsAmount = ratePerHrsAmount;
	}
	public void setPeriod(long period) {
		this.period = period;
	}
	
}