package com.problemsolving.testUtilExps;

public class PrimeCheckerApp {
	
	public static void main(String[] args) {
		
		System.out.println("\nCheck it a Prime Number : "+isPrimeNumber(5));
		
	}
	
	public static boolean isPrimeNumber(long num) {
		boolean isPrimeFlag = false;
		if (num > 1) {
			int count = 0;
			for (int i = 1; i <=num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("\n" + num + " is Prime Number.");
				isPrimeFlag = true;
			} else {
				System.out.println("\n" + num + " is Not Prime Number.");
			}

		} else {
			System.out.println("\n" + num + " is not a Prime Number.");
		}
		
		return isPrimeFlag;
		}

}