package com.udemy.autocodinground.prep26.strings;
import java.util.Scanner;

public class Q8ReverseFirstWordByKeepingOthersIntact {

	public static void main(String[] args) {
		Scanner scpIn = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strInputText = scpIn.nextLine();
		reverseFirstWordFromInputText(strInputText);
		scpIn.close();
	}

	private static void reverseFirstWordFromInputText(String strInputText) {
		if (strInputText == null || strInputText.isEmpty()) {
			System.out.println("\nOperation not possible as input text : "+strInputText);
			return;
		}
		//Splitting the entire input text only into String[] of size 2 for effecient computation.
		String[] strWordArr=strInputText.split(" ", 2);
		//Char array conversion from string
		char[] firstWordCharArr=strWordArr[0].toCharArray();
		String strRevWord=reverseFirstWord(firstWordCharArr);
		String strResult=strRevWord+" "+strWordArr[1];
		System.out.println("\nResultant Output : "+strResult);
	}

	private static String reverseFirstWord(char[] firstWordCharArr) {
		int left = 0;
		int right = firstWordCharArr.length - 1;
		while (left < right) {
			char strRevRes = firstWordCharArr[left];
			firstWordCharArr[left] = firstWordCharArr[right];
			firstWordCharArr[right] = strRevRes;
			left++;
			right--;
		}
		return String.valueOf(firstWordCharArr);
	}

}