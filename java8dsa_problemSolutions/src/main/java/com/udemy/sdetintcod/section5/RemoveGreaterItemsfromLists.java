package com.udemy.sdetintcod.section5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveGreaterItemsfromLists {

	public static void main(String[] args) {
	List<Integer> inpLstItems=new ArrayList<>();
	inpLstItems.add(50);
	inpLstItems.add(90);
	inpLstItems.add(120);
	inpLstItems.add(20);
	inpLstItems.add(6);
	inpLstItems.add(12);
	inpLstItems.add(2);
	inpLstItems.add(183);
	inpLstItems.add(400);
	inpLstItems.add(29);
	System.out.println("\nInput List : "+inpLstItems);
	int targetLimit=10;
	System.out.println("\nSet the limit value : "+targetLimit);
	removeGreaterValuesOfList(inpLstItems,targetLimit);
	System.out.println("\nUpdated List post in-memory operations : "+inpLstItems);
	}

	private static void removeGreaterValuesOfList(List<Integer> inpLstItems, int targetLimit) {
		Iterator<Integer> lstItr = inpLstItems.iterator();
		while (lstItr.hasNext()) {
			int currentItem = lstItr.next();
			if (currentItem > targetLimit) {
				lstItr.remove();
			}
		}
	}

}