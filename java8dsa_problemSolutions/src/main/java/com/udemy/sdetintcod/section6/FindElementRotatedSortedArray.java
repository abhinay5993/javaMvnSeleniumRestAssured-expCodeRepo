package com.udemy.sdetintcod.section6;
import java.util.Scanner;

public class FindElementRotatedSortedArray {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		int[] numArry = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println("\nEnter the Target element : ");
		int target = scin.nextInt();

		int resultIndex = findElementFromRotatedSortedArray(numArry, target);
		if (resultIndex != -1) {
			System.out.println("\n Traget item : " + numArry[resultIndex] + " found at : " + resultIndex + "");
		} else {
			System.out.println("\nItem not found!..");
		}
		scin.close();
	}

	/**
	 * Using two pointer approach.
	 * @param numArry
	 * @param target
	 * @return
	 * 
	 */
	private static int findElementFromRotatedSortedArray(int[] numArry, int target) {
		// Initialize start index.
		int left = 0;
		// Initialize right index.
		int right = numArry.length - 1;

		while (left <= right) {
			// Evaluate the mid-index
			int midIndex = left + (right - left) / 2;

			if (numArry[midIndex] == target) {
				// we found the index to store into result
				return midIndex;
			}

			//Helps to identify left half or right half is sorted.
			if (numArry[left] <= numArry[midIndex]) {
				if (target>=numArry[left] && target<numArry[midIndex]) {
					// Continue searching the left half by adjusting the 'right' index
					right = midIndex - 1;
				} else {
					// Continue searching the right half by adjusting the 'left' index
					left = midIndex + 1;
				}
			} else {
				//If left part is not sorted , then right part must be sorted.
				if (target<=numArry[right] && target>numArry[midIndex]) {
					// Continue searching the right half by adjusting the 'left' index
					left = midIndex + 1;
				} else {
					// Continue searching the left half by adjusting the 'right' index
					right = midIndex - 1;
				}
			}

		}
		return -1;
	}

}