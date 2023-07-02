package com.testleaf.dsaSdet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 
prob-1 - Given an array and target remove the matching target from the array.

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

public class RemoveTargetElementFromArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] dataItems= {7,9,22,76,88,45,90,56,45};
		System.out.println("\nEnter the Target Item : ");
		double target=sc.nextDouble();
		System.out.println("\nInput Array Data : "+Arrays.toString(dataItems));
		System.out.println("\nArray Data avaiable : "+Arrays.toString(removeTargettedElement(dataItems, target)));
	}
	
	//Two Pass --> Time Complexity - O(n)
	//Space complexity --> O(2n)
	public static double[] removeTargettedElement(double[] inpArr, double targetItem) {
		boolean blFlag = false;
		ArrayList arrList = new ArrayList<>();
		if (inpArr == null) {
			throw new RuntimeException("Operation can't be done for Null Array..");
		}

		if (inpArr.length == 0) {
			throw new RuntimeException("Empty!! array..");
		}

		//Single pass --> O(n)
		for (int i = 0; i < inpArr.length; i++) {
			if (inpArr[i] != targetItem) {
				arrList.add(inpArr[i]);
				blFlag = true;
			} else {
				continue;
			}
		}

		if (!blFlag) {
			throw new RuntimeException("No Match found!!..");
		}
		int newArrListSize = arrList.size();
		inpArr = new double[newArrListSize];
		//Two pass --> O(n)
		for (int i = 0; i < newArrListSize; i++) {
			inpArr[i] = (double) arrList.get(i);
		}
		return inpArr;
	}
	

}