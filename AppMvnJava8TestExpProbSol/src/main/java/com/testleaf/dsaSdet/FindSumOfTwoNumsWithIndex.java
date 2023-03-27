package com.testleaf.dsaSdet;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 
prob-1 - Given the input array, find the indices of the matching 2 sum given the number.
prob-2 - Given the input array, find the sum of any two indices of the matching given the target.

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

public class FindSumOfTwoNumsWithIndex {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] numArr= {2,3,8,11,16,23};
		System.out.println("\nInput array : "+Arrays.toString(numArr));
		System.out.print("\nEnter num1 : ");
		double num1=sc.nextDouble();
		System.out.print("\nEnter num2 : ");
		double num2=sc.nextDouble();
		System.out.println("\nIndex of Summed Item : "+getIndexOfSumOfTwoNumbers(numArr, num1, num2));
		
		
		//call for 2nd problem
		//double[] appArr= {2,7,11,15};
		double[] appArr= {2,2,3,1,4,0,5};
		System.out.println("\nInput array : "+Arrays.toString(appArr));
		System.out.print("\nEnter Target Value : ");
		double targetVal=sc.nextDouble();
		System.out.println("\nOutput Index pairs : ");
		findSumOfTwoIndicesAgainstTarget(appArr,targetVal);
	}
	
	
	/*
	 * prob-1 - Given the input array, find the indices of the matching 2 sum given
	 * the number.
	 * 
	 */
	public static int getIndexOfSumOfTwoNumbers(double[] numArr, double num1, double num2) {
		int resIndex = -1;
		if (numArr == null) {
			throw new RuntimeException("Operation can't be done for Null Array..");
		}

		if (numArr.length == 0) {
			throw new RuntimeException("Empty!! array..");
		}

		double sumVal = num1 + num2;
		System.out.println("\nSum of Two numbers " + num1 + " , " + num2 + " : " + sumVal);
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] == sumVal) {
				resIndex = i;
				break;
			}
		}
		return resIndex;
	}
	
	
	/*
	 * prob-2 - Given the input array, find the sum of any two indices of the
	 * matching given the target.
	 * 
	 */
	public static void findSumOfTwoIndicesAgainstTarget(double[] numArr, double target) {
		boolean blFlag = false;
		if (numArr == null) {
			throw new RuntimeException("Operation can't be done for Null Array..");
		}

		if (numArr.length == 0) {
			throw new RuntimeException("Empty!! array..");
		}

		for (int i = 0; i < numArr.length; i++) {
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[i] + numArr[j] == target) {
					System.out.println("("+i+" , "+j+")");
					blFlag = true;
				}
			}
		}

		if (!blFlag) {
			throw new RuntimeException("No Match found!!..");
		}

	}
	

}