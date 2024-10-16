package com.prince.advancejava.logical.strings;
import java.util.Scanner;

public class SentenceReversal {

	public static void main(String[] args) {
	Scanner scrinp=new Scanner(System.in);
	System.out.print("\nEnter the input str data : ");
	String inpSetDat=scrinp.nextLine();
	System.out.println("\nThe output reversal string : "+getSentenceReversalString(inpSetDat));
	}

	private static String getSentenceReversalString(String inpSetDat) {
		String strResult = " ";
		String[] splittedStrArray = inpSetDat.split(" ");
		for (int i = 0; i < splittedStrArray.length; i++) {
			String strEachWord = splittedStrArray[i];
			strResult = strResult+doReversalString(strEachWord);
		}
		return strResult;
	}

	private static String doReversalString(String strEachWord) {
		String strRevResult = " ";
		for (int j = strEachWord.length() - 1; j >= 0; j--) {
			strRevResult = strRevResult + strEachWord.charAt(j);
		}
		return strRevResult;
	}
	
}