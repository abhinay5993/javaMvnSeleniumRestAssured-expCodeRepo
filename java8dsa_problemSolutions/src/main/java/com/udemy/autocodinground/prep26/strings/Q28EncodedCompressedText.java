package com.udemy.autocodinground.prep26.strings;
import java.util.Scanner;

public class Q28EncodedCompressedText {

	public static void main(String[] args) {
		Scanner scpIn=new Scanner(System.in);
		System.out.print("\nEnter the alphanumeric input text : ");
		String strInpText=scpIn.nextLine();
		System.out.println("\nThe resultant Encoded compressed version of text : "+convertToEncodedCompressedText(strInpText));
		scpIn.close();
	}

	private static String convertToEncodedCompressedText(String strInpText) {
		if (strInpText == null || strInpText.isEmpty()) {
			System.out.println("\nOperation can't be performed..");
			return strInpText;
		}
		StringBuilder strBuildObj = new StringBuilder();
		int strSrcTextLen = strInpText.length();
		int compOccCount=0;
		for (int i = 0; i < strSrcTextLen; i++) {
			compOccCount++;
			if (i+1==strSrcTextLen || strInpText.charAt(i)!=strInpText.charAt(i+1)) {
			strBuildObj.append(strInpText.charAt(i)).append(compOccCount);
			// reseting the compOccCount count to 0.
			compOccCount=0;
			}
		}
		int lenOfComStr=strBuildObj.toString().length();
		return (lenOfComStr<strSrcTextLen)?strBuildObj.toString():strInpText;
	}

}