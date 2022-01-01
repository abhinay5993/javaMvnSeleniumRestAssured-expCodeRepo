package com.problemsolving.testUtilExps;
import java.util.Arrays;

public class ContinueBreakExps {
	
	public static void main(String[] args) {
		int[] x1={-2,3,5,-1,6,10};
		int[] x2={10,12,7,3,0,34,37,4};
		System.out.println("\nData of First array : "+Arrays.toString(x1));
		System.out.println("\nData of 2nd array : "+Arrays.toString(x2));
		System.out.println("\nData of 3rd Merged array : "+Arrays.toString(mergeArraysByBreakAndContinue(x1, x2)));
	}
	
	public static int[] mergeArraysByBreakAndContinue(int[] arr1,int[] arr2)
	{
		int newMergedArry[]=new int[arr1.length+arr2.length];
		int items=0;
		
		for(int arrTwoItems:arr2)
		{
			System.out.println("\nBefore If and contine");
			if(arrTwoItems%2!=0)
			{
				System.out.println("\nInside If before Contine");
				continue;
			}
			System.out.println("\nIteration skiped");
			newMergedArry[items]=arrTwoItems;
			items++;
			System.out.println("\nItems pushed from for Continue");
		}
		
		for(int arrOneItems:arr1)
		{
			System.out.println("\nBefore If and break");
			if(arrOneItems==-1)
			{
				System.out.println("\nInside If before break");
				break;
			}
			newMergedArry[items]=arrOneItems;
			items++;
			System.out.println("\nItems pushed from for break");
		}
		return newMergedArry;
	}

}