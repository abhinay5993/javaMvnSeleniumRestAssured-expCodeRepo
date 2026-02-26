package com.udemy.sdetintcod.section4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumberFinder {

	public static void main(String[] args) {
		int[] numArray = {5,6,0,3,3,1,10,20,15};
		System.out.println("\nInput array : " + Arrays.toString(numArray));
		System.out.println("\n********* Missing Elements of Array ***********");
		missingArrayElements(numArray);
	}

	private static void missingArrayElements(int[] numArray) {
		// Sort the Array Elements :
		Arrays.sort(numArray);
		int first = numArray[0];
		int last = numArray[numArray.length - 1];
		System.out.println("\nSorted Array Elements : " + Arrays.toString(numArray));

		List<Integer> arrList = new ArrayList<>();
		for (int i = first; i <= last; i++) {
			if (!containsArrayItems(numArray, i)) {
				arrList.add(i);
			}
		}
		System.out.println("\nList of Missing Items : " + arrList);

	}

	private static boolean containsArrayItems(int[] numArr, int target) {
		boolean flag = false;
		for (int items : numArr) {
			if (items == target) {
				flag = true;
			}
		}
		return flag;
	}

}