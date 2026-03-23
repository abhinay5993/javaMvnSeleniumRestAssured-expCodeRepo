package com.udemy.sdetintcod.section5;
import java.util.Arrays;
import java.util.Scanner;

public class MoveAllNegativesToLeftEnd {

	public static void main(String[] args) {
		Scanner scInp=new Scanner(System.in);
		System.out.print("\nEnter the size of input array : ");
		int sizeOfArray=scInp.nextInt();
		moveAllNegativeNumbersToLeft(sizeOfArray);
		scInp.close();
	}

	/**
	 * Two pointer approach to traverse array elements
	 * @param sizeOfArray
	 */
	private static void moveAllNegativeNumbersToLeft(int sizeOfArray) {
		Scanner scInp = new Scanner(System.in);
		int[] inptArray = new int[sizeOfArray];
		System.out.println("\nEnter the array elements : \n");
		for (int i = 0; i < inptArray.length; i++) {
			inptArray[i] = scInp.nextInt();
		}
		System.out.println("\nInput number array : "+Arrays.toString(inptArray));
		//start index.
		int left=0;
		//End Index.
		int right=inptArray.length-1;
		
		while (left<=right) {
			
			//Move left pointer to right if getting negatives number at the beginning it self.
			while (left<sizeOfArray && inptArray[left]<0) {
				left++;
			}
			
			//Move right pointer to left if getting positive number at the End it self.
			while (right>0 && inptArray[right]>0) {
				right--;
			}
			
			//Swap array elements if still left index is before right index.
			if (left<right) {
				int temHold=inptArray[left];
				inptArray[left]=inptArray[right];
				inptArray[right]=temHold;
			}
		}
		System.out.println("\nResultant Output : "+Arrays.toString(inptArray));
		scInp.close();
	}
	
}