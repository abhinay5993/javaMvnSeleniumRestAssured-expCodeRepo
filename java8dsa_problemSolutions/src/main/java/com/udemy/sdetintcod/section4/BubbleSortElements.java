package com.udemy.sdetintcod.section4;
import java.util.Arrays;

public class BubbleSortElements {

	public static void main(String[] args) {
	double[] numArray={1,2,105,6,7,8,99,9,3,400,5,390,200};
	doBubbleSortOnArrayElements(numArray);
	}

	/**
	 * Perform bubble sort with input array.
	 * @param numArray
	 */
	private static void doBubbleSortOnArrayElements(double[] numArray) {
		System.out.println("\nInput Array Elements : " + Arrays.toString(numArray));
		int arrLen = numArray.length - 1;
		for (int i = 0; i < arrLen; i++) {
			for (int j = 0; j < arrLen - i; j++) {
				if (numArray[j] > numArray[j + 1]) {
					double tempHold = numArray[j];
					numArray[j] = numArray[j + 1];
					numArray[j + 1] = tempHold;
				}

			}
		}
		System.out.println("\nResultant Sorted Array : " + Arrays.toString(numArray));
	}

}