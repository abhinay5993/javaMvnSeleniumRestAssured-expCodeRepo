package com.udemy.autocodinground.prep26.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Q17Q18ArrayRotationByKPosition {

	public static void main(String[] args) {
		Scanner scpIn = new Scanner(System.in);
		int[] inpNumArray={1, 2, 3, 4, 5, 6, 7};
		System.out.println("\nEnter number of Position you want to rotate : ");
		int k=scpIn.nextInt();
		
		//Array rotation to right with K position.
		rotateRightByKPosition(inpNumArray,k);
		
		//Array rotation to left with K position.
		int[] inp2NumArray={1, 2, 3, 4, 5, 6, 7};
		rotateLeftByKPosition(inp2NumArray,k);

		scpIn.close();
	}

	private static void rotateRightByKPosition(int[] inpNumArray, int k) {
	System.out.println("\nInput Array : "+Arrays.toString(inpNumArray));
	int arrLen=inpNumArray.length;
	int totalIndex=arrLen-1;
	k=(k%arrLen);
	
	//Step1: Reverse the whole array.
	inpNumArray=doTwoPointerReversalBySwapping(inpNumArray, 0, totalIndex);
	
	//step2: Reverse the array to k-th elements
	inpNumArray=doTwoPointerReversalBySwapping(inpNumArray, 0, k-1);
	
	//step3: Reverse the remaining part of array till end from k-th position
	inpNumArray=doTwoPointerReversalBySwapping(inpNumArray, k,totalIndex);
	
	System.out.println("\nRight rotated array with K="+k+" position : "+Arrays.toString(inpNumArray));
	}
	
	
	private static void rotateLeftByKPosition(int[] inpNumArray, int k) {
	System.out.println("\nInput Array : "+Arrays.toString(inpNumArray));
	int arrLen=inpNumArray.length;
	int totalIndex=arrLen-1;
	k=(k%arrLen);
	
	//step1: Reverse the array till first k-th elements
	inpNumArray=doTwoPointerReversalBySwapping(inpNumArray,0,k-1);
		
	//step2: Reverse the remaining part of array till end from k-th position
	inpNumArray=doTwoPointerReversalBySwapping(inpNumArray,k,totalIndex);
	
	//Step3: Reverse the whole array.
	inpNumArray=doTwoPointerReversalBySwapping(inpNumArray, 0, totalIndex);
	
	System.out.println("\nLeft rotated array with K="+k+" position : "+Arrays.toString(inpNumArray));
	}

	private static int[] doTwoPointerReversalBySwapping(int[] arryItems, int left, int right) {
		while (left < right) {
			int numTempHold = arryItems[left];
			arryItems[left] = arryItems[right];
			arryItems[right] = numTempHold;
			left++;
			right--;
		}
		return arryItems;
	}
	
}