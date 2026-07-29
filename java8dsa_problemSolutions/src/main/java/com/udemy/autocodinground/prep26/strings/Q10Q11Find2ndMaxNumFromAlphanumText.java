package com.udemy.autocodinground.prep26.strings;
import java.util.Scanner;
import java.util.TreeSet;

public class Q10Q11Find2ndMaxNumFromAlphanumText {

	public static void main(String[] args) {
		Scanner scpIn = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strInputText = scpIn.nextLine();
		get2ndMaxNumFromInputText(strInputText);
		System.out.println("\nEnter the 2nd input text : ");
		String strInput2Text = scpIn.nextLine();
		int secMaxNum=extract2ndMaxNumFromText(strInput2Text);
		System.out.println("\n2nd Max number from input text : "+secMaxNum);
		scpIn.close();
	}

	private static int extract2ndMaxNumFromText(String strInput2Text) {
		if (strInput2Text == null || strInput2Text.isEmpty()) {
			System.out.println("\nOperation not possible as input text : " + strInput2Text);
			return Integer.MIN_VALUE;
		}
		int maxNum;
		TreeSet<Integer> sortedSetDat = new TreeSet<>();
		for (char charItems : strInput2Text.toCharArray()) {
			if (Character.isDigit(charItems)) {
				// Character to Integer conversion w.r.t ASCII sub-stractions
				int evalNum = charItems - '0';
				sortedSetDat.add(evalNum);
			}
		}
		// Delete max num from set.
		maxNum = sortedSetDat.pollLast();
		maxNum = sortedSetDat.getLast();
		return maxNum;
	}

	private static void get2ndMaxNumFromInputText(String strInputText) {
		if (strInputText == null || strInputText.isEmpty()) {
			System.out.println("\nOperation not possible as input text : " + strInputText);
			return;
		}
		int maxNum = Integer.MIN_VALUE;
		int secMaxNum = Integer.MIN_VALUE;
		for (char charItems : strInputText.toCharArray()) {
			if (Character.isDigit(charItems)) {
				System.out.println("Numberic Char Items : " + charItems);
				// Corresponding integer value w.r.t ASCII sub-stration.
				int evalNum = charItems - '0';
				if (evalNum > maxNum) {
					secMaxNum = maxNum;
					maxNum = evalNum;
				} else if (evalNum > secMaxNum && secMaxNum < maxNum) {
					secMaxNum = evalNum;
				}
			}
		}
		System.out.println("\n2nd Max number from input text : '" + strInputText + "' is : " + secMaxNum);
	}

}