package com.udemy.sdetintcod.section8;
import java.util.Arrays;
import java.util.Scanner;

public class FindPairOfTargetSum {

	public static void main(String[] args) {
		Scanner scInp = new Scanner(System.in);
		int[] inpArry = { 1, 2, 4, 7, 11, 15 };
		System.out.println("\nInput Array : " + Arrays.toString(inpArry));
		System.out.println("\nEnter the traget value : ");
		int target = scInp.nextInt();

		if (isPairOfTargetSumExists(inpArry, target)) {
			System.out.println("\nYes, a pair of given sum exists.");
		} else {
			System.out.println("\nNo Pair! available for given target sum.");
		}
		scInp.close();
	}

	private static boolean isPairOfTargetSumExists(int[] inpArry, int target) {
		boolean blnResult = false;
		// Initialization of 'left' and 'right' index pointers.
		int left = 0;
		int right = inpArry.length - 1;

		// Traverse through array elements.
		while (left < right) {
			// evaluation of current sum w.r.t 'left' and 'right' index
			int currentSum = inpArry[left] + inpArry[right];

			// Step-1:Check Condition if 'target' matched with 'currentSum'
			if (currentSum == target) {
				System.out.println("\nPair : ( " + inpArry[left] + " , " + inpArry[right] + " )");
				return blnResult=true;
			}
			
			// Step-2:VVIP to Check Condition if 'currentSum' is < 'target'
			else if (currentSum < target) {
				// Required pair should be available to right part of array , hence adjust
				// 'left' index.
				left++;
			} else {
				// Required pair should be available to left part of array , hence adjust
				// 'right' index.
				right--;
			}
		}

	return blnResult;
	}

}