package com.udemy.sdetintcod.section5;
import java.util.Arrays;
import java.util.Scanner;

public class FindMajorityElements {

	public static void main(String[] args) {
		Scanner scInp=new Scanner(System.in);
		System.out.print("\nEnter the size of input array : ");
		int sizeOfArray=scInp.nextInt();
		getMejorityElement(sizeOfArray);
		scInp.close();
	}

	private static void getMejorityElement(int sizeOfArray) {
		Scanner scInp = new Scanner(System.in);
		int[] inptArray = new int[sizeOfArray];
		System.out.println("\nEnter the array elements : \n");
		for (int i = 0; i < inptArray.length; i++) {
			inptArray[i] = scInp.nextInt();
		}
		System.out.println("\nInput number array : " + Arrays.toString(inptArray));
		int majoCandid = -1;
		int count = 0;
		int halfLen = (inptArray.length / 2);
		System.out.println("\nHalf Length of input array : " + halfLen);
		// Traverse to the array to find the majority element.
		for (int itNum : inptArray) {
			if(count == 0) {
				majoCandid=itNum;
			}
			// Increase or Decrease the majority element
			count += (majoCandid == itNum) ? 1 : -1;
		}
		count = 0;
		// verification of majority element
		for (int itNum : inptArray) {
			if(majoCandid == itNum) {
				count++;
			}
		}

		if (count > halfLen) {
			System.out.println("\nMejority element found : " + majoCandid);
		} else {
			System.out.println("\nMejority element No!!.. found");
		}

		scInp.close();
	}

}