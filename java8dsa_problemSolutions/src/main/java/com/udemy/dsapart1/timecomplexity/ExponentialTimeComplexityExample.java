package com.udemy.dsapart1.timecomplexity;
import java.util.Arrays;
import java.util.Scanner;

public class ExponentialTimeComplexityExample {
	
	static double inputArr[][];
	
	public static void main(String[] args) {
	Scanner scInp=new Scanner(System.in);
	System.out.print("\nEnter the size of row : ");
	int rowSize = scInp.nextInt();
	System.out.print("\nEnter the size of column : ");
	int colSize = scInp.nextInt();
	inputArr = new double[rowSize][colSize];
	System.out.println("\nEnter the Array elements : ");
	pushElementsIntoArray(inputArr);
	System.out.println("\nInput Array data : "+Arrays.toString(inputArr));
	print2DMatrix(inputArr,rowSize);
	}


	/**
	 * 
	 * @param inputArr2
	 * @param rowSize
	 * Quadratic time complexity - O(n^2).
	 * 
	 */
	private static void print2DMatrix(double[][] inputArr2, int rowSize) {
		for (int i = 1; i <= rowSize; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}



	public static void pushElementsIntoArray(double inputArr[][]) {
		Scanner scInp1Obj = new Scanner(System.in);
		for (int i = 0; i < inputArr.length; i++) {
			for(int j=0;j<inputArr[i].length;j++)
			{
			System.out.print("\nEnter the element : ");
			inputArr[i][j] = scInp1Obj.nextDouble();
			}
		}
	}
	
}