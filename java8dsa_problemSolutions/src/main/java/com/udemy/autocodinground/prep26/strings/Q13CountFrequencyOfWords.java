package com.udemy.autocodinground.prep26.strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q13CountFrequencyOfWords {

	public static void main(String[] args) {
		Scanner scpIn = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strInputText = scpIn.nextLine();
		countFrequencyOfWordsFromInputText(strInputText);
		scpIn.close();
	}

	private static void countFrequencyOfWordsFromInputText(String strInputText) {
		if (strInputText.isEmpty() || strInputText == null) {
			System.out.println("\nOperation not possible as input text : " + strInputText);
			return;
		}
		Map<String, Integer> hasMpObj = new HashMap<>();
		String[] inputWords = strInputText.split(" ");
		for (String strWordItems:inputWords) {
			hasMpObj.put(strWordItems, hasMpObj.getOrDefault(strWordItems, 0) + 1);
		}
		
		for (Map.Entry<String, Integer> entry : hasMpObj.entrySet()) {
			String key = entry.getKey();
			Integer vals = entry.getValue();
			System.out.println("\n " + key + " ==> " + vals + " ");
		}
	}

}