package com.udemy.autocodinground.prep26.arrays;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q6Q7DuplicateRemovalOfArray {

	public static void main(String[] args) {
	int[] numArray={20,10,30,20,10,40};
	System.out.println("\nInput data array : "+Arrays.toString(numArray));
	int[] uniqueResultSet=duplicateRemovalUsingSet(numArray);
	System.out.println("\nUnique resultant data items : "+Arrays.toString(uniqueResultSet));
	quickDuplicateRemovalWithStreams(numArray);
	}

	//Implementation using stream().
	private static void quickDuplicateRemovalWithStreams(int[] numArray) {
	numArray=Arrays.stream(numArray).distinct().toArray();
	System.out.println("\nResultant unique Data : "+Arrays.toString(numArray));
	}

	//Implementation using Set
	private static int[] duplicateRemovalUsingSet(int[] numArray) {
		// To store the unique elements by preserving order of element.
		Set<Integer> resultDataSet = new LinkedHashSet<>();
		for (int items : numArray) {
			resultDataSet.add(items);
		}
    //convertion to stream() objects int map using mapToInt() terminal operation to convert back to original array.
	return resultDataSet.stream().mapToInt(Integer::intValue).toArray();
	}

}