package com.udemy.sdetintcod.section6;
import java.util.Scanner;

public class BinarySeachSpace {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		int[] numArry = { 3, 5, 7, 8, 10, 12, 15 };
		System.out.println("\nEnter the Target element : ");
		int target = scin.nextInt();

		int resultIndex = doBinarySearchToArray(numArry, target);
		if (resultIndex != -1) {
			System.out.println("\nTraget item : " + numArry[resultIndex] + " found at : " + resultIndex + "");
		} else {
			System.out.println("\nItem not found!..");
		}
		scin.close();
	}

	
	private static int doBinarySearchToArray(int[] numArry, int target) {
		int result = -1;
		int left = 0;
		int right = numArry.length - 1;

		while (left <= right) {
			// Compute mid index
			int midIndex = left + (right - left) / 2;

			if (numArry[midIndex] == target) {
				result = midIndex;
			}

			if (numArry[midIndex] < target) {
				// search to right half by adjusting the 'left' index
				left = midIndex + 1;
			} else {
				// search to left half by adjusting the 'right' index
				right = midIndex - 1;
			}

		}
		return result;
	}

}