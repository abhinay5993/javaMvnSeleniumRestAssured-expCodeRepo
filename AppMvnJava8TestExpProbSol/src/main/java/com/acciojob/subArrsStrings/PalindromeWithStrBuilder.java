package com.acciojob.subArrsStrings;
import java.util.Scanner;

import com.problemsolving.testUtilExps.readConfigData;

public class PalindromeWithStrBuilder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the String : ");
		String inpStr=sc.nextLine();
		System.out.println("\nPalindrom Status : "+isPalindrom(inpStr));
	}

	private static int isPalindrom(String str) {
		StringBuilder sbObj = new StringBuilder();
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
				sbObj.append(ch);
			}
		}
		str=sbObj.toString();
		System.out.println("status : "+str);
		int start = 0, end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return 0;
			}
			start++;
			end--;
		}
		return 1;
	}

}