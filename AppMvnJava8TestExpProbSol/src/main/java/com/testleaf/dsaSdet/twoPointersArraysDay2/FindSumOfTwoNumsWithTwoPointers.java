package com.testleaf.dsaSdet.twoPointersArraysDay2;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * 
prob-1 - Given the Sorted input array, find the sum of first two indices of the matching given the target using two pointer approach.

1)  understand the problem.
2)  Ask example of Input/Output and reconfirm it.
3)  Find the 3 Types test data to solve the problem - +Positive , -Negative , edge case.
4)  Don't show excitement to solve the problem infront of interviewer.
5)  Ask for Hints !! if at all required.
6)  Think for alternate solution.
7)  If we know more than one solution - explain approaches which solution is better (Time/Space complexity wise)/ why? 
    ask interviewer which to apply.
8)  If we are sure about optimal solution at least start with wrost case(Then show optimal if known) solution - brute force approach!!.
9)  Initially to improve the logic build start with Psudo code.
10) Keep Talking while implementing the code.
11) After solving the problem please execute step 3.
12) Debug your failure to with breakPoints , watch variables fix and re-run your code.

Step 6 to Step 12 plays vital role to crack interviews.

*/

public class FindSumOfTwoNumsWithTwoPointers {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double[] appArr= {4,5,8,10,13,16,22,30,40,45,55,65,70,85,99,100};
			System.out.println("\nInput array : "+Arrays.toString(appArr));
			System.out.print("\nEnter Target Value : ");
			double targetVal=sc.nextDouble();
			System.out.println("\nOutput Index pairs : ");
			optimizedTwoPointerfindSumOfTwoIndicesByTarget(appArr,targetVal);
		}
		
	}

	/*
	 * Left Index - 0 , right index - last index. Loop through the array until Left
	 * index less than right index. 
	 * 1) if target == sum of left index + right index Items --> return left index , right index. 
	 * 2) if target < sum of left index + right index Items --> move Right to left direction in array by decrement right index. 
	 * 3) if target > sum of left index + right index Items --> move Left to right direction in array by increment left index.
	 * 
	 */
	private static void optimizedTwoPointerfindSumOfTwoIndicesByTarget(double[] appArr, double targetVal) {
		boolean blFlag = false;
		if (appArr == null) {
			throw new RuntimeException("Operation can't be done for Null Array..");
		}

		if (appArr.length == 0) {
			throw new RuntimeException("Empty!! array..");
		}
		int l = 0;
		int r = appArr.length - 1;
		while (l < r) {
			double sum = appArr[l] + appArr[r];
			if (sum == targetVal) {
				blFlag = true;
				System.out.println("\nFound Index : (" + l + " , " + r + ") ");
				break;
			} else if (sum > targetVal) {
				r--;
			} else {
				l++;
			}

		}

		if (!blFlag) {
			throw new RuntimeException("No Match found!!..");
		}

	}

}