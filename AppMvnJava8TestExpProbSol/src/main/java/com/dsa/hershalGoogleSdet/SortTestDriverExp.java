package com.dsa.hershalGoogleSdet;
import java.util.Arrays;

public class SortTestDriverExp {

	public static void main(String[] args) {
		// 4,22,0.99,-0.4569,-45.99,522.3225,3
		SortingAlgorithmsExp sortingAlgObj = new SortingAlgorithmsExp();
		double[] inpDataArray = { 4,22,0.99,-0.4569,-45.99,522.3225,3 };
		System.out.println("\nI/P array before quick sorting : " + Arrays.toString(inpDataArray));

		// calling sorting algo to sort data
		long startTime = System.nanoTime();
		sortingAlgObj.quickSorting(inpDataArray);
		long endTime = System.nanoTime();
		System.out.println("\nO/P array After quick sorting : " + Arrays.toString(inpDataArray) + " Time taken : "
				+ (endTime - startTime));

		// calling sorting algo to sort data
		long start2Time = System.nanoTime();
		sortingAlgObj.mergeSortingAlgorithm(inpDataArray);
		long end2Time = System.nanoTime();
		System.out.println("\nO/P array After Merge sorting : " + Arrays.toString(inpDataArray) + " Time taken : "
				+ (end2Time - start2Time));

		// calling sorting algo to sort data
		long start3Time = System.nanoTime();
		sortingAlgObj.selectionSortingAlgorithm(inpDataArray);
		long end3Time = System.nanoTime();
		System.out.println("\nO/P array After Selection sorting : " + Arrays.toString(inpDataArray) + " Time taken : "
				+ (end3Time - start3Time));

		// calling sorting algo to sort data
		long start4Time = System.nanoTime();
		sortingAlgObj.bubbleSortingAlgorithm(inpDataArray);
		long end4Time = System.nanoTime();
		System.out.println("\nO/P array After Selection sorting : " + Arrays.toString(inpDataArray) + " Time taken : "
				+ (end4Time - start4Time));

	}
	
}