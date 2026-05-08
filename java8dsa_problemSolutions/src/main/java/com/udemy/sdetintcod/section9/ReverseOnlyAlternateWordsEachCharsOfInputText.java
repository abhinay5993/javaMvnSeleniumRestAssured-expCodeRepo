package com.udemy.sdetintcod.section9;
import java.util.Scanner;

public class ReverseOnlyAlternateWordsEachCharsOfInputText {

	public static void main(String[] args) {
	Scanner scIn=new Scanner(System.in);
	System.out.println("\nEnter the input text : ");
	String strInptText=scIn.nextLine();
	System.out.println("\nReverse only alternate Words each charecters of input text : "+getOnlyAlternateWordsReverse(strInptText));
	scIn.close();
	}

	private static String getOnlyAlternateWordsReverse(String strInptText) {
		String[] wordsArray=strInptText.split(" ");
		StringBuilder strBuildObj = new StringBuilder();
		
		for (int i = 0; i < wordsArray.length; i++) {
			String strEachWords=wordsArray[i];
			if (i%2!=0) {
			//Linear Time-complexity & space optimized implementation.(Better space complexity O(1) constant)
			strBuildObj.append(new StringBuilder(strEachWords).reverse()).append(" ");		
			} else {
			strBuildObj.append(new StringBuilder(strEachWords)).append(" ");
			}
		}
		
		return strBuildObj.toString().trim();
	}

}