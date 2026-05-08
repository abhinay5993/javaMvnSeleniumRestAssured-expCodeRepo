package com.udemy.sdetintcod.section9;
import java.util.Scanner;

public class ReverseEachCharsOfInputText {

	public static void main(String[] args) {
	Scanner scIn=new Scanner(System.in);
	System.out.println("\nEnter the input text : ");
	String strInptText=scIn.nextLine();
	System.out.println("\nReversed Each Words of input text : "+getWordOfReversedOfInputText(strInptText));
	scIn.close();
	}

	private static String getWordOfReversedOfInputText(String strInptText) {
		StringBuilder strBuildObj = new StringBuilder();
		//Linear Time-complexity & space optimized implementation.(Better space complexity O(1) constant)
		strBuildObj.append(new StringBuilder(strInptText).reverse());
		
		/* //Time & space non-optimized implementation.(specifically poor space complexity)
		for (int i = strInptText.length() - 1; i >= 0; i--) {
			strBuildObj.append(strInptText.charAt(i));
		}
		*/
		return strBuildObj.toString();
	}

}