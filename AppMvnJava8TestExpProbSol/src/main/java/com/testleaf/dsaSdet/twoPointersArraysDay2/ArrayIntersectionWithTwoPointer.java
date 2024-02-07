package com.testleaf.dsaSdet.twoPointersArraysDay2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
prob-2 - Array (Sorted items) intersection using eqidirection. (with two pointer approach)

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

public class ArrayIntersectionWithTwoPointer {

	public static void main(String[] args) {
		int[] x= {1,2,4,6,7,11,12,14,20,40};
		int[] y= {2,12,7,15,20};
		System.out.println("\nInput Array-1 : "+Arrays.toString(x));
		System.out.println("\nInput Array-2 : "+Arrays.toString(y));
		findIntersectionOfInputArrays(x,y);
	}

	private static void findIntersectionOfInputArrays(int[] x, int[] y) {
		int l = 0;
		int r = 0;
		List<Integer> lst = new ArrayList<>();
		boolean blFlag = false;
		if (x == null || y == null) {
			System.err.println("\nIntersection can't be done for NULL arrays!!..");
			return;
		}
		if (x.length == 0 || y.length == 0) {
			System.err.println("\nIntersection can't be done for Empty! arrays!!..");
			return;
		}
		
		while (l < x.length && r < y.length) {
			if (x[l] == y[r]) {
				lst.add(x[l]);
				blFlag = true;
				l++;
				r++;
			} else if (x[l] < y[r]) {
				l++;
			} else {
				r++;
			}
		}

		if (!blFlag) {
			System.err.println("\nNo intersection found!!..");
		}
		System.out.println("\nInterseced Items : " +Arrays.toString(lst.toArray()));
	}

}