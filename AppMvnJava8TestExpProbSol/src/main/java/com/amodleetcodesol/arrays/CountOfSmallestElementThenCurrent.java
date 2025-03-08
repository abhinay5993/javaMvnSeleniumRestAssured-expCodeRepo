package com.amodleetcodesol.arrays;
import java.util.Arrays;

public class CountOfSmallestElementThenCurrent {

	public static void main(String[] args) {
	int[] inpArr={8,1,2,2,3};
	System.out.println("\nInput Array1 elements : "+Arrays.toString(inpArr));
	getCountOfSmallestElementThenCurrentFromArray(inpArr,inpArr.length);
	
	int[] inpArr1={6,5,4,8};
	System.out.println("\nInput Array2 elements : "+Arrays.toString(inpArr1));
	getCountOfSmallestElementThenCurrentFromArray(inpArr1,inpArr1.length);
	
	int[] inpArr2={7,7,7,7};
	System.out.println("\nInput Array3 elements : "+Arrays.toString(inpArr2));
	getCountOfSmallestElementThenCurrentFromArray(inpArr2,inpArr2.length);
	
	}

	//Over all time complexity - O(n2)+O(n)
	private static void getCountOfSmallestElementThenCurrentFromArray(int[] inpArr, int length) {
		int[] resultArray=new int[length];
		//O(n2)
		for (int i = 0; i < inpArr.length; i++) {
			int currentElement = inpArr[i];
			int smallCounter = 0;
			
			for (int j = 0; j < inpArr.length; j++) {
				if (i!=j && currentElement > inpArr[j]) {
					smallCounter++;
				}
			}
			resultArray[i] = smallCounter;
		}

		//O(n)
		System.out.println("\nList of Smallest elements count w.r.t current element : ");
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + " ");
		}
		System.out.println(" ");
	}

}