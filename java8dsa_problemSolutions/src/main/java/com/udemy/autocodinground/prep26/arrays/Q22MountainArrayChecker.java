package com.udemy.autocodinground.prep26.arrays;
import java.util.Arrays;

public class Q22MountainArrayChecker {

	public static void main(String[] args) {
		// set1 - check if its a Mountain array
		int[] inp1TdArray = { 4, 4, 3, 2, 1 };
		System.out.println("\nCheck If the input array is Mountain type : " + checkIsAMountainArray(inp1TdArray));

		// set2 - check if its a Mountain array
		int[] inp2TdArray = { 1, 2, 3, 4, 9, 8, 7, 6, 5 };
		System.out.println("\nCheck If the input array is Mountain type : " + checkIsAMountainArray(inp2TdArray));

		// set3 - check if its a Mountain array
		int[] inp3TdArray = { 2, 1 };
		System.out.println("\nCheck If the input array is Mountain type : " + checkIsAMountainArray(inp3TdArray));

		// set4 - check if its a Mountain array
		int[] inp4TdArray = { 0, 1, 2, 3, 4, 5 };
		System.out.println("\nCheck If the input array is Mountain type : " + checkIsAMountainArray(inp4TdArray));

		// set5 - check if its a Mountain array
		int[] inp5TdArray = { 0, 3, 2, 1 };
		System.out.println("\nCheck If the input array is Mountain type : " + checkIsAMountainArray(inp5TdArray));

	}

	private static boolean checkIsAMountainArray(int[] inp2TdArray) {
		System.out.println("\nInput Array : " + Arrays.toString(inp2TdArray));
		boolean resultFlag = false;
		int arrLen = inp2TdArray.length;
		if (inp2TdArray == null || arrLen < 3) {
			return resultFlag;
		}
		int right = arrLen - 1;
		int mountCount = 0;

		// 1. Walk up: Move forward as long as elements are strictly increasing
		while (mountCount + 1 < arrLen && inp2TdArray[mountCount] < inp2TdArray[mountCount + 1]) {
			mountCount++;
		}

		// 2. Validate Peak: The peak cannot be the first or the last element
		if (mountCount == 0 || mountCount == right) {
			return resultFlag;
		}
		
		// 3. Walk down: Move forward as long as elements are strictly decreasing
		while (mountCount + 1 < arrLen && inp2TdArray[mountCount] > inp2TdArray[mountCount + 1]) {
			mountCount++;
		}
		return (right == mountCount);
	}

}