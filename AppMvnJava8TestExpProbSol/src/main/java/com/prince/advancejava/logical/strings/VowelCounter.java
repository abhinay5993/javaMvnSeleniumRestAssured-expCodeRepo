package com.prince.advancejava.logical.strings;
import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		Scanner scrinp = new Scanner(System.in);
		System.out.print("\nEnter the input str data : ");
		String inpSetDat = scrinp.nextLine();
		System.out.println("\nThe Count of Vowel Charecters : " + getVowelCounter(inpSetDat));
	}

	private static int getVowelCounter(String inpSetDat) {
		int vowelCount = 0;
		char[] strCharArr = inpSetDat.toCharArray();
		for (char singleChars : strCharArr) {
			if ("aeiouAEIOU".contains(String.valueOf(singleChars))) {
				System.out.println("\nPicked Vowel : "+singleChars);
				vowelCount++;
			}
		}
		return vowelCount;
	}
	
}