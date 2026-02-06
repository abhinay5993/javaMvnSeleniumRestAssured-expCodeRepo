package com.udemy.sdetintcod.section3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordFinder {

	public static void main(String[] args) {
		Scanner scnsInp = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String textInput = scnsInp.nextLine();
		System.out.println("\n****** Duplicated Words *******");
		showRepeatedWords(textInput);
		scnsInp.close();
	}

	private static void showRepeatedWords(String textInput) {
		// Normalizing the input string
		textInput = textInput.toLowerCase();

		// get the words array
		String[] strWordsArr = textInput.split("[\\W_]+");

		// Declaration of Map to hold duplicate values
		Map<String, Integer> hMapObj = new HashMap<>();
		for (String strWordItems : strWordsArr) {
			if (!strWordItems.isEmpty()) {
				hMapObj.put(strWordItems, hMapObj.getOrDefault(strWordItems, 0) + 1);
			}
		}

		boolean duplicateFlag=false;
		for (Map.Entry<String, Integer> entry : hMapObj.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("\n The word : '" + entry.getKey() + "' repeated : " + entry.getValue() + " times.");
				duplicateFlag=true;
			}
		}
		
		if (!duplicateFlag) {
			System.out.println("No!!..duplicate found..");
		}
		
		
	}

}