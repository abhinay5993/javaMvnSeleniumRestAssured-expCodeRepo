package com.udemy.dsapart1.linkedLists;
import java.util.LinkedList;

public class DoublyLinkedListMethodsExample {

	public static void main(String[] args) {
	LinkedList<String> linkListDt = new LinkedList<>();
	System.out.println("\nStrings item-1 added to List : "+linkListDt.add("Rahul"));
	System.out.println("\nStrings item-2 added to List : "+linkListDt.add("hello"));
	System.out.println("\nStrings item-3 added to List : "+linkListDt.add("hello"));
	linkListDt.addLast("thisLastOne");
	linkListDt.addFirst("FirstNode");
	linkListDt.addFirst("3rdNode");
	linkListDt.add(2, "Middle");
	System.out.println("\nIs LinkList contains string 'hello' data : "+linkListDt.contains("hello"));
	System.out.println("\nLatest updated input LinkList : "+linkListDt);
	System.out.println("\nFirst Item removed from LinkList : "+linkListDt.removeFirst());
	System.out.println("\n2nd Item removed from LinkList : "+linkListDt.removeLast());
	System.out.println("\nItem removed from LinkList by its index: "+linkListDt.remove(2));
	System.out.println("\nUpdated final linkList : "+linkListDt);
	}

}