package com.udemy.sdetintcod.section9;
import java.util.Scanner;

public class RemoveDuplicateCharsFromText {

	public static void main(String[] args) {
		Scanner scIn=new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strInptText=scIn.nextLine();
		System.out.println("\nDuplicate charecter removed text : "+removeDuplicateCharsOfInputText(strInptText));
		scIn.close();
	}

	private static String removeDuplicateCharsOfInputText(String strInptText) {
	//Diclaration of mutable stringBuilder for better manipulation performance
	StringBuilder strBuildObj=new StringBuilder();
	//diclaration of boolean array of size 256 for possible character sets (ASCII Set)
	boolean[] blnSeen=new boolean[256];
	
	for (char currItems:strInptText.toCharArray()) {
		if (!blnSeen[currItems]) {
			blnSeen[currItems]=true;
			strBuildObj.append(currItems);
		}
	}
	return strBuildObj.toString();
	}


}