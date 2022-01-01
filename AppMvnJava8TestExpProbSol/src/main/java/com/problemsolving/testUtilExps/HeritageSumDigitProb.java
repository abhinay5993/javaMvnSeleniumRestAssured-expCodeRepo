package com.problemsolving.testUtilExps;

public class HeritageSumDigitProb {

	public static void main(String[] args) {
		long inpXdat=2345;
		computeSumOfDigitsTillSingleDigit(inpXdat);
	}

	public static void computeSumOfDigitsTillSingleDigit(long num) {
		long sumOfDigits = 0;
		while (num > 0) {
			sumOfDigits = num % 10;
			num = num / 10;
			if (num == 0 && sumOfDigits > 9) {
				num = sumOfDigits;
				sumOfDigits = 0;
			}
		}
		System.out.println("\nFinal Value of Sum : " + sumOfDigits);
		if (sumOfDigits == 1) {
			System.out.println("\nLucky number.");
		} else {
			System.out.println("\nNot a Lucky number.");
		}
	}

}