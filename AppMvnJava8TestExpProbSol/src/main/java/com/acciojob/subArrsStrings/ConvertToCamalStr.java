package com.acciojob.subArrsStrings;
import java.util.Scanner;

public class ConvertToCamalStr {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("\nEnter the input String : ");
		String inpStr=scn.next();
		System.out.println("\nCaptialize Item : "+getCapitalizeChar(inpStr.charAt(0)));
		System.out.println("\nCamal Case of Input String : "+getCamelCaseOfStr(inpStr));
	}

	private static String getCamelCaseOfStr(String inpStr) {
		inpStr=inpStr.toLowerCase();
		String[] splitArr = inpStr.split("_");
		StringBuilder sbObj = new StringBuilder();
		String firstPart = splitArr[0];
		sbObj.append(firstPart);
		for (int i = 1; i <splitArr.length; i++) {
			String str=splitArr[i];
			char equiUpperChar=Character.toUpperCase(str.charAt(0));
			sbObj.append(equiUpperChar);
			sbObj.append(str.substring(1));
		}
		return sbObj.toString();
	}
	
	private static char getCapitalizeChar(char inpChar) {
		int dist=inpChar-'a';
		char captialChar=(char) ('A'+dist);
		return captialChar;
	}

}