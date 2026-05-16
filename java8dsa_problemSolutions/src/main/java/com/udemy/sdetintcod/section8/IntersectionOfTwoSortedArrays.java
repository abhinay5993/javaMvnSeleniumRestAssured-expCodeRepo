package com.udemy.sdetintcod.section8;
import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 2, 2, 2, 4 };
		int[] arr2 = { 2, 2, 4, 4 };

		int[] arr3 = { 1, 2 };
		int[] arr4 = { 3, 4 };

		int[] arr5 = { 1, 2, 3 };
		int[] arr6 = { 1, 2, 3 };

		List<Integer> interList = getIntersectedListItems(arr1, arr2);
		System.out.println("\nValue of intersected list : " + interList);
		
		List<Integer> inter2List = getIntersectedListItems(arr3, arr4);
		System.out.println("\nValue of intersected-1 list : " + inter2List);
		
		List<Integer> inter3List = getIntersectedListItems(arr5, arr6);
		System.out.println("\nValue of intersected-2 list : " + inter3List);
	}

	private static List<Integer> getIntersectedListItems(int[] arr1, int[] arr2) {
		List<Integer> resultList = new ArrayList<>();
		// Initialization of two pointers - one for each array.
		int left = 0;
		int right = 0;

		while (left < arr1.length && right < arr2.length) {
			// step-1:check condition for equality of elements
			if (arr1[left] == arr2[right]) {
				resultList.add(arr1[left]);
				left++;
				right++;
			}
			// step-2:check condition for element at left position is < element at right position
			else if (arr1[left] < arr2[right]) {
			left++;
			} else {
			// step-3:check condition for element at left position is > element at right position
			right++;
			}
		}
		return resultList;
	}

}