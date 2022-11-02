package com.acciojob.codeArrays;
import java.util.Arrays;

public class SecondLargestPrimeItem {
	
	public static void main(String[] args) {
		int upperBound=50;
		int arr[]=getPrimeNumbers(upperBound);
		System.out.println("\nPrime Numbers Array Items : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("\nSecond Largest Prime Number : "+getSecondLargestPrimeNumber(arr));
	}
	
	public static int[] getPrimeNumbers(int upper) {
		int primeNums[] = new int[upper];
		int num = 1;
		int primeCount = 0;
		int t = 0;
		System.out.println("\nPushed Numbers : ");
		for (int k = 0; k < upper; k++) {
			System.out.println(num);
			primeNums[k] = num;
			num++;
		}

		for (int j = 0; j < primeNums.length; j++) {

			for (int i = 1; i <= upper; i++) {
				if (primeNums[j] % i == 0) {
					t = i;
					primeCount++;
				}
			}
			if (primeCount == 2) {
				primeNums[j] = t;
			} else {
				primeNums[j] = -1;
			}
			primeCount = 0;
		}
		return primeNums;
	}
	
	
	public static int getSecondLargestPrimeNumber(int[] primeArray) {
		int maxNum = Integer.MIN_VALUE;
		int secMaxNum = Integer.MIN_VALUE;
		for (int i = 0; i < primeArray.length; i++) {
			if (primeArray[i] >= maxNum) {
				secMaxNum = maxNum;
				maxNum = primeArray[i];
			} else if (primeArray[i] >= secMaxNum) {
				secMaxNum = primeArray[i];
			}
		}
		return secMaxNum;
	}
	
}