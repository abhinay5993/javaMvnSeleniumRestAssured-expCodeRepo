package com.udemy.sdetintcod.section6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * Using sliding window technique : Find list of 1st Negatives number form
 * Sub-Arrays window size K=n for input array : {12,-1,-7,8,15,30,16,28}
 * [12,-1,-7] - -1 [-1,-7,8] - -1 [-7,8,15] - -7 [8,15,30] - 0 [15,30,16] - 0
 * [30,16,28] - 0
 * 
 */
public class Return1stNegativesListOfSubArraySizeK {

	public static void main(String[] args) {
	Scanner scpin = new Scanner(System.in);
	int[] inpNumArray = { 12, -1, -7, 8, 15, 30, 16, 28 };
	System.out.println("\nEnter the sub-arrays window size K : ");
	int kthWindowSize = scpin.nextInt();
	System.out.println("\nArray of Negatives w.r.t Sub-Arrays window size: " + kthWindowSize + " is : "+ Arrays.toString(arryOfNegativesOfSubArrayOfKsize(inpNumArray, kthWindowSize)));
	scpin.close();
	}

	
	private static Integer[] arryOfNegativesOfSubArrayOfKsize(int[] inpNumArray, int kthWindowSize) {
		System.out.println("\nInput array : " + Arrays.toString(inpNumArray));
		// Initialization of empty list to hold the result.
		List<Integer> resultList = new ArrayList<>();
		// Initialization of empty queue to keep track of negative index.
		Queue<Integer> negIndexQue = new LinkedList<>();

		// Traverse each element of input array
		for (int endIndex = 0; endIndex < inpNumArray.length; endIndex++) {
			// Current element of input array
			int currentNum = inpNumArray[endIndex];
			//1. check if the array element is negative to fill the 'negIndexQue' with indices
			if (currentNum < 0) {
			negIndexQue.add(endIndex);
			}
			
			//2. once reached to full window size of 'kthWindowSize'
			if (endIndex>=kthWindowSize - 1) 
			{
				//3. checking if head of queue elements using peek() safely populated and should not
				// reached till window size.
				while (!negIndexQue.isEmpty() && negIndexQue.peek() < endIndex - kthWindowSize + 1) {
					// removes element from head of que safely
					negIndexQue.poll();
				}

				//step-4:
				if (!negIndexQue.isEmpty()) {
					// fill the result list with array elements w.r.t negIndexQue negatives indices
					// safely populated using peek()
					resultList.add(inpNumArray[negIndexQue.peek()]);
				} else {
					// No Negatives sub-array result to filled with 0
					resultList.add(0);
				}
			}
			
		}
	//Step-5: return list by converting to array
	return resultList.toArray(new Integer[0]);
	}

	
}