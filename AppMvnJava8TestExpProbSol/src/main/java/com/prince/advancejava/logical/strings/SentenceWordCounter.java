package com.prince.advancejava.logical.strings;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SentenceWordCounter {

	public static void main(String[] args) {
		Scanner scrinp = new Scanner(System.in);
		System.out.print("\nEnter the input str data : ");
		String inpSetDat = scrinp.nextLine();
		StringTokenizer stringToken=new StringTokenizer(inpSetDat.trim());
		System.out.println("\nNo of Words : "+stringToken.countTokens());
	}
}