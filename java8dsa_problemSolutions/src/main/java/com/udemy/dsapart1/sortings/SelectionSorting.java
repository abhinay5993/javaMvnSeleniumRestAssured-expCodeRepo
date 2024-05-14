package com.udemy.dsapart1.sortings;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSorting {
	
	public static void main(String[] args) {
	Scanner scInp=new Scanner(System.in);
	System.out.print("\nEnter the size of Array : ");
	int sizeOfArr = scInp.nextInt();
	double[] inputArr = new double[sizeOfArr];
	System.out.println("\nEnter the Array elements : ");
	pushElementsIntoArray(inputArr);
	System.out.println("\nInput Array : " + Arrays.toString(inputArr));
	performSelectionSort(inputArr);
	System.out.println("\nRequired Selection Sorted array : "+Arrays.toString(inputArr));
	}

	
	/**
	 * Method to perform the Selection Sort algorithm.
	 * 
	 * @param inputArr2 
	 * Quadratic time complexity - O(n^2).
	 * 
	 */
	private static void performSelectionSort(double[] inputArr2) {
	int minIndex;
	for (int i = 0; i < inputArr2.length; i++) {
		 minIndex=i;
		 for (int j = i; j < inputArr2.length; j++) {
				if (inputArr2[j] < inputArr2[minIndex]) {
				doSwapping(inputArr2,minIndex,j);
				}
			}
		}
	}

	
	/**
	 * Swapping will happen if element present into left side is greater than the
	 * next element.
	 * 
	 * @param inputArr2
	 * @param p1Index
	 * @param p2Index
	 * 
	 */
	private static void doSwapping(double[] inputArr2, int p1Index, int p2Index) {
		double tempNum = inputArr2[p1Index];
		inputArr2[p1Index] = inputArr2[p2Index];
		inputArr2[p2Index] = tempNum;
	}


	public static void pushElementsIntoArray(double inputArr[]) {
		Scanner scInp1Obj = new Scanner(System.in);
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("\nEnter the element No " + (i + 1) + " : ");
			inputArr[i] = scInp1Obj.nextDouble();
		}
	}
	
}