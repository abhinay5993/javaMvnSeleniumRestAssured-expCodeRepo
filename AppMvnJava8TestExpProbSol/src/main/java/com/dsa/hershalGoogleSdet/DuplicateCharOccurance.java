package com.dsa.hershalGoogleSdet;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateCharOccurance {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the String : ");
		String s1=sc.nextLine();
		System.out.println("\nCompute duplicate charecters : ");
		getDuplicateCharsFromString(s1);
	}

	private static void getDuplicateCharsFromString(String s1) {
		if (s1 == null || s1.isEmpty()) {
			return;
		}

		Map<Character, Integer> hm = new HashMap<>();
		for (char ch : s1.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}

		for (Entry<Character, Integer> entryItem : hm.entrySet()) {
			if (entryItem.getValue() > 1) {
				System.out.println("\nDuplicate Items with Count " + entryItem.getKey() + " : " + entryItem.getValue());
			}
		}
	}

}