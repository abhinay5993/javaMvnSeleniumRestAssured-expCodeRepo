package com.udemy.sdetintcod.section4;
import java.util.Scanner;

/**
 * 
 * Part of TCS interview - 07-02-2026
 * 
 */
public class RemoveOnlyConsicutiveDuplicates {

	public static void main(String[] args) {
		Scanner scnsInp = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String textInput = scnsInp.nextLine();
		System.out.println("\n****** Remove only cosicutive repeated charecters *******");
		removeOnlyConsicutiveDuplicatesRepeatedChars(textInput);
		scnsInp.close();
	}

	private static void removeOnlyConsicutiveDuplicatesRepeatedChars(String textInput) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < textInput.length(); i++) {
			char current = textInput.charAt(i);

			// Keep spaces strictly
			if (current == ' ') {
				result.append(current);
				continue;
			}

			// Check if current character is part of a consecutive duplicate pair
			boolean isConsecutiveDuplicate = false;

			// Check the character to the right
			if (i < textInput.length() - 1 && current == textInput.charAt(i + 1)) {
				isConsecutiveDuplicate = true;
			}
			// Check the character to the left
			if (i > 0 && current == textInput.charAt(i - 1)) {
				isConsecutiveDuplicate = true;
			}

			// Strictly append only if it is a consecutive duplicate
			if (!isConsecutiveDuplicate) {
				result.append(current);
			}
		}

		System.out.println("Input:  " + textInput);
		System.out.println("Output: " + result.toString());
	}

}