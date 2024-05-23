package com.udemy.dsapart1.searching;
import java.util.Arrays;
import java.util.Scanner;

/**
 * NOTE : This search approach don't required sorted input array data sets.
 * 
 */
public class LinearSearching {
	
	public static void main(String[] args) {
	Scanner scInp=new Scanner(System.in);
	System.out.print("\nEnter the size of Array : ");
	int sizeOfArr = scInp.nextInt();
	double[] inputArr = new double[sizeOfArr];
	System.out.println("\nEnter the Array elements : ");
	pushElementsIntoArray(inputArr);
	System.out.println("\nInput Array : " + Arrays.toString(inputArr));
	System.out.println("\n**************** Performing Linear seaching ********************");
	System.out.print("\nEnter the element to be searched : ");
	double targetItem = scInp.nextDouble();
	int resultIndex=performLinearSearching(inputArr,targetItem);
	System.out.println("\nTarget element found at index : "+resultIndex);
	}

	
	/**
	 * This algorithm has linear time complexity - O(N) 
	 * @param inputArr - double[]
	 * @param targetItem - double
	 * @return resultIndex - int
	 * 
	 */
	private static int performLinearSearching(double[] inputArr, double targetItem) {
		int resultIndex = -1;
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] == targetItem) {
				return resultIndex = i;
			}
		}
		return resultIndex;
	}
	


	public static void pushElementsIntoArray(double inputArr[]) {
		Scanner scInp1Obj = new Scanner(System.in);
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("\nEnter the element No " + (i + 1) + " : ");
			inputArr[i] = scInp1Obj.nextDouble();
		}
	}
	
}