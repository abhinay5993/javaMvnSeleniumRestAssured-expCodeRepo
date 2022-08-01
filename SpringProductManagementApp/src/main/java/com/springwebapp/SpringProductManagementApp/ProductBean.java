package com.springwebapp.SpringProductManagementApp;

public class ProductBean implements IProductDetails {

	private int pid;
	private String pname;
	private double price;

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void showProductList() {
		System.out.println("\nProduct Details - "+pid+" , "+pname+" , "+price+" ");
	}
	
	
}