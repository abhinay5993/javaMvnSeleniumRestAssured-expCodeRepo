package com.kk.recursion;

public class RecursiveBinarySearchExp {

	public static void main(String[] args) {
		
		double dobData[]= {1,2,3,4,5,44,55,66,77,99};
		double searchItem=66;
		int binPos=BinarySearchByRecursion(dobData, searchItem, 0, dobData.length-1);
		System.out.println("\nItem found in the position By Binary Search : "+binPos);
	}
	
	static int BinarySearchByRecursion(double inpData[], double searchItem, int startPos, int endPos) {
		if (startPos > endPos) {
			return -1;
		}
		int midIndexPos = startPos + (endPos - startPos) / 2;
		
		if (inpData[midIndexPos] == searchItem) {
			return midIndexPos;
		}

		if (inpData[midIndexPos] > searchItem) {
			return BinarySearchByRecursion(inpData, searchItem, startPos, midIndexPos - 1);
		}

		return BinarySearchByRecursion(inpData, searchItem, midIndexPos + 1, endPos);
	}
}
