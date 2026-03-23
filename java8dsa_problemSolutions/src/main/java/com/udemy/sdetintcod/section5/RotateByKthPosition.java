package com.udemy.sdetintcod.section5;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Rotation will be performed by using array reversal shuffling the elements
 * 
 * Ex : Array: {1, 2, 3, 4, 6, 7, 8, 9} Rotate it by : Kth=3 steps from right
 * direction. Output : {9, 8, 7, 1, 2, 3, 4, 6}
 * 
 */
public class RotateByKthPosition {

	public static void main(String[] args) {
		Scanner scInp = new Scanner(System.in);
		System.out.print("\nEnter the size of input array : ");
		int sizeOfArray = scInp.nextInt();
		System.out.println("\nEnter the number of Steps/positions to rotate from right : ");
		int kTh=scInp.nextInt();
		doArrayRotationRightDirection(sizeOfArray,kTh);
		scInp.close();
	}

	private static void doArrayRotationRightDirection(int sizeOfArray, int kTh) {
		Scanner scInp = new Scanner(System.in);
		int[] inptArray = new int[sizeOfArray];
		System.out.println("\nEnter the array elements : ");
		for (int i = 0; i < inptArray.length; i++) {
			inptArray[i] = scInp.nextInt();
		}
		System.out.println("\nInput number array : " + Arrays.toString(inptArray));
		// Wrapping up the kTh rotation as that can more than the length of input array.
		int arrLen = inptArray.length;
		System.out.println("\nPopulated Array length : " + arrLen);
		kTh = (kTh % arrLen);
		System.out.println("\nLatest value of K : " + kTh);
		arrLen = arrLen - 1;
		System.out.println("\nEvaluated Array length : " + arrLen);

		//Step-1:Do reversal of the entire input array.
		reversalShuffling(inptArray,0,arrLen);
		System.out.println("\nValue after first shuffling : "+Arrays.toString(inptArray));
		
		//Step-2:Do reversal of first Kth elements after the end of before Step-1.
		reversalShuffling(inptArray,0,kTh-1);
		System.out.println("\nValue after 2nd shuffling : "+Arrays.toString(inptArray));
		
		//Step-3:Do reversal of remaining all elements - which were at the begining.
		reversalShuffling(inptArray,kTh,arrLen);
		System.out.println("\nValue after 3rd shuffling to get disired output : "+Arrays.toString(inptArray));
		scInp.close();
	}

	private static void reversalShuffling(int[] inptArray, int left, int right) {
		while (left < right) {
			int temHold = inptArray[left];
			inptArray[left] = inptArray[right];
			inptArray[right] = temHold;
			//Move left pointer to right direction.
			left++;
			//Move right pointer to left direction.
			right--;
		}
	}
	

}