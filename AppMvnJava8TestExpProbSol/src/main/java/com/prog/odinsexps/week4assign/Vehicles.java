package com.prog.odinsexps.week4assign;

public class Vehicles {

	private String brandName;
	private int yearOfRegistration;
	private double price;
	
	public Vehicles(String brandName, int yearOfRegistration, double price) {
		this.brandName = brandName;
		this.yearOfRegistration = yearOfRegistration;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicles [brandName=" + brandName + ", yearOfRegistration=" + yearOfRegistration + ", price=" + price
				+ "]";
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
