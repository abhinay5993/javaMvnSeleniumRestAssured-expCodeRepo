package com.testleaf.dsaSdet;
import java.util.Scanner;

/*
 * 
prob-1 - Reverse input String with two pointer approach (though the Time Complexity is O(n/2) but technically its better solution than O(n)

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

public class TwoPointerReversalProb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the input String : ");
		String inpData=sc.nextLine();
		System.out.println("\nOutPut Reversed String : "+getReversedStringByTwoPointerSwapApproach(inpData));
	}
	
	public static String getReversedStringByTwoPointerSwapApproach(String inpStr) {
		if (inpStr == null) {
			return "Operation can't be done for Null String..";
		}

		if (inpStr.length() == 0) {
			return "Empty!! String..";
		}

		if (inpStr.length() == 1) {
			return "Non reverseable : " + inpStr;
		}
		int lIdx = 0;
		int rIdx = inpStr.length() - 1;
		char charItems[] = inpStr.toCharArray();
		while (lIdx < rIdx) {
			char tem = charItems[rIdx];
			charItems[rIdx--] = charItems[lIdx];
			charItems[lIdx++] = tem;
		}
		return new String(charItems);
	}
	

}