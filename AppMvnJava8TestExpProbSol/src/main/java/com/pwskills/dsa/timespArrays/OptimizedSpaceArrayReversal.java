package com.pwskills.dsa.timespArrays;
import java.util.Arrays;

public class OptimizedSpaceArrayReversal {

	public static void main(String[] args) {
		double doblArr[]= {2,3,4,5,24.4,-4.5,43.55,6,-4.005,99.43,7,0.455};
		System.out.println("\nArray Data Items : "+Arrays.toString(doblArr));
		System.out.println("\nReversed Data Items of Array : "+Arrays.toString(doArrayReversalBySwapping(doblArr)));
		
		//Check for Array Palindromic
		double newDopArr[]= {1,2,3,2,1};
		System.out.println("\nArray Data Items : "+Arrays.toString(newDopArr));
		checkArrayIsPalindrom(newDopArr);
	}

	// Array Traversal will be performed on half size of array --> Time Complexity -
	// O(n/2) (same as O(n)) relatively better.
	// Due to inspace swapping Space complexity can be improved from O(n) to O(1)
	private static double[] doArrayReversalBySwapping(double[] doblArr) {
		if (doblArr.length == 0) {
			throw new RuntimeException("Unable to Process for Empty!! Array");
		}

		if (doblArr == null) {
			throw new RuntimeException("Null!! Array.. Unable to Process");
		}

		int arrSize = doblArr.length;
		int midLen = (arrSize / 2);
		for (int i = 0; i < midLen; i++) {
			double temDat = doblArr[i];
			doblArr[i] = doblArr[arrSize - i - 1];
			doblArr[arrSize - i - 1] = temDat;
		}
		return doblArr;
	}
	
	
	
	// Array Traversal will be performed on half size of array --> Time Complexity -
	// O(n/2) (same as O(n)) relatively better.
	// Due to inspace swapping Space complexity can be improved from O(n) to O(1)
	private static void checkArrayIsPalindrom(double[] doblArr) {
		int flagVal = 0;
		if (doblArr.length == 0) {
			throw new RuntimeException("Unable to Process for Empty!! Array");
		}

		if (doblArr == null) {
			throw new RuntimeException("Null!! Array.. Unable to Process");
		}

		int arrSize = doblArr.length;
		int midLen = (arrSize / 2);
		for (int i = 0; i < midLen; i++) {
			if (doblArr[i] != doblArr[arrSize - i - 1]) {
				flagVal = 1;
				System.out.println("\nArray Elements are Not!! Palindromic");
				break;
			}
		}
		if (flagVal==0) {
			System.out.println("\nArray Elements are Palindromic");
		}

	}
	

}