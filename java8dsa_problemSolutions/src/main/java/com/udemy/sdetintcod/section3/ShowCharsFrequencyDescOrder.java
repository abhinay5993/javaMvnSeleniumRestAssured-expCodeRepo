package com.udemy.sdetintcod.section3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowCharsFrequencyDescOrder {

	public static void main(String[] args) {
		Scanner scnsInp = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String textInput = scnsInp.next();
		System.out.println("\n***** Desc order sorted Charecter frequency ******");
		descSortedCharFrequency(textInput);
		scnsInp.close();
	}

	private static void descSortedCharFrequency(String textInput) {
	//Normalizing the input text
	textInput=textInput.toLowerCase().replaceAll("^[a-z]","");
	int inputTextLen=textInput.length();
	
	//Declaration of characters counts int[] frequency array with 256 ASCII Chars size
	int[] charCountsFrequency=new int[256];
	int frequncyArrayLen=charCountsFrequency.length;
	
	//push information to frequency array by traversing to input text charecters
	for (int i = 0; i < inputTextLen; i++) {
	charCountsFrequency[textInput.charAt(i)]++;
	}
	
	List<Character> lstOfChars=new ArrayList<>();
	//Traverse over the Frequency array & push element to Charecters list
	for (int i = 0; i < frequncyArrayLen; i++) {
		if (charCountsFrequency[i] > 0) {
			lstOfChars.add((char) i);
		}
	}
	
	//Bubble sort for Desc order on array list
	for (int i = 0; i <lstOfChars.size(); i++) {
		for (int j = i+1; j <lstOfChars.size(); j++) {
			if (charCountsFrequency[lstOfChars.get(j)]>charCountsFrequency[lstOfChars.get(i)]) {
				char temp=lstOfChars.get(i);
				lstOfChars.set(i,lstOfChars.get(j));
				lstOfChars.set(j,temp);
			}
		}
	}
	
	//Traverse to display the Disc sorted chars with count.
	for (Character charsItem : lstOfChars) {
		System.out.println("\n"+charsItem+" with count of : "+charCountsFrequency[charsItem]);
	}
	
	
	}

}