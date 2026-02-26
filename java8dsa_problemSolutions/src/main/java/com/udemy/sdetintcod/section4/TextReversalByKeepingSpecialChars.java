package com.udemy.sdetintcod.section4;
import java.util.Scanner;

/**
 * 
 * Part of TCS interview - 07-02-2026
 * 
 */
public class TextReversalByKeepingSpecialChars {

	public static void main(String[] args) {
		Scanner scnsInp = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String textInput = scnsInp.nextLine();
		System.out.println("\n****** Reversed Text *******");
		doTextReversalByKeepingSpecial(textInput);
		scnsInp.close();
	}

	/**
	 * Using Two pointer approach.
	 * @param textInput
	 * 
	 */
	private static void doTextReversalByKeepingSpecial(String textInput) {
		String resOut = "";
		char[] charArray = textInput.toCharArray();
		int left = 0;
		int right = textInput.length() - 1;

		while (left < right) {
			if (!Character.isLetterOrDigit(charArray[left])) {
				left++;
			}

			if (!Character.isLetterOrDigit(charArray[right])) {
				right--;
			}

			char tempHold = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = tempHold;
			left++;
			right--;
		}
		resOut=resOut+String.valueOf(charArray);
		System.out.println("\nResultant Transformed Reversed Text : "+resOut);
	}

}