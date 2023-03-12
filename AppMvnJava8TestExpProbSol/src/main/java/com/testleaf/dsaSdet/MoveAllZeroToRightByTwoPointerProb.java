package com.testleaf.dsaSdet;
import java.util.Arrays;

/*
 * 
prob-3 - Move all zeros to the end of array. (with two pointer approach) (Position of Non-Zero Should be maintained.

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

public class MoveAllZeroToRightByTwoPointerProb {

	public static void main(String[] args) {
		double[] dataItems= {8,0,23,1,-34,0,7,34,0,59,0};
		System.out.println("\nInput Array Data : "+Arrays.toString(dataItems));
		System.out.println("\nPost Zero Shift/Move to right resultant Array Data : "+Arrays.toString(twoPointerMoveAllZerosToRight(dataItems)));

	}

	private static double[] twoPointerMoveAllZerosToRight(double[] dataItems) {
		if (dataItems == null) {
			System.err.println("Operation can't be done for Null Array..");
		}

		if (dataItems.length == 0) {
			System.err.println("Empty!! array..");
		}
		int l = 0;
		int r = 0;
		while (r < dataItems.length) {
			if (dataItems[r] != 0) {
				double temDat = dataItems[r];
				dataItems[r] = dataItems[l];
				dataItems[l++] = temDat;
			}
			r++;
		}
		return dataItems;
	}
	
	

}