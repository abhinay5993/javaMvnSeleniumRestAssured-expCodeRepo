package com.dsa.hershalGoogleSdet;

public class SortingAlgorithmsExp {

	
	
	public void quickSorting(double[] inpArray) {
		if (inpArray != null) {
			quickSortAlorithm(inpArray, 0, inpArray.length - 1);
		} else {
			System.out.println("unable!! to sort data.. array is null.");
			return;
		}
	}

	private void quickSortAlorithm(double[] inpArray, int startIndex, int endIndex) {
		// base condition for recursion
		if (startIndex >= endIndex) {
			return;
		}

		int newBoundaryIndex = getBoundaryIndexForQuickSortPartition(inpArray, startIndex, endIndex);
		// sort the left array
		quickSortAlorithm(inpArray, startIndex, newBoundaryIndex - 1);
		// sort the right array
		quickSortAlorithm(inpArray, newBoundaryIndex + 1, endIndex);
	}

	// method to get boundary Index by Partisionting target array
	private int getBoundaryIndexForQuickSortPartition(double[] inpArray, int startIndex, int endIndex) {
		double pivote = inpArray[endIndex];
		int boundaryIndex = startIndex - 1;

		for (int i = startIndex; i <= endIndex; i++) {
			if (pivote >= inpArray[i]) {
				boundaryIndex++;
				// calling swap logic
				swapArrayDataByIndex(inpArray, boundaryIndex, i);
			}
		}
		return boundaryIndex;
	}

	// method for swapping array elements
	private void swapArrayDataByIndex(double[] inpArray, int index1, int index2) {
		double holdData = inpArray[index1];
		inpArray[index1] = inpArray[index2];
		inpArray[index2] = holdData;
	}
	
}