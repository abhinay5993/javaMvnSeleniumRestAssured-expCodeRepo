package com.udemy.sdetintcod.section7;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListsBothEndOperations {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.println("\nEnter the Linked-list capacity : ");
		int lnkCapacity = scin.nextInt();
		doLinkedListBothEndsOperations(lnkCapacity);
		scin.close();
	}

	private static void doLinkedListBothEndsOperations(int lnkCapacity) {
		Scanner scin = new Scanner(System.in);
		List<String> list = new LinkedList<>();
		System.out.println("\nEnter the linked-List items : ");
		for (int i = 0; i < lnkCapacity; i++) {
			String strDataItem = scin.nextLine();
			list.add(strDataItem);
		}
		System.out.println("\nData Items of Linked-List : " + list);
		System.out.print("Add Element to the first : ");
		String strFirstEle = scin.nextLine();
		list.addFirst(strFirstEle);
		System.out.print("Add Element to the last : ");
		String strEndEle = scin.nextLine();
		list.addLast(strEndEle);
		System.out.println("\nLatest data items of Linked-List : " + list);
		scin.close();
	}

}