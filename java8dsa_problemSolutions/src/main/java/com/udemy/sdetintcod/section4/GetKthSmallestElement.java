package com.udemy.sdetintcod.section4;
import java.util.Arrays;

public class GetKthSmallestElement {

	public static void main(String[] args) {
		int[] numArray = { 7, 10,4,3,20,15 };
		int kthTarget = 4;
		getTheKthSmallestElement(numArray, kthTarget);
	}

	private static void getTheKthSmallestElement(int[] numArray, int kthTarget) {
	// Sort the array Elements
	Arrays.sort(numArray);
	System.out.println("\nSorted input Array : "+Arrays.toString(numArray));
	int kthSmallTerm=numArray[kthTarget-1];
	System.out.println("\nValues of Kth Smallest element : "+kthSmallTerm);
	}

}