package com.geeksforgeeks.jbdl;

public class CountOccuranceOfDigit {

	public static void main(String[] args) {
		int inputNumer = 840983302;
		int occuranceTobeCheck = 3;
		System.out.println("\nThe num of occurance of " + occuranceTobeCheck + " into given number " + inputNumer
				+ "  => " + countOccuranceOfDigitByGivenNumber(inputNumer, occuranceTobeCheck));
	}

	public static int countOccuranceOfDigitByGivenNumber(int numData, int searchedDigit) {
		int count = 0;
		while (numData != 0) {
			int modRemainder = (numData % 10);

			if (modRemainder == searchedDigit) {
				count++;
			}
			numData = numData / 10;
		}
		return count;
	}

}