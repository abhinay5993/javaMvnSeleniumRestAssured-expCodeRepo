package com.problemsolving.testUtilExps;

public class GuviTwiceExceptOneByIntArray {
	
	public static void main(String[] args) {
		int inpData[]= {15, 18, 16, 18, 16, 15, 89};
		
		System.out.println("\nUnique element occurance only once : "+findTwiceExceptOneFromIntArray(inpData));
	}
	
	public static int findTwiceExceptOneFromIntArray(int testData[]) {
		int searchElement = testData[0];
		for (int i = 1; i < testData.length; i++) {
			searchElement = searchElement ^ testData[i];
		}
		return searchElement;
	}

}