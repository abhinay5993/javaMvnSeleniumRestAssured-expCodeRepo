package com.udemy.autocodinground.prep26.strings;
import java.util.Scanner;

public class Q12CharCountWithoutTrailingSpaces {

	public static void main(String[] args) {
		Scanner scpIn = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strInputText = scpIn.nextLine();
		getCharCountWithWithoutTrailingWhiteSpaces(strInputText);
		scpIn.close();
	}

	private static void getCharCountWithWithoutTrailingWhiteSpaces(String strInputText) {
		if (strInputText == null || strInputText.isEmpty()) {
			System.out.println("\nOperation not possible as input text : " + strInputText);
			return;
		}
		int charCount = 0;
		for (int i = 0; i < strInputText.length(); i++) {
			if (strInputText.charAt(i) == ' ') {
				continue;
			}
			boolean isAfterTrailSpace = (i < strInputText.length() - 1 && strInputText.charAt(i + 1) == ' ');
			boolean isBeforeTrailSpace = (i > 0 && strInputText.charAt(i - 1) == ' ');
			if (!isAfterTrailSpace && !isBeforeTrailSpace) {
				charCount++;
			}
		}
		System.out.println("\nCharecter count without trailing whilte-spaces : " + charCount);
	}

}