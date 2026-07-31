package com.udemy.autocodinground.prep26.strings;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q29DecodingTextSequence {

	public static void main(String[] args) {
	Scanner scpIn=new Scanner(System.in);
	System.out.print("\nEnter the alphanumeric input text : ");
	String strInpText=scpIn.nextLine();
	System.out.println("\nThe resultant Decoded version of text : "+convertToDecodedText(strInpText));
	//System.out.println("\nThe resultant Decoded version of text : \n"+optiConversionDecodedText(strInpText));
	scpIn.close();
	}

	private static String convertToDecodedText(String strInpText) {
		int strLen = strInpText.length();
		if (strInpText == null || strLen == 0) {
			System.out.println("\nOperation can't be performed..");
			return strInpText;
		}
		StringBuilder strBuildObj = new StringBuilder();
		for (int i = 0; i < strLen; i = i + 2) {
			char lettterItems = strInpText.charAt(i);
			// Character to Integer conversion w.r.t ASCII sub-stractions with '0'
			int letterCounts = strInpText.charAt(i + 1) - '0';
			System.out.println("\nConverted integer val using ASCII sub-stractions : " + letterCounts);
			// Character to Integer conversion with in-build method.
			int letter2Counts = Character.getNumericValue(strInpText.charAt(i + 1));
			System.out.println("\nConverted integer val using getNumericValue() : " + letter2Counts);

			for (int j = 0; j < letterCounts; j++) {
				strBuildObj.append(lettterItems);
			}
		}
		return strBuildObj.toString();
	}
	
	private static String optiConversionDecodedText(String strInpText) {
		int strLen = strInpText.length();
		if (strInpText == null || strLen == 0) {
			System.out.println("\nOperation can't be performed..");
			return strInpText;
		}
		// Define a regex pattern to find all sequences of digits
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(strInpText);

		StringBuilder strBuildObj = new StringBuilder();
		int letterCounts = 0;
		char letters = 0;
		while (matcher.find()) {
			// Handle multi-digit numbers (e.g., 100)
			letterCounts = Integer.parseInt(matcher.group());
			System.out.println("\nConverted integer val using getNumericValue() : " + letterCounts);
			
			for (char items:strInpText.toCharArray()) {
				if (Character.isLetter(items)) {
					letters=items;
				}
			}
		}
		for (int j = 0; j < letterCounts; j++) {
			strBuildObj.append(letters);
		}
		return strBuildObj.toString();
	}

}