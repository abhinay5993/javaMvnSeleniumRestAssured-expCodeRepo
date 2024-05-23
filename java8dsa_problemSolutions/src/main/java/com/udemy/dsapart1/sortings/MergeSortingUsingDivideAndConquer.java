package com.udemy.dsapart1.sortings;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortingUsingDivideAndConquer {
	
	public static void main(String[] args) {
	Scanner scInp=new Scanner(System.in);
	System.out.print("\nEnter the size of Array : ");
	int sizeOfArr = scInp.nextInt();
	double[] inputArr = new double[sizeOfArr];
	System.out.println("\nEnter the Array elements : ");
	pushElementsIntoArray(inputArr);
	System.out.println("\nInput Array : " + Arrays.toString(inputArr));
	performMergeSort(inputArr);
	System.out.println("\nRequired Merge Sorted array : "+Arrays.toString(inputArr));
	}

	
	/**
	 * Method to perform the Merge Sort algorithm using divide & Conquer approach.
	 * 
	 * @param inputArr2 
	 * Time complexity - n*log n.
	 * 
	 */
	private static void performMergeSort(double[] inputArr2) {
		if (inputArr2.length < 2) {
			return;
		}
		int midIndex = (inputArr2.length / 2);
		double leftSubArray[] = new double[midIndex];
		double rightSubArray[] = new double[inputArr2.length - midIndex];
		// fill the elements to left sub-array
		for (int i = 0; i < midIndex; i++) {
			 leftSubArray[i] = inputArr2[i];
		}
		// fill the elements to right sub-array
		for (int i = midIndex; i < inputArr2.length; i++) {
			rightSubArray[i-midIndex] = inputArr2[i];
		}
		//recursive call on sorted left-sub array & right sub-array.
		performMergeSort(leftSubArray);
		performMergeSort(rightSubArray);
		//Pass sorted sub-arrays
		doSubArrayMergeOperation(leftSubArray,rightSubArray,inputArr2);
	}

	
	/**
	 * 
	 * This method will perform merge operation on input sorted sub-array
	 * @param leftSubArray
	 * @param rightSubArray
	 * @param inputArr2
	 * 
	 */
	private static void doSubArrayMergeOperation(double[] leftSubArray, double[] rightSubArray, double[] inputArr2) {
		int i = 0, j = 0, k = 0;
		while (i < leftSubArray.length && j < rightSubArray.length) {
			if (leftSubArray[i] <= rightSubArray[j]) {
				inputArr2[k++] = leftSubArray[i++];
			}
			else {
				inputArr2[k++] = rightSubArray[j++];
			}
		}
		while (i < leftSubArray.length) {
		inputArr2[k++] = leftSubArray[i++];
		}
		while (j < rightSubArray.length) {
		inputArr2[k++] = rightSubArray[j++];
		}
	}


	public static void pushElementsIntoArray(double inputArr[]) {
		Scanner scInp1Obj = new Scanner(System.in);
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("\nEnter the element No " + (i + 1) + " : ");
			inputArr[i] = scInp1Obj.nextDouble();
		}
	}
	
}