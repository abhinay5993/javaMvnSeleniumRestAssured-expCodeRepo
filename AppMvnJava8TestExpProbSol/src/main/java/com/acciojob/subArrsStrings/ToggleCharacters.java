package com.acciojob.subArrsStrings;
import java.util.Scanner;

public class ToggleCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the String : ");
		String S=sc.nextLine();
		System.out.println("\nToggeled Value of String : "+getToggerString(S));
	}
	
	public static String getToggerString(String inpDat) {
		String tempStr = "";
		for (int i = 0; i < inpDat.length(); i++) {
			char ch = inpDat.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				int dist = (ch-'a');
				char upper = (char) ('A' + dist);
				tempStr = tempStr + upper;
			} else if (ch >= 'A' && ch <= 'Z') {
				int dist = (ch-'A');
				char lower = (char) ('a' + dist);
				tempStr = tempStr + lower;
			} else {
				tempStr = tempStr + ch;
			}
		}
		return tempStr;
	}

}