package com.udemy.autocodinground.prep26.strings;
import java.util.Scanner;

public class Q15SumOfNumsFromSentence {

	public static void main(String[] args) {
		Scanner scpIn = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strInputText = scpIn.nextLine();
		int sumOfNums=countSumOfNumbersInputSentence(strInputText);
		System.out.println("\nSum of Nums : "+sumOfNums);
		scpIn.close();
	}

	private static int countSumOfNumbersInputSentence(String strInputText) {
		String[] strWords = strInputText.split(" ");
		int resultSums = 0;
		for (String letNums : strWords) {
			try {
				resultSums = resultSums + Integer.parseInt(letNums);
			} catch (NumberFormatException e) {
				//System.out.println("Exception : " + e);
			}
		}
		return resultSums;
	}

}