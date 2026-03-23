package com.udemy.sdetintcod.section5;

public class LongestCommonSubSequenceLen {

	public static void main(String[] args) {
	int[] arrayA={1,3,4,5,6,7};
	int[] arrayB={3,5,6,8};
	int len=getLengthOfLCS(arrayA,arrayB);
	System.out.println("\nLength of Longest common sub-sequence : "+len);
	
	int[] array2A={10,9,2,5,3,7,101,18};
	int[] array2B={2,3,7,101};
	int len2=getLengthOfLCS(array2A,array2B);
	System.out.println("\nLength of Longest common sub-sequence : "+len2);
	
	
	}

	private static int getLengthOfLCS(int[] arrayA, int[] arrayB) {
	//Step-1: Get the length of each input array
	int m=arrayA.length;
	int n=arrayB.length;
	
	//Step-2:Dynamic programming 2D array initialization for lengths
	int dynArr[][]=new int[m+1][n+1];
	
	//Step-3:Fillout the 2D dynArr[][] array by traversing the arrayA & arrayB
	//Outer loop to traverse to arrayA
	for (int i = 1; i <= m; i++) {
		// Inner loop to traverse to arrayB
		for (int j = 1; j <= n; j++) {
			// if the Current elements of both arrays element matches then added 1 to diagonal element dynArr[i-1][j-1] which will part of LCS
			if (arrayA[i-1]==arrayB[j-1]) {
				dynArr[i][j]=dynArr[i-1][j-1]+1;
			} else {
				//Step-4:Evaluate the maximum between top dynArr[i][j-1] and left item dynArr[i-1][j]
				dynArr[i][j]=Math.max(dynArr[i][j-1],dynArr[i-1][j]);
			}

		}
	}
	
	//Returning the last final element which is the length of LCS
	return dynArr[m][n];
	}

}