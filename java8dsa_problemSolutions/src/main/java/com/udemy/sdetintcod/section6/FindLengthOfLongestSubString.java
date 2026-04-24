package com.udemy.sdetintcod.section6;
import java.util.HashMap;
import java.util.Scanner;

public class FindLengthOfLongestSubString {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strText = scin.nextLine();
		System.out.println("\nCalculated length of the longest sub-string : "+getLengthOfLongestSubString(strText));
		scin.close();
	}

	
	/**
	 * Sliding window with HashMap
	 * @param strText
	 * @return
	 * 
	 */
	private static int getLengthOfLongestSubString(String strText) {
		int maxLen = 0;
		// Declaration of hasMap to store keep track recent index of characters
		HashMap<Character, Integer> hashMapCont = new HashMap<>();
		//start index of sliding window
		int startIndex = 0;

		// Iterate through each character from input text.
		for (int i = 0; i < strText.length(); i++) {
			char charItems = strText.charAt(i);

			//If character is already into window , update the start position 
			if (hashMapCont.containsKey(charItems) && hashMapCont.get(charItems) >= startIndex) {
				// update the startIndex to the right of the last occurrence
				startIndex = hashMapCont.get(charItems) + 1;
			}
			// Keep track of current character with its associated most recent index of Integer value
			hashMapCont.put(charItems, i);

			// Evaluate the length of current window and update the maxLen
			maxLen = Math.max(maxLen, i - startIndex + 1);
		}
		return maxLen;
	}

}