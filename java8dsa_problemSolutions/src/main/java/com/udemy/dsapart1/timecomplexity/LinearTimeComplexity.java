package com.udemy.dsapart1.timecomplexity;
import java.util.Arrays;
import java.util.Scanner;

public class LinearTimeComplexity {
	
	static double inputArr[];
	
	public static void main(String[] args) {
	Scanner scInp=new Scanner(System.in);
	System.out.print("\nEnter the size of Array : ");
	int sizeOfArr = scInp.nextInt();
	inputArr = new double[sizeOfArr];
	System.out.println("\nEnter the Array elements : ");
	pushElementsIntoArray(inputArr);
	System.out.println("\nInput Array : " + Arrays.toString(inputArr));
	evaluateMinAndMaxElementFromArray(inputArr);
	}
	
	
	/**
	 * 
	 * @param inputArr2
	 * Linear Time Complexity - O(n).
	 * 
	 */
	private static void evaluateMinAndMaxElementFromArray(double[] inputArr2) {
	double minElement=inputArr2[0];
	double maxElement=inputArr2[0];
	for (int i = 1; i < inputArr2.length; i++) {
		double tempDouble = inputArr2[i];
		minElement=(tempDouble<minElement)?tempDouble:minElement;
		maxElement=(tempDouble>maxElement)?tempDouble:maxElement;
	}
	System.out.println("\nMinimum element from array : "+minElement);
	System.out.println("\nMaximum element from array : "+maxElement);
	}


	public static void pushElementsIntoArray(double inputArr[]) {
		Scanner scInp1Obj = new Scanner(System.in);
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("\nEnter the element No " + (i + 1) + " : ");
			inputArr[i] = scInp1Obj.nextDouble();
		}
	}

}