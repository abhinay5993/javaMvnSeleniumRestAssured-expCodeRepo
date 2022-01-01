package com.problemsolving.testUtilExps;
import java.util.Scanner;

public class GuviComputeLeapYearInRange {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Lower bound Year : ");
		int lowYear=sc.nextInt();
		System.out.println("\nEnter Upper bound Year : ");
		int upperYear=sc.nextInt();
		System.out.println("\nLeap Year Between "+lowYear+" and "+upperYear+" : \n");
		getLeapYearInRange(lowYear,upperYear);
	}
	
	public static void getLeapYearInRange(int lowYear, int upperYear) {
		if (lowYear <= upperYear) {
			for (int i = lowYear; i <= upperYear; i++) {
				if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
					System.out.println("\n"+i+" Is leap Year");
				} else {
					System.out.println("\n"+i+" Is Not leap Year");
				}
			}
		} else {
			System.out.println("\nLower bound Year Should not be more than Upper bound Year!!!");
		}
	}


}