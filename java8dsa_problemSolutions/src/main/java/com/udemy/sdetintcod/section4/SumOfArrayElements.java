package com.udemy.sdetintcod.section4;
import java.util.Arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		double[] numArray={1,2,6,7,8,9,4,5};
		doSumOfArrayElements(numArray);
	}

	private static void doSumOfArrayElements(double[] numArray) {
		System.out.println("\nInput Array : " + Arrays.toString(numArray));
		double sum = 0.0;
		for (double numItems : numArray) {
			sum += numItems;
		}
		System.out.println("\nSum of All elements : " + sum);
	}

}