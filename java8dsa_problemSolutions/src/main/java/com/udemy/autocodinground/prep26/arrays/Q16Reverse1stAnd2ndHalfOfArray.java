package com.udemy.autocodinground.prep26.arrays;
import java.util.Arrays;

public class Q16Reverse1stAnd2ndHalfOfArray {

	public static void main(String[] args) {
		//Data set1
		int[] numArray={20,10,30,20,10,40,50,5,7,25,16,21};
		System.out.println("\nInput data array : "+Arrays.toString(numArray));
		reverseFirstHalfPartOfArray(numArray);
		System.out.println("\n2nd Largest Number from input array : "+findSecondLargestNumber(numArray));
		
		//Data set2
		int[] num2Array={4,5,10,3,7,11,8};
		System.out.println("\nInput data2 array : "+Arrays.toString(num2Array));
		reverseFirstHalfPartOfArray(num2Array);
		System.out.println("\n2nd Largest Number from input array : "+findSecondLargestNumber(num2Array));
		
		//Data set3
		int[] num3Array={20,10,30,20,10,40,50,5,7,25,16,21};
		System.out.println("\nInput data3 array : "+Arrays.toString(num3Array));
		reverseLastHalfPartOfArray(num3Array);
		
		//Data set4
		int[] num4Array={4,5,10,3,7,11,8};
		System.out.println("\nInput data4 array : "+Arrays.toString(num4Array));
		reverseLastHalfPartOfArray(num4Array);
		
		//Compute the sum & avg of array elements
		computeAvgSumOfInputArray(numArray);
		computeAvgSumOfInputArray(num2Array);
	}

	private static void computeAvgSumOfInputArray(int[] numArray) {
	int resultSum=0;
	int noOfItems=numArray.length;
	for (int numItems:numArray) {
		resultSum=resultSum+numItems;
	}
	System.out.println("\nSum of Input Array : "+resultSum);
	double avg=(resultSum/(float) noOfItems);
	System.out.println("\nAverage : "+avg);
	}

	private static int findSecondLargestNumber(int[] numArray) {
		int maxNum = Integer.MIN_VALUE;
		int secMaxNum = Integer.MIN_VALUE;
		for (int numItems : numArray) {
			if (numItems > maxNum) {
				secMaxNum = maxNum;
				maxNum = numItems;
			} else if (numItems > secMaxNum && secMaxNum < maxNum) {
				secMaxNum = numItems;
			}
		}
		return secMaxNum;
	}

	private static void reverseFirstHalfPartOfArray(int[] numArray) {
		int l = 0;
		int h = numArray.length - 1;
		int mid = l + (h - l) / 2;
		System.out.println("\nTotal Length : "+numArray.length+" ; Mid-Index of array : " + mid+" element : "+numArray[mid]);
		while (l < mid) {
			int temNum = numArray[l];
			numArray[l] = numArray[mid];
			numArray[mid] = temNum;
			l++;
			mid--;
		}
		System.out.println("\nResultant Partial 1st-Half Reversed Array : "+Arrays.toString(numArray));
	}
	
	
	private static void reverseLastHalfPartOfArray(int[] numArray) {
		int mid=(numArray.length/2);
		int l=mid;
		int h=numArray.length-1;
		System.out.println("\nTotal Length : "+numArray.length+" ; Mid-Index of array : " + mid+" element : "+numArray[mid]);
		while (l < h) {
			int temNum = numArray[l];
			numArray[l] = numArray[h];
			numArray[h] = temNum;
			l++;
			h--;
		}
		System.out.println("\nResultant Partial 2nd-Half Reversed Array : "+Arrays.toString(numArray));
	}

}