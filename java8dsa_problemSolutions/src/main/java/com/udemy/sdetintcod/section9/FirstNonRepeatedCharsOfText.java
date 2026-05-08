package com.udemy.sdetintcod.section9;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharsOfText {

	public static void main(String[] args) {
		Scanner scIn=new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strInptText=scIn.nextLine();
		Character firstNonRepChar=getFirstNonRepeatedCharecterOfInputText(strInptText);
		if (firstNonRepChar!=null) {
		System.out.println("\nFirst non-repeated charecter : "+firstNonRepChar);
		} else {
		System.out.println("\nAll charecters in the input text is repeated.");
		}
		scIn.close();
	}

	private static Character getFirstNonRepeatedCharecterOfInputText(String strInptText) {
		Character result = null;
		// Declaration of 'charsMap' to keep track of each Characters of input text.
		Map<Character, Integer> charsMap = new HashMap<>();

		// Traverse through each character of input text.
		for (char chs : strInptText.toCharArray()) {
			// If particular 'Character' is seen the increase by 1 the 'value' part of 'charsMap' else keep 1
			charsMap.put(chs, charsMap.getOrDefault(chs, 0) + 1);
		}

		// Traverse through the filled 'charsMap'
		for (Map.Entry<Character, Integer> entry : charsMap.entrySet()) {
		//if the entry value of charsMap is 1 w.r.t assigned key 'Character' then assign the 'result' else keep the default.
		return result = (entry.getValue() == 1) ? entry.getKey() : result;
		}
	return result;
	}

}