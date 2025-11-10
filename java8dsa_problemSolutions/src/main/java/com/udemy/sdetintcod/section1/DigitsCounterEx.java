package com.udemy.sdetintcod.section1;
import java.util.Scanner;

public class DigitsCounterEx {

	public static void main(String[] args) {
		Scanner scInput = new Scanner(System.in);
		System.out.print("\nEnter the Number : ");
		long inpNumX = scInput.nextLong();
		System.out.println("\nThe number digits for the number "+inpNumX+" is : "+getNumberOfDigits(inpNumX));
		System.out.println("**********************************************");
		computeNumberOfOddsAndEvenDigitsOfInputNumber(inpNumX);
		scInput.close();
	}

	private static void computeNumberOfOddsAndEvenDigitsOfInputNumber(long inpNumX) {
	int oddCount = 0, evenCount = 0;
	long tempNum=inpNumX;
	while (tempNum != 0) {
			long lastDigits = (tempNum % 10);
			if (lastDigits % 2 == 0) {
				System.out.println("\nEven Digits : "+lastDigits);
				evenCount++;
			}
			else {
			System.out.println("\nOdd Digits : "+lastDigits);
			oddCount++;
			}
			tempNum = tempNum / 10;
	}
	System.out.println("\nNumber of Even digits for the number "+inpNumX+" is : "+evenCount);
	System.out.println("\nNumber of Odd digits for the number "+inpNumX+" is : "+oddCount);
	}

	private static int getNumberOfDigits(long inpNumX) {
		int countOfDigit = 0;
		while (inpNumX != 0) {
			inpNumX = inpNumX / 10;
			countOfDigit++;
		}
		return countOfDigit;
	}

}