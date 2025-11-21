package com.udemy.sdetintcod.section3;
import java.util.Scanner;

public class PrintTheCountOfVowels {

	public static void main(String[] args) {
		Scanner scnsInp = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String textInput = scnsInp.nextLine();
		System.out.println("\nCount of Vowels into '"+textInput+"' is : "+getCountOfVowels(textInput));
		scnsInp.close();
	}

	private static int getCountOfVowels(String textInput) {
		textInput = textInput.replaceAll("[\\d\\s]+", "").toLowerCase();
		System.out.println("\nNormalized String : "+textInput);
		int countOfVowels = 0;
		for (char ch : textInput.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("Filtered Vowels : "+ch);
				countOfVowels++;
			}
		}
		return countOfVowels;
	}

}