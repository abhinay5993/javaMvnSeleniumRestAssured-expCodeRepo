package com.udemy.sdetintcod.section6;
import java.util.Scanner;

public class GenerateAllPossibleSubStrings {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strText = scin.nextLine();
		System.out.println("************************************");
		populatePossibleSubStringsFromInput(strText);
		scin.close();
	}

	private static void populatePossibleSubStringsFromInput(String strText) {
		int strLen = strText.length();
		// Outer loop to traverse each characters
		for (int i = 0; i < strLen; i++) {
			// Inner loop to traverse next items after ith position till the inclusive of
			// input text length
			for (int j = i + 1; j <=strLen; j++) {
				System.out.print(" " + strText.substring(i, j));
			}
		}
	}

}
