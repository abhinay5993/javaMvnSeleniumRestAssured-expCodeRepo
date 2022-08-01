package com.dsa.hershalGoogleSdet;
import java.util.Scanner;

public class ValidateStrAnagram {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the first String : ");
		String s1=sc.nextLine();
		System.out.println("\nEnter the second String : ");
		String s2=sc.nextLine();
		System.out.println("\n Validate String ( s1: "+s1+" and s2 : "+s2+" ) is Anagram : "+isAnagram(s1,s2));
	}

	private static String isAnagram(String s1, String s2) {
		String resultVal = "Yes";
		if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty() || (s1.length() != s2.length())) {
			return "No";
		}
		int[] alphaArray = new int[127];

		for (char c : s1.toCharArray()) {
			alphaArray[c]++;
		}

		for (char c : s2.toCharArray()) {
			alphaArray[c]--;
		}

		for (int charCount : alphaArray) {
			if (charCount > 0 || charCount < 0) {
				resultVal = "No";
			}
		}
		return resultVal;
	}

}
