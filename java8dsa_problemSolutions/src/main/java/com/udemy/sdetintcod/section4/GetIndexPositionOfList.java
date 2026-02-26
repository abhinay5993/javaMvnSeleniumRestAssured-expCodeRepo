package com.udemy.sdetintcod.section4;
import java.util.ArrayList;
import java.util.List;

public class GetIndexPositionOfList {

	@SuppressWarnings("null")
	public static void main(String[] args) {
	List<Integer> lstItems = new ArrayList<>();;
	lstItems.add(500);
	lstItems.add(50);
	lstItems.add(5);
	lstItems.add(99);
	lstItems.add(100);
	lstItems.add(20);
	lstItems.add(35);
	lstItems.add(70);
	
	int targetItem=300;
	getIndexOfTargetItem(lstItems,targetItem);
	
	int targetItem1=99;
	getIndexOfTargetItem(lstItems,targetItem1);
	
	}

	private static void getIndexOfTargetItem(List<Integer> lstItems, int targetItem) {
		int resultPostion = -1;
		for (int i : lstItems) {
			resultPostion = (i == targetItem) ? lstItems.indexOf(i) : resultPostion;
		}
		if (resultPostion != -1) {
		System.out.println("\nThe traget Item : " + targetItem + " found at : " + resultPostion + "");
		} else {
		System.out.println("\nItem not found!..");	
		}
	}

}