package com.problemsolving.testUtilExps;

public class HeritageTwistedPrimeChecker {

	public static void main(String[] args) {
		long inpNum = 7;
		System.out.println("\nGiven Number : " + inpNum);
		System.out.println("\nCheck Number is Prime or Not : " + isPrimeNumber(inpNum));
		System.out.println("\nReversal of the number : " + getNumericReverse(inpNum));
		
		long reverseNum = getNumericReverse(inpNum);
		System.out.println("\nCheck Reversed Number is Prime or Not : " + isPrimeNumber(reverseNum));
		
		if (isPrimeNumber(inpNum) && isPrimeNumber(reverseNum)) {
			System.out.println("\nTwisted Prime");
		} else {
			System.out.println("\nNot a Twisted Prime");
		}
	}
	
	public static long getNumericReverse(long num) {
		long rev = 0, reminder;
		while (num != 0) {
			reminder = (num % 10);
			rev = rev * 10 + reminder;
			num = num / 10;
		}
		return rev;
	}
	
	public static boolean isPrimeNumber(long num) {
		boolean isPrimeFlag = false;
		if (num > 1) {
			int count = 0;
			for (int i = 1; i <= num; i++) {
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