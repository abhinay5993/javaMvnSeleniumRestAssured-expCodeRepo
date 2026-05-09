package com.testleaf.selfpaced.fundamentalsArrays;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * Given the input array, find the indices of matching 2 sum of given two
 * numbers. Ex - Array - {2,3,8,11,16,23} , num1=4, num2=7 , sum=11 exists in
 * array return its index.
 * 
 */
public class FindTargetValueIndexBySumOfInputs {

	public static void main(String[] args) {
	Scanner scInp = new Scanner(System.in);
	System.out.print("\nEnter the size of Array : ");
	int sizeOfArr = scInp.nextInt();
	double[] inputArr = new double[sizeOfArr];
	System.out.println("\nEnter the Array elements : ");
	pushElementsIntoArray(inputArr);
	System.out.println("\nInput Array : " + Arrays.toString(inputArr));
	System.out.print("\nEnter the 1st Num1 : ");
	double num1 = scInp.nextDouble();
	System.out.print("\nEnter the 2nd Num2 : ");
	double num2 = scInp.nextDouble();
	System.out.println("\nIndex of Summed Item : "+checkIsSumOfTwoNumbersExistsInArray(inputArr,num1,num2));
	
	//call for 2nd problem
	System.out.print("\nEnter Target Value : ");
	double targetVal=scInp.nextDouble();
	System.out.println("\nOutput Index pairs : ");
	findSumOfTwoIndicesAgainstTarget(inputArr,targetVal);
	scInp.close();
	}
	
	
	/*
	 * prob-2 - Given the input array, find the sum of any two indices of the
	 * matching given the target.
	 * 
	 */
	private static void findSumOfTwoIndicesAgainstTarget(double[] appArr, double targetVal) {
		boolean blFlag = false;
		if (appArr == null) {
			throw new RuntimeException("Operation can't be done for Null Array..");
		}

		if (appArr.length == 0) {
			throw new RuntimeException("Empty!! array..");
		}

		for (int i = 0; i < appArr.length; i++) {
			for (int j = i + 1; j < appArr.length; j++) {
				double sumOfArrayItem=appArr[i]+appArr[j];
				if (sumOfArrayItem == targetVal) {
					System.out.println("("+i+" , "+j+")");
					blFlag = true;
				}
			}
		}

		if (!blFlag) {
			throw new RuntimeException("No Match found!!..");
		}
	}


	/*
	 * prob-1 - Given the input array, find the indices of the matching 2 sum given
	 * the number.
	 * 
	 */
	private static int checkIsSumOfTwoNumbersExistsInArray(double[] inputArr, double num1, double num2) {
		int resIndex = -1;
		if (inputArr == null) {
			throw new RuntimeException("Operation can't be done for Null Array..");
		}

		if (inputArr.length == 0) {
			throw new RuntimeException("Empty!! array..");
		}

		double sumVal = num1 + num2;
		System.out.println("\nSum of Two numbers " + num1 + " , " + num2 + " : " + sumVal);
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] == sumVal) {
				resIndex = i;
				break;
			}
		}
	return resIndex;
	}


	public static void pushElementsIntoArray(double inputArr[]) {
		Scanner scInp1Obj = new Scanner(System.in);
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("\nEnter the element No " + (i + 1) + " : ");
			inputArr[i] = scInp1Obj.nextDouble();
		}
		scInp1Obj.close();
	}

}