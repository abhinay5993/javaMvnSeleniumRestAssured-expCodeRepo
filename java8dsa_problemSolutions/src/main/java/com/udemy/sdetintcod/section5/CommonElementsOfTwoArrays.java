package com.udemy.sdetintcod.section5;
import java.util.Arrays;

public class CommonElementsOfTwoArrays {

	public static void main(String[] args) {
	int[] arrayA={1,2,3,4,5};
	int[] arrayB={4,5,6,7,8};
	getCommonArrayElements(arrayA,arrayB);
	
	int[] array2A={1, 1, 1};
	int[] array2B={1, 1, 1, 1, 1};
	getCommonArrayElements(array2A,array2B);
	
	
	}

	private static void getCommonArrayElements(int[] arrayA, int[] arrayB) {
		System.out.println("\nArray A : " + Arrays.toString(arrayA));
		System.out.println("\nArray B : " + Arrays.toString(arrayB));
		System.out.println("\nCommon Array Elements : ");
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				if (arrayA[i] == arrayB[j]) {
					System.out.print(arrayA[i] + ", ");
					break;
				}
			}
		}
	}

}