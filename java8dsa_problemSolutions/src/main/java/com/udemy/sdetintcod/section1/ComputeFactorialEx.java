package com.udemy.sdetintcod.section1;
import java.util.Scanner;

public class ComputeFactorialEx {

	public static void main(String[] args) {
		Scanner scInput = new Scanner(System.in);
		System.out.print("\nEnter the Number : ");
		long inpNumX = scInput.nextLong();
		System.out.println("\nFactorial value : "+inpNumX+" ! = "+calculateFactorialOfNumber(inpNumX));
		scInput.close();
	}

	private static long calculateFactorialOfNumber(long inpNumX) {
		long factVal = 1;
		if (inpNumX == 0 || inpNumX == 1) {
			return factVal;
		}
		for (int i = 1; i <= inpNumX; i++) {
			factVal = factVal * i;
		}
		return factVal;
	}

}