package com.udemy.sdetintcod.section3;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PanagramChecker {

	public static void main(String[] args) {
		Scanner scnsInp = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String textInput = scnsInp.nextLine();
		System.out.println("\nPanagram status string for '" + textInput + "' is : " + getPanagramStatus(textInput));
		scnsInp.close();
	}

	private static String getPanagramStatus(String textInput) {
	//Normalizing the input string
	textInput=textInput.replaceAll("^[a-z]","").toLowerCase();
	System.out.println("\nNormalized string : "+textInput);
	
	//Declaration of Set to maintain unique characters
	Set<Character> chrSetsTd=new HashSet<>();
	for (char charItems:textInput.toCharArray()) {
		if (charItems>='a' && charItems<='z') {
			chrSetsTd.add(charItems);
		}
	}
	//check condition for panagram checking
	return (chrSetsTd.size()==26)?"Its Panagram.":"Not a Panagram.";
	}

}