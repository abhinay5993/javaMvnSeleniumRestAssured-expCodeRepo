package com.prog.odinsexps.week5assign;
public class Vehicles{

	String brandName;
	int yearOfRegistration;
	double price;
	
	public Vehicles(String brName,int yearOfReg, double prVal) {
		this.brandName = brName;
		this.yearOfRegistration = yearOfReg;
		this.price = prVal;
	}

	public String getBrandName() {
		return brandName;
	}

	public int getYearOfRegistration() {
		return yearOfRegistration;
	}

	public double getPrice() {
		return price;
	}

}