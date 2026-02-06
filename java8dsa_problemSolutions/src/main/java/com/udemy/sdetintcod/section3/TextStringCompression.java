package com.udemy.sdetintcod.section3;
import java.util.Scanner;

public class TextStringCompression {

	public static void main(String[] args) {
		Scanner scnsInp = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String textInput = scnsInp.nextLine();
		System.out.println("\nCompressed output string for '" + textInput + "' is : " + getCompressedText(textInput));
		scnsInp.close();
	}

	private static String getCompressedText(String textInput) {
		if (textInput == null || textInput.isEmpty()) {
			return textInput;
		}

		int strSrcOrgLen = textInput.length();
		// Using StringBuilder for efficient mutable string operation
		StringBuilder strBuild = new StringBuilder();
		int charOccCount = 0;

		for (int i = 0; i < strSrcOrgLen; i++) {
			charOccCount++;
			if (i + 1 == strSrcOrgLen || textInput.charAt(i) != textInput.charAt(i + 1)) {
				strBuild.append(textInput.charAt(i)).append(charOccCount);
				// reseting the occurrence count to 0.
				charOccCount = 0;
			}
		}
		// Length computation for compressed string
		int strCompressLen = strBuild.toString().length();

		// Checking length original input-text vs compressed string.
		return (strCompressLen < strSrcOrgLen) ? strBuild.toString() : textInput;
	}

}