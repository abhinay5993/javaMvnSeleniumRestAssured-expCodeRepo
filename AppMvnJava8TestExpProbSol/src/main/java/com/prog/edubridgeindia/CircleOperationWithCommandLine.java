package com.prog.edubridgeindia;

public class CircleOperationWithCommandLine {

	public static void main(String[] args) {
		double piVal=Double.parseDouble(args[0]);
		System.out.println("\nEntered PI Value : "+piVal);
		double r=Double.parseDouble(args[1]);
		System.out.println("\nEntered Redious : "+r);
		double areaOfCirc=(piVal*r*r);
		System.out.println("\nArea of Circle : "+areaOfCirc);
	}

}
