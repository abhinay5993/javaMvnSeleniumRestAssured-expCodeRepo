package com.udemy.sdetintcod.section5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
	int[] arrayA= {1,2,2,1};
	int[] arrayB= {2,2};
	getIntersectionsOfArrayElements(arrayA,arrayB);
	
	int[] arrayA2= {4,9,5};
	int[] arrayB2= {9,4,9,8,4};
	getIntersectionsOfArrayElements(arrayA2,arrayB2);
	
	}

	private static void getIntersectionsOfArrayElements(int[] arrayA, int[] arrayB) {
		System.out.println("\nArray A : "+Arrays.toString(arrayA));
		System.out.println("\nArray B : "+Arrays.toString(arrayB));
		List<Integer> lstItems=new ArrayList<>();
		
		for (int outLoopItem : arrayA) {
			int outCurrentItem = outLoopItem;
			for (int innterLoopItem : arrayB) {
				int innerCurrentItem = innterLoopItem;
				if (outCurrentItem == innterLoopItem) {
					//Only the Non-Seen Items to be added to arrayList
					if(!isListItemContains(lstItems,innerCurrentItem)) {
						lstItems.add(innerCurrentItem);
						break;
					}
				}
			}
		}
		System.out.println("\nIntersected Array : "+Arrays.toString(lstItems.toArray(new Integer[0])));

	}

	private static boolean isListItemContains(List<Integer> lstItems, int innerCurrentItem) {
		boolean resultFlag = false;
		for (Integer items : lstItems) {
		resultFlag = (items == innerCurrentItem) ? true : resultFlag;
		}
		return resultFlag;
	}

}