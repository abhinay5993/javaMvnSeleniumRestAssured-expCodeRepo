package com.udemy.sdetintcod.section5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumbersOfArray {

	public static void main(String[] args) {
	int[] inpNumArr={8, 2, 4, 5, 3, 7, 1};
	findMissingNumbersOfArray(inpNumArr);
	
	int[] inpNumArr2={4,3,2,7,8,2,3,1};
	findMissingNumbersOfArray(inpNumArr2);
	}

	private static void findMissingNumbersOfArray(int[] inpNumArr) {
		List<Integer> missingItems = new ArrayList<>();

		// For optimization sort the array
		Arrays.sort(inpNumArr);
		System.out.println("\nInput number Array : " + Arrays.toString(inpNumArr));
		int first = inpNumArr[0];
		int last = inpNumArr[inpNumArr.length - 1];
		for (int i = first; i <= last; i++) {
			// Pushing non-avaible items to array List
			if (!isMissingItemContains(inpNumArr, i)) {
				missingItems.add(i);
			}
		}
		if (missingItems.size() > 0) {
			System.out.println("\nResultant Missing Items : " +Arrays.toString(missingItems.toArray(new Integer[0])));
		} else {
			System.out.println("\nNo missing!.. items..");
		}
	}

	private static boolean isMissingItemContains(int[] missingItems, int i) {
		boolean resultFlag = false;
		for (int items : missingItems) {
			resultFlag = (items == i) ? true : resultFlag;
		}
		return resultFlag;
	}

}