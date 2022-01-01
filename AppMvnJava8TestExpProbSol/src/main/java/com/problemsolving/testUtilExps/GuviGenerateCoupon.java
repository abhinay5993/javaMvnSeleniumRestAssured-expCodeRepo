package com.problemsolving.testUtilExps;
import java.util.Scanner;

public class GuviGenerateCoupon {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Purchased Amount: Rs. : ");
		double purchAmt=sc.nextDouble();
		System.out.println("\n "+getGenerateCoupon(purchAmt));
	}
	
	public static String getGenerateCoupon(double amt) {
		String coponGen = "";
		if (amt >= 20000) {
			coponGen = "Free Trolley Suitcase";
		} else if (amt >= 10000) {
			coponGen = "Free Travel Bag";
		} else if (amt >= 5000) {
			coponGen = "Free BackPck";
		} else {
			coponGen = "Collect money even for cover we give";
		}
		return coponGen;
	}

}
