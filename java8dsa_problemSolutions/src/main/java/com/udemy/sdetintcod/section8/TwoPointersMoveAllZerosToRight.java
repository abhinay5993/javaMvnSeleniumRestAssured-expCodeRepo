package com.udemy.sdetintcod.section8;
import java.util.Arrays;

public class TwoPointersMoveAllZerosToRight {

	public static void main(String[] args) {
	int[] inpNumArr={5,6,0,7,0,66,9,0,100,10,0,11};
	System.out.println("\nInput Data Array : "+Arrays.toString(inpNumArr));
	moveAllZerosToRightEnd(inpNumArr);
	System.out.println("\nTransformed Array after moving all zeros to right end : "+Arrays.toString(inpNumArr));
	}

	private static void moveAllZerosToRightEnd(int[] inpNumArr) {
		// non-zero elements index initialization.
		int nonZeroIndex = 0;

		//Traverse through input array.
		for (int i = 0; i < inpNumArr.length; i++) {
			//Condition to check non-zero elements
			if (inpNumArr[i] != 0) {
				if (i != nonZeroIndex) {
					//Swap current array element with 'nonZeroIndex' positioned elements
					int temp = inpNumArr[i];
					inpNumArr[i] = inpNumArr[nonZeroIndex];
					inpNumArr[nonZeroIndex] = temp;
				}
			//Move forward the 'nonZeroIndex'
			nonZeroIndex++;
			}
		}
	}

}