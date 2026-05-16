package com.udemy.sdetintcod.section8;
import java.util.Arrays;

public class InPlaceReversalOfArraysWithTwoPointer {

	public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5};
	System.out.println("\nInput array : "+Arrays.toString(arr));
	performInPlaceReversal(arr);
	System.out.println("\nIn-Place Reversed array with two pointers : "+Arrays.toString(arr));
	}

	private static void performInPlaceReversal(int[] arr) {
		// initialization of two pointers
		int left = 0;
		int right = arr.length - 1;

		// Traverse through array elements
		while (left < right) {
			// perform array elements swapping w.r.t to 'left' and 'right' index.
			int tempHold = arr[left];
			arr[left] = arr[right];
			arr[right] = tempHold;

			// move forward 'left' index to right direction of array
			left++;
			// move forward 'right' index to left direction of array
			right--;
		}
	}

}