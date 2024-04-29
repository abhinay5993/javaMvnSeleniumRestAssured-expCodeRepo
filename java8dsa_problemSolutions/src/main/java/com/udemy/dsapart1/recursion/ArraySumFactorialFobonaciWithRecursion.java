package com.udemy.dsapart1.recursion;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Section 2 : Recursion Programming problems for - 
 * - 1) Sum of Array elements using Recursion.
 * - 2) Factorial of a number using Recursion.
 * - 3) N-th number of Fibonacci Series using Recursion.
 *
 */
public class ArraySumFactorialFobonaciWithRecursion {
	
    static double inputArr[];
	
	public static void main(String[] args) {
		   Scanner scInpObj = new Scanner(System.in);
			int sizeOfArr;
			System.out.print("\nEnter the size of Array : ");
			sizeOfArr = scInpObj.nextInt();
			inputArr = new double[sizeOfArr];
			System.out.println("\nEnter the Array elements : ");
			pushElementsIntoArray(inputArr);
			System.out.println("\nInput Array : " + Arrays.toString(inputArr));
			
			System.out.println("\nSum of Array elements : ");
			System.out.println("*************************************************");
			int lastElementPosition=inputArr.length-1;
			double sumOfItems=findSumOfArrayElements(lastElementPosition);
			System.out.println(sumOfItems);
			
			System.out.println("\nEnter the number to compute factoral : ");
			double inputNumToFact = scInpObj.nextDouble();
			System.out.println("*************************************************");
			System.out.println("\nFactorial of N : ");
			double factOfNth=calculateFactorialOfN(inputNumToFact);
			System.out.println(factOfNth);
			
			System.out.println("\nN-th number of Fibonacci Series using Recursion : ");
			long nthNumInput = scInpObj.nextLong();
			System.out.println("\n*************************************************");
			System.out.println(""+nthNumInput+"th Fibonacci number : ");
			long fiboNumVal=getNthFibonaciNumber(nthNumInput);
			System.out.println(fiboNumVal);
		}
	
	
	/**
	 * N-th number of Fibonacci Series using Recursion.
	 * @param nthNumInput
	 * 
	 */
	private static long getNthFibonaciNumber(long nthNumInput) {
		if (nthNumInput == 0 || nthNumInput == 1) {
		return nthNumInput;
		}
	return getNthFibonaciNumber(nthNumInput - 1) + getNthFibonaciNumber(nthNumInput - 2);
	}


	/**
	 * Factorial of a number using Recursion.
	 * @param inputNumToFact
	 * 
	 */
	private static double calculateFactorialOfN(double inputNumToFact) {
		if (inputNumToFact == 0 || inputNumToFact == 1) {
		return 1;
		}
	return inputNumToFact * calculateFactorialOfN(inputNumToFact - 1);
	}


	/**
	 * Sum of Array elements using Recursion.
	 * @param inputArr
	 * 
	 */
	private static double findSumOfArrayElements(int n) {
			if (n == 0) {
				return inputArr[n];
			}
		return inputArr[n] + findSumOfArrayElements(n - 1);
	}

	
	public static void pushElementsIntoArray(double inputArr[]) {
		Scanner scInp1Obj = new Scanner(System.in);
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("\nEnter the element No " + (i + 1) + " : ");
			inputArr[i] = scInp1Obj.nextDouble();
		}
	}

}