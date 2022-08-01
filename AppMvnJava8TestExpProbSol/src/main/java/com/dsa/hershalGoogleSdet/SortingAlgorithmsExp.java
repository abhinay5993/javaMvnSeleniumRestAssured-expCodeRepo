package com.dsa.hershalGoogleSdet;

public class SortingAlgorithmsExp {

	// Bubble sort logic
	public void bubbleSortingAlgorithm(double[] inpArray) {
		
		if (inpArray == null) {
			System.out.println("\nunable!! to bubbleSorting data.. array is null...");
			return;
		}

		for (int i = 0; i < inpArray.length; i++) {
			// optimized traversal for sorting remaining arry elements
			for (int j = 1; j < inpArray.length - i; j++) {
				// calling the swap logic
				swapArrayDataByIndex(inpArray, j, j - 1);
			}
		}
	}
	
	// Selection Sort logic
	public void selectionSortingAlgorithm(double[] inpArray) {

		if (inpArray == null) {
			System.out.println("\nunable!! to selectionSorting data.. array is null...");
			return;
		}

		for (int i = 0; i < inpArray.length; i++) {
			int minIndex = i;
			for (int j = i; j < inpArray.length; j++) {
				if (inpArray[j] < inpArray[minIndex]) {
					minIndex = j;
				}
			}
			// calling the swap logic
			swapArrayDataByIndex(inpArray, i, minIndex);
		}

	}

	// Merge Sort logic --> No swap logic required
	public void mergeSortingAlgorithm(double[] inpArray) {

		if (inpArray == null) {
			System.out.println("\nunable!! to mergeSorting data.. array is null.");
			return;
		}

		// base condition for recursion
		if (inpArray.length < 2) {
			return;
		}

		// operation for dividing the array
		int midIndex = (inpArray.length / 2);
		int rightArraySize = (inpArray.length - midIndex);
		double leftArray[] = new double[midIndex];
		double rightArray[] = new double[rightArraySize];

		// fill the left array by dividing
		for (int i = 0; i < midIndex; i++) {
			leftArray[i] = inpArray[i];
		}

		// fill the right array by dividing
		for (int i = midIndex; i < inpArray.length; i++) {
			rightArray[i - midIndex] = inpArray[i];
		}

		// Recursive call passing the sub-problems input post dividing the array
		mergeSortingAlgorithm(leftArray);
		mergeSortingAlgorithm(rightArray);

		// array merge operation
		arrayMergeOperation(leftArray, rightArray, inpArray);
	}

	private void arrayMergeOperation(double[] leftArray, double[] rightArray, double[] resultArray) {
		int leftArrCounter = 0;
		int rightArrCounter = 0;
		int resArrCounter = 0;

		while (leftArrCounter < leftArray.length && rightArrCounter < rightArray.length) {

			if (leftArray[leftArrCounter] < rightArray[rightArrCounter]) {
				resultArray[resArrCounter++] = leftArray[leftArrCounter++];
			} else {
				resultArray[resArrCounter++] = rightArray[rightArrCounter++];
			}

		}

		// pushing the extra left array elements to result array
		while (leftArrCounter < leftArray.length) {
			resultArray[resArrCounter++] = leftArray[leftArrCounter++];
		}

		// pushing the extra right array elements to result array
		while (rightArrCounter < rightArray.length) {
			resultArray[resArrCounter++] = rightArray[rightArrCounter++];
		}

	}

	// Quick Sort logic
	public void quickSorting(double[] inpArray) {
		if (inpArray != null) {
			quickSortAlorithm(inpArray, 0, inpArray.length - 1);
		} else {
			System.out.println("\nunable!! to quickSorting data.. array is null.");
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

	// method to get boundary Index by Partisionting target array for quick sort
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