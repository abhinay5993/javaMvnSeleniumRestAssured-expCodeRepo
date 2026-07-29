package com.udemy.autocodinground.prep26.strings;
import java.util.Scanner;

public class Q19Q20ReverseEachWords {

	public static void main(String[] args) {
		Scanner scpIn = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strInputText = scpIn.nextLine();
		System.out.println("\nReversal of words using new String() implimentation : "+wordsReversalOfInputText(strInputText));
		System.out.println("\nEffecient Reversal of words using srtBuiders : "+effectiveReversalOfInputText(strInputText));
		scpIn.close();
	}

	private static String effectiveReversalOfInputText(String strInputText) {
		StringBuilder strBuildRes = new StringBuilder();
		for (String strEachWords : strInputText.split(" ")) {
			strBuildRes = strBuildRes.append(new StringBuilder(strEachWords).reverse()).append(" ");
		}
		return strBuildRes.toString().trim();
	}

	private static String wordsReversalOfInputText(String strInputText) {
		String strResult = "";
		String[] strWordsArr = strInputText.split(" ");
		for (String strEachWords : strWordsArr) {
			char[] charItems = strEachWords.toCharArray();
			int left = 0;
			int right = charItems.length - 1;
			strResult += String.valueOf(doTwoPointerCharSwapping(charItems, left, right)) + " ";
		}
		return strResult.trim();
	}

	private static char[] doTwoPointerCharSwapping(char[] charItems, int left, int right) {
		while (left < right) {
			char chTempHold = charItems[left];
			charItems[left] = charItems[right];
			charItems[right] = chTempHold;
			left++;
			right--;
		}
		return charItems;
	}

}