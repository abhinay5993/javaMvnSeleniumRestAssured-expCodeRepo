package com.udemy.autocodinground.prep26.strings;
import java.util.Scanner;

public class Q9CountUpperCaseAndLowerCaseChars {

	public static void main(String[] args) {
		Scanner scpIn = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strInputText = scpIn.nextLine();
		countUpperCaseAndLowerCaseCharsFromInputText(strInputText);
		scpIn.close();
	}

	private static void countUpperCaseAndLowerCaseCharsFromInputText(String strInputText) {
		if (strInputText == null || strInputText.isEmpty()) {
			System.out.println("\nOperation not possible as input text : " + strInputText);
			return;
		}
		int upperCount = 0;
		int lowerCount = 0;
		for (char charItems : strInputText.toCharArray()) {
			if (Character.isUpperCase(charItems)) {
				System.out.println("Upper Char : "+charItems);
				upperCount++;
			}
			if (Character.isLowerCase(charItems)) {
				System.out.println("Lower Char : "+charItems);
				lowerCount++;
			}
		}
	System.out.println("\nUpper Case chars count : " + upperCount + " , Lower Case chars count : " + lowerCount + " ");
	}

}