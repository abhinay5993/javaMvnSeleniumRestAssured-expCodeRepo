package com.udemy.sdetintcod.section9;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindUniqueCharsOfText {

	public static void main(String[] args) {
		Scanner scIn=new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strInptText=scIn.nextLine();
		System.out.println("\n********** Unique Items from input text **************\n");
		FindUniqueCharsFromInputText(strInptText);
		scIn.close();
	}

	private static void FindUniqueCharsFromInputText(String strInptText) {
		// Initialization of hasMap to keep track of input chars and its repetation
		// count.
		Map<Character, Integer> charMaps = new HashMap<>();

		// Traverse through each 'Character' of input text.
		for (Character chItems : strInptText.toCharArray()) {
			//If current 'Character' key already exists into map then update the current item with Map value +1.
			if (charMaps.containsKey(chItems)) {
				charMaps.put(chItems,charMaps.get(chItems)+1);
			} else {
			//If current 'Character' key exists into 'charMaps' only once then update the value w.r.t key as 1.
			charMaps.put(chItems,1);
			}
		}

		// Iterate through 'charMaps'
		for (Map.Entry<Character, Integer> charMapEntry : charMaps.entrySet()) {
			if (charMapEntry.getValue() == 1) {
			System.out.print(charMapEntry.getKey() + " ");
			}
		}
	}

}