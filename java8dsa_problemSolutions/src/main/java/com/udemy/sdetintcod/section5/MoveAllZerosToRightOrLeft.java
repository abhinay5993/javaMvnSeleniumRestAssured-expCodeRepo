package com.udemy.sdetintcod.section5;
import java.util.Arrays;

public class MoveAllZerosToRightOrLeft {

	public static void main(String[] args) {
	int[] inpNumArray={0,1,9,0,2,4,0,3};
	System.out.println("\nInput numbers array : "+Arrays.toString(inpNumArray));
	//Moving all zero's to right
	moveAllZerosToRightEnd(inpNumArray);
	System.out.println("\nUpdated array post moving to zero's to right : "+Arrays.toString(inpNumArray));
	int[] inpNumArray2={0,1,9,0,2,4,0,3};
	//Moving all zero's to left
	moveAllZerosToLeftEnd(inpNumArray2);
	System.out.println("\nUpdated array post moving to zero's to left : "+Arrays.toString(inpNumArray2));
	}

	private static void moveAllZerosToLeftEnd(int[] inpNumArray) {
		int itrLen=inpNumArray.length-1;
		// Pointer to the position where the next non-zero element should be placed (starting from the end)
		int rightIndex = itrLen;
		
		// Iterate through the array from the end
		for (int j = itrLen; j>=0; j--) {
			int currentItem = inpNumArray[j];
			// If the current element is non-zero, place it at the writePointer position
			if (currentItem != 0) {
			inpNumArray[rightIndex] = currentItem;
			// Move the write pointer to the left
			rightIndex--;
			}
		}
		
		// Fill the remaining positions at the front with zeros
		while (rightIndex>=0) {
			inpNumArray[rightIndex]=0;
			rightIndex--;
		}
	}

	
	private static void moveAllZerosToRightEnd(int[] inpNumArray) {
		int nonZeroIndex = 0;
		for (int i = 0; i < inpNumArray.length; i++) {
			int currentItem = inpNumArray[i];
			if (currentItem != 0) {
				int tempItem = currentItem;
				inpNumArray[i] = inpNumArray[nonZeroIndex];
				inpNumArray[nonZeroIndex] = tempItem;

				// Move forward the nonZeroIndex
				nonZeroIndex++;
			}
		}
	}
	

}
