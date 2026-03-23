package com.udemy.sdetintcod.section5;
import java.util.Arrays;
import java.util.Scanner;

public class Find2ndMinAnd2ndMaxOfArray {

	public static void main(String[] args) {
		Scanner scInp = new Scanner(System.in);
		System.out.print("\nEnter the size of input array : ");
		int sizeOfArray = scInp.nextInt();
		find2ndMaxAnd2ndMinFromArray(sizeOfArray);
		scInp.close();
	}

	private static void find2ndMaxAnd2ndMinFromArray(int sizeOfArray) {
		Scanner scInp = new Scanner(System.in);
		int[] inptArray = new int[sizeOfArray];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < inptArray.length; i++) {
			inptArray[i] = scInp.nextInt();
		}
		System.out.println("\nInput number array : " + Arrays.toString(inptArray));
		//Assigning the Maximum integer value to minNum , hence any number should less than that.
		int minNum=Integer.MAX_VALUE;
		//Assigning the Maximum integer value to secNdMin , hence any number should less than that.
		int secNdMin=Integer.MAX_VALUE;
		
		//Assigning the Minimum integer value to maxNum , hence any number should greater than that.
		int maxNum=Integer.MIN_VALUE;
		//Assigning the Minimum integer value to secNdMax , hence any number should greater than that.
		int secNdMax=Integer.MIN_VALUE;
		
		for (int i : inptArray) {
			if (i < minNum) {
				secNdMin = minNum;
				minNum = i;
			} else if (i < secNdMin && minNum < secNdMin) {
				secNdMin = i;
			}

			if (i > maxNum) {
				secNdMax = maxNum;
				maxNum = i;
			} else if (i > secNdMax && maxNum > secNdMax) {
				secNdMax = i;
			}
		}
		System.out.println("\nValue of Min : "+minNum);
		System.out.println("\nValue of 2nd Min : "+secNdMin);
		
		System.out.println("\nValue of Max : "+maxNum);
		System.out.println("\nValue of 2nd Max : "+secNdMax);
		scInp.close();
	}

}