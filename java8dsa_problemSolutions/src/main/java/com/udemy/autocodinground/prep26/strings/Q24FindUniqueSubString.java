package com.udemy.autocodinground.prep26.strings;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q24FindUniqueSubString {

	public static void main(String[] args) {
		Scanner scpIn = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strInputText = scpIn.nextLine();
		System.out.println("\nThe extracted unique sub-string : "+evaluateUniqueSubSting(strInputText));
		scpIn.close();
	}

	private static String evaluateUniqueSubSting(String strInputText) {
		if (strInputText == null || strInputText.isEmpty()) {
			return strInputText;
		}
		StringBuilder strBuildObj = new StringBuilder();
		Set<Character> lnkHashSet = new LinkedHashSet<>();
		for (char chrItems : strInputText.toCharArray()) {
			if (lnkHashSet.add(chrItems)) {
				strBuildObj.append(chrItems);
			}
		}
		return strBuildObj.toString();
	}

}