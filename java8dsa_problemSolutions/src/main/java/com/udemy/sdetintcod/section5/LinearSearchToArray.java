package com.udemy.sdetintcod.section5;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchToArray {

	public static void main(String[] args) {
	Scanner scInp=new Scanner(System.in);
	System.out.print("\nEnter the size of input array : ");
	int sizeOfArray=scInp.nextInt();
	System.out.print("\nEnter the target element : ");
	int target=scInp.nextInt();
	performLinearSearch(sizeOfArray,target);
	scInp.close();
	}

	private static void performLinearSearch(int sizeOfArray, int target) {
		Scanner scInp = new Scanner(System.in);
		int[] inptArray = new int[sizeOfArray];
		System.out.println("\nEnter the array elements : ");
		for (int i = 0; i < inptArray.length; i++) {
			inptArray[i] = scInp.nextInt();
		}
		System.out.println("\nInput number array : "+Arrays.toString(inptArray));
		int result = -1;
		for (int i = 0; i < inptArray.length; i++) {
			if (inptArray[i] == target) {
				result = i;
				break;
			}
		}
		if (result != -1) {
			System.out.println("\nElement found in the array at : " + result);
		} else {
			System.out.println("\nElement not found!!..");
		}
		scInp.close();
	}

}