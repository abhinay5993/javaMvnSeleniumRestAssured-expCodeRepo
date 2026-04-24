package com.udemy.sdetintcod.section6;
import java.util.Scanner;

/**
 * Get the position of last occurred element from sorted array
 * 
 */
public class GetLastOccuranceOfSortedArrayElements {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		int[] numArry = { 5,7,7,8,8,9,9,9,9,10,10,10,10,11 };
		System.out.println("\nEnter the Target element : ");
		int target = scin.nextInt();

		int resultIndex = getPositionOfLastOccuredTragetItem(numArry, target);
		if (resultIndex != -1) {
			System.out.println("\n Traget item : " + numArry[resultIndex] + " found at : " + resultIndex + "");
		} else {
			System.out.println("\nItem not found!..");
		}
		scin.close();
	}

	/**
	 * Two pointer approach to find traget element from sorted array.
	 * 
	 * @param numArry
	 * @param target
	 * @return
	 * 
	 */
	private static int getPositionOfLastOccuredTragetItem(int[] numArry, int target) {
		//to store the last occurred elements index.
		int result = -1;
		int left = 0;
		int right = numArry.length - 1;

		while (left <= right) {
			// Compute mid-Index for cut-down the search space
			int midIndex = left + (right - left) / 2;

			if (numArry[midIndex] == target) {
			//we found the index to store into result
			result = midIndex;
			//** To continue searching to the right sorted space adjust left index.
			left = midIndex + 1;
			}

			//Vital step as continue searching left sorted space
			if (numArry[midIndex] > target) {
			// To continue searching to the left sorted space adjust 'right' index.
			right = midIndex - 1;
			} else {
			// To continue searching to the right sorted space adjust 'left' index.
			left = midIndex + 1;
			}
		}
	return result;
	}
	
}