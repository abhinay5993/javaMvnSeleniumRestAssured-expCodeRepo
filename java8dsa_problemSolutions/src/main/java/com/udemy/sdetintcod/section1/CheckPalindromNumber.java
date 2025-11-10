package com.udemy.sdetintcod.section1;
import java.util.Scanner;

public class CheckPalindromNumber {

	public static void main(String[] args) {
		Scanner scInput = new Scanner(System.in);
		System.out.print("\nEnter the Number : ");
		long inpNumX = scInput.nextLong();
		isNumberIsPalindrom(inpNumX);
		System.out.println("\n*************************************");
		System.out.print("\nEnter the input text string : ");
		String inpTextdt = scInput.next();
		stringPalindromChecker(inpTextdt);
		scInput.close();
	}

	//madam
	private static void stringPalindromChecker(String inpTextdt) {
		boolean statusFlag = true;
		inpTextdt=inpTextdt.replaceAll("\\s","").toLowerCase();
		int leftIndex = 0;
		int rightIndex = inpTextdt.length() - 1;
		while (leftIndex <= rightIndex) {
			if (inpTextdt.charAt(leftIndex) != inpTextdt.charAt(rightIndex)) {
				statusFlag = false;
				break;
			}
			leftIndex++;
			rightIndex--;
		}
		if (statusFlag) {
			System.out.println("\n" + inpTextdt + " is a Palindrom string.");
		} else {
			System.out.println("\n" + inpTextdt + " is not a Palindrom string.");
		}
	}

	
	private static void isNumberIsPalindrom(long inpNumX) {
		long tempOrgNum = inpNumX, refNum = 0, remMod;
		while (tempOrgNum != 0) {
			remMod = (tempOrgNum % 10);
			refNum = refNum * 10 + remMod;
			tempOrgNum = (tempOrgNum / 10);
		}
		System.out.println("\nValue " + inpNumX + " of Reversed number : " + refNum);
		if (refNum == inpNumX) {
			System.out.println(inpNumX + " is a Palindrom Number");
		} else {
			System.out.println(inpNumX + " is not a Palindrom Number");
		}
	}

}