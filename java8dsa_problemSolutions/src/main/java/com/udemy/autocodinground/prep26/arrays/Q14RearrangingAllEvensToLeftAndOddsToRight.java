package com.udemy.autocodinground.prep26.arrays;
import java.util.Arrays;

public class Q14RearrangingAllEvensToLeftAndOddsToRight {

	public static void main(String[] args) {
		// Data set1
		int[] numArray = { 20, 10, 30, 20, 10, 40, 50, 5, 7, 25, 16, 21 };
		System.out.println("\nInput data array : " + Arrays.toString(numArray));
		rearrangingAllEvensToLeftEndOddsToRightEnd(numArray);

		// Data set2
		int[] num2Array = { 3,9,55,32,44,121,500,137,23,34,6,15,115 };
		System.out.println("\nInput data2 array : " + Arrays.toString(num2Array));
		rearrangingAllEvensToLeftEndOddsToRightEnd(num2Array);
	}

	private static void rearrangingAllEvensToLeftEndOddsToRightEnd(int[] numArray) {
		int left = 0;
		int right = numArray.length - 1;

		while (left < right) {
			// Move the left pointer forward if the number is already even
			while (left < right && numArray[left] % 2 == 0) {
				left++;
			}

			// Move the right pointer backward if the number is already odd
			while (left < right && numArray[right] % 2 != 0) {
				right--;
			}

			//If left is still less than right, it means we found a misplaced pair.
			//Swapping if left part element is odd & right part element is even
			if (left < right) {
				int temRes = numArray[left];
				numArray[left] = numArray[right];
				numArray[right] = temRes;
				left++;
				right--;
			}
		}
		int evenEnd=0;
		while (evenEnd<numArray.length && numArray[evenEnd]%2==0) {
		evenEnd++;
		}
		Arrays.sort(numArray, 0, evenEnd);
		Arrays.sort(numArray, evenEnd,numArray.length);
		System.out.println("\nSorted List Re-arranged elements : "+Arrays.toString(numArray));
	}

}