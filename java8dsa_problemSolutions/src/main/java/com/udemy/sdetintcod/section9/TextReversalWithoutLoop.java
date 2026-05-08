package com.udemy.sdetintcod.section9;
import java.util.Scanner;

/**
 * String reversal with recursion.
 * 
 */
public class TextReversalWithoutLoop {

	public static void main(String[] args) {
	Scanner scIn=new Scanner(System.in);
	System.out.println("\nEnter the input text : ");
	String strInptText=scIn.nextLine();
	System.out.println("\nValue of Reversed text without loop : "+textReverseWithoutLoop(strInptText));
	scIn.close();
	}

	private static String textReverseWithoutLoop(String strInptText) {
		// defining base condition.
		if (strInptText == null || strInptText.isEmpty() || strInptText.length() == 1) {
			return strInptText;
		}

		// reversal by calling the same method by reducing length using through
		// substring() starting from 2nd position and appending 1st charecter of input
		// string
	return textReverseWithoutLoop(strInptText.substring(1)) + strInptText.charAt(0);
	}

}