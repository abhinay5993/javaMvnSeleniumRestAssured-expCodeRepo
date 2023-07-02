package com.guvi.Java8BeginnMod;

public class LocalInnerClasApp {

	int a=100;
	void getData() {
		class LocalInner{
			int b=200;
			public void showData() {
				System.out.println("value of b="+b);
			
			}
		}
		LocalInner li=new LocalInner();
		li.showData();
		
	}
	
	public static void main(String[] args) {
		LocalInnerClasApp  lie=new LocalInnerClasApp();
		lie.getData();
	}

}