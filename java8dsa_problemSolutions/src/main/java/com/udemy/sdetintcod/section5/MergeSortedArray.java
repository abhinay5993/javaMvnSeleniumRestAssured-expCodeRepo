package com.udemy.sdetintcod.section5;

public class MergeSortedArray {

	public static void main(String[] args) {
	int[] arrayA={1,2,4,6,9};
	int[] arrayB={7,10,11,0,-2,5,33,3,99};
	performMergeSort(arrayA,arrayB);
	}

	private static void performMergeSort(int[] arrayA, int[] arrayB) {
		int arrLenA = arrayA.length;
		int arrLenB = arrayB.length;
		// Initialization of resultant merged array
		int[] resultArr = new int[arrLenA + arrLenB];

		// pointer for 1st array.
		int i = 0;
		// pointer for 2nd array.
		int j = 0;
		// pointer for resultant array - keep track of current position.
		int k = 0;

		while (i < arrLenA && j < arrLenB) {
			
			if(arrayA[i] < arrayB[j]) {
				resultArr[k] = arrayA[i];
				//Move next number to arrayA
				i++;
			} 
			else {
				resultArr[k] = arrayB[j];
				//Move next number to arrayB
				j++;
			}
			//In either way the resultant array has to filled as one more spot is available.
			k++;
		}

		//if 1st array has left over elements.
		while (i < arrLenA) {
			resultArr[k++]=arrayA[i++];
		}
		
		//if 2nd array has left over elements.
		while (j < arrLenB) {
			resultArr[k++]=arrayB[j++];
		}
		
		for (int k2 = 0; k2 < resultArr.length; k2++) {
		System.out.print(resultArr[k2]+", ");	
		}
		
	}

}