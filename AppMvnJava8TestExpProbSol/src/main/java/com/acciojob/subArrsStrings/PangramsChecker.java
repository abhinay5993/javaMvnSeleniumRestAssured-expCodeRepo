package com.acciojob.subArrsStrings;
import java.util.Scanner;

public class PangramsChecker {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("\nEnter input the String : ");
		String inpDat=scn.nextLine();
		System.out.println(isPangramData(inpDat.toLowerCase()));
	}
	
	public static String isPangramData(String inpStr) {
		boolean blnFlag[] = new boolean[26];
		String res = "pangram";
		for (int i = 0; i < inpStr.length(); i++) {
			char charX = inpStr.charAt(i);
			if (charX != ' ') {
				int index = charX - 'a';
				blnFlag[index] = true;
			}
		}

		for (int i = 0; i < blnFlag.length; i++) {
			if (blnFlag[i] == false) {
				return "not pangram";
			}
		}
		return res;
	}

}