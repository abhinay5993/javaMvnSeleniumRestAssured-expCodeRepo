package com.udemy.sdetintcod.section4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceAndMaxOccChars {

	public static void main(String[] args) {
		Scanner scnsInp = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String textInput = scnsInp.nextLine();
		System.out.println("\n****** Repeted charecters occurance & max occurance of charecters *******");
		maxOccuranceOfRepeatedChars(textInput);
		scnsInp.close();
	}

	private static void maxOccuranceOfRepeatedChars(String textInput) {
	textInput=textInput.replaceAll("\\s","");
	
	//Store key-value of Repeated characters frequency.
	Map<Character,Integer> lnkHashMp=new HashMap<>();
	for (int i = 0; i < textInput.length(); i++) {
		char currentChar = textInput.charAt(i);
		if (lnkHashMp.containsKey(currentChar)) {
			lnkHashMp.put(currentChar,lnkHashMp.get(currentChar)+1);
		} else {
			lnkHashMp.put(currentChar,1);
		}
	}
	System.out.println("\nOccurance Of Charecters from Input Text : "+lnkHashMp);
	int max=0;
	char tempKey=' ';
	for (Map.Entry<Character, Integer> entry : lnkHashMp.entrySet()) {
		if(max<entry.getValue()) {
			tempKey=entry.getKey();
			max=entry.getValue();
		}
	}
	System.out.println("\nMaximum Occurance of Charecter : '"+tempKey+"' with occurance count : "+max+"");
	}

}