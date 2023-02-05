package com.testleaf.dsaSdet;
import java.util.Arrays;

/*
 * 
prob-1 - Given Sorted array in Non-Descending(i.e ASC) order , return the array of the square of each number sorted in Non-Descending(i.e ASC) order

1)  under stand the problem.
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

public class SortByAscForSquareOfArrayItems {
	
	public static void main(String[] args) {
		double[] numArr= {2,3,8,11,16,23};
		System.out.println("\nInput array : "+Arrays.toString(numArr));
		System.out.println("\nOutput Array of Squared Items : "+Arrays.toString(getSortedSquaredItems(numArr)));
	}

	/*
	 * prob-1 - Given Sorted array in Non-Descending(i.e ASC) order , return the
	 * array of the square of each number sorted in Non-Descending(i.e ASC) order
	 * 
	 */
	private static double[] getSortedSquaredItems(double[] numArr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = numArr[i] * numArr[i];
		}
		Arrays.sort(numArr);
		return numArr;
	}

}