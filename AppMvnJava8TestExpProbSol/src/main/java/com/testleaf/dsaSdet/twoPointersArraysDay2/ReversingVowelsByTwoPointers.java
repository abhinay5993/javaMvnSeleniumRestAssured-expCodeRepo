package com.testleaf.dsaSdet.twoPointersArraysDay2;
import java.util.Scanner;

/*
 * 
prob-1 - Reversing the vowels with two pointer approach (though the Time Complexity is O(n/2) but technically its better solution than O(n)
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

public class ReversingVowelsByTwoPointers {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\nEnter the input string : ");
			String inpStr=sc.nextLine();
			System.out.println("\nReversing Vowels Output String : "+twoPointersReversingVowelStrings(inpStr));
		}
	}

	/*
	 * This problem solves in both direction left , right and stops at the middle it
	 * self hence best time complexity : O(n/2) , wrost case - O(n)
	 * 
	 */
	public static String twoPointersReversingVowelStrings(String inpStr) {
		inpStr = inpStr.toLowerCase();
		if (inpStr == null) {
			return "Operation can't be done for Null String..";
		}

		if (inpStr.length() == 0) {
			return "Empty!! String..";
		}

		if (inpStr.length() == 1) {
			return "Non reverseable : " + inpStr;
		}

		int l = 0;
		int r = inpStr.length() - 1;
		char[] charItems = inpStr.toCharArray();
		while (l < r) {
			if (isVowel(charItems[l]) && isVowel(charItems[r])) {
				char temChar = charItems[l];
				charItems[l++] = charItems[r];
				charItems[r--] = temChar;
			} else if (isVowel(charItems[l])) {
				r--;
			} else {
				l++;
			}
		}
		return new String(charItems);
	}
	
	
	public static boolean isVowel(char ch) {
		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	}

}