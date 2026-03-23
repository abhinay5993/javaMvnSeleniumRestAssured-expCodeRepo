package com.udemy.sdetintcod.section5;
import java.util.Arrays;

public class ShowArrayInReverseOrder {

	public static void main(String[] args) {
		double[] numArray = { 1, 2, 105, 6, 7, 8, 99, 9, 3, 400, 5, 390, 200 };
		doArrayReversal(numArray);
	}

	private static void doArrayReversal(double[] numArray) {
	System.out.println("\nInput array : "+Arrays.toString(numArray));
	
	System.out.println("\nOutput reversed array Elements: ");
	for (int i = numArray.length-1; i>=0; i--) {
		System.out.print(numArray[i]+", ");
	}
	
	}

}