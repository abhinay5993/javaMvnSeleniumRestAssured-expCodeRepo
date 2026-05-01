package com.udemy.sdetintcod.section6;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Using sliding window technique : input Array={2,1,5,1,3,2}. Of window size
 * K=n
 * 
 * Possible SubArray - [2,1,5] - 8 [1,5,1] - 7 [5,1,3] - 9 - max [1,3,2] - 6
 * 
 */
public class FindMaxSumOfSubArraySizeK {

	public static void main(String[] args) {
	Scanner scpin=new Scanner(System.in);
	int[] inpNumArray={2,1,5,1,3,2};
	System.out.println("\nEnter the sub-arrays window size K : ");
	int kthWindowSize=scpin.nextInt();
	System.out.println("\nMax value of Sub-Arrays of window size: "+kthWindowSize+" is : "+findMaxOfSubArrayOfKsize(inpNumArray,kthWindowSize));
	
	System.out.println("\nEnter the sub-arrays window size K1 : ");
	int kthWindow2Size=scpin.nextInt();
	System.out.println("\nMax value of Sub-Arrays of window size: "+kthWindow2Size+" is : "+findMaxOfSubArrayOfKsize(inpNumArray,kthWindow2Size));
	scpin.close();
	}

	
	private static int findMaxOfSubArrayOfKsize(int[] inpNumArray, int kthWindowSize) {
		System.out.println("\nInput Array : "+Arrays.toString(inpNumArray));
		// store the max value
		int maxResultValue = 0;
		// store the value of sub-arrays window Sum
		int windSum = 0;
		// store 'start' index of window
		int start = 0;

		// Traverse over the input array
		for (int endIndex = 0; endIndex < inpNumArray.length; endIndex++) {
			// Step-1: Compute the 'windSum'
			windSum += inpNumArray[endIndex];

			//VVIP Checking-condition for window size 'kthWindowSize' reached till end.
			if (endIndex >= kthWindowSize - 1) {
				// Step-2: compute the max result by comparing
				maxResultValue = Math.max(maxResultValue, windSum);

				// Step-3: subtract elements which is outside of window
				windSum -= inpNumArray[start];
				
				// Move forward the 'start' index
				start++;
			}

		}
		return maxResultValue;
	}
	
}