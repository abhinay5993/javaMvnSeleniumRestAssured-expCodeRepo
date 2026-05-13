package com.udemy.sdetintcod.section7;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FindMidElementOfLinkedList {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.println("\nEnter the Linked-list capacity : ");
		int lnkCapacity = scin.nextInt();
		int midElement=getMidElementOfLinkedList(lnkCapacity);
		System.out.println("\nValue of Middle Element : "+midElement);
		scin.close();
	}

	private static int getMidElementOfLinkedList(int lnkCapacity) {
	Scanner scin = new Scanner(System.in);
	List<Integer> list = new LinkedList<>();
	System.out.println("\nEnter the linked-List items : ");
	for (int i = 0; i < lnkCapacity; i++) {
		int numDt = scin.nextInt();
		list.add(numDt);
	}
	System.out.println("\nData Items of Linked-List : " + list);
	int midIndex=(list.size()/2);
	System.out.println("\nEvaluated mid index position : "+midIndex);
	scin.close();
	return list.get(midIndex);
	}

}