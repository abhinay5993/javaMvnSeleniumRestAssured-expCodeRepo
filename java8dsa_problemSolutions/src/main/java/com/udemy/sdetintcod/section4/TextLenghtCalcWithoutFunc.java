package com.udemy.sdetintcod.section4;
import java.util.Scanner;

public class TextLenghtCalcWithoutFunc {

	public static void main(String[] args) {
		Scanner scnsInp = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String textInput = scnsInp.nextLine();
		System.out.println("\nComputed lenght of the input text : "+lenOfText(textInput));
		textVowelsAndConsonantsCounter(textInput);
		scnsInp.close();
	}

	private static int lenOfText(String textInput) {
		int lenCount = 0;
		for (char chItems : textInput.toCharArray()) {
			lenCount++;
		}
		return lenCount;
	}

	/**
	 * Count Vowels and Consonants
	 * @param textInput
	 */
	private static void textVowelsAndConsonantsCounter(String textInput) {
		textInput = textInput.toLowerCase().replaceAll("[^a-z]","");
		System.out.println("\nGeneralized string : " + textInput);
		int vowelCount = 0;
		int consoCount = 0;
		for (char chItems : textInput.toCharArray()) {
				if (chItems == 'a' || chItems == 'e' || chItems == 'i' || chItems == 'o' || chItems == 'u') {
					vowelCount++;
				}
				else {
					consoCount++;	
				}
		}
		System.out.println("\nNumber of Vowels : "+vowelCount);
		System.out.println("\nNumber of Consonent : "+consoCount);
	}

}