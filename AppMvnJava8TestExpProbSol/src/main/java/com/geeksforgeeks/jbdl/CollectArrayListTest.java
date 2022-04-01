package com.geeksforgeeks.jbdl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectArrayListTest {
	public static void main(String[] args) {
		
		List<String> listItems = new ArrayList<>();
		listItems.add("a");
		listItems.add("b");

		Iterator<String> iterRef = listItems.iterator();
		while (iterRef.hasNext()) {
			System.err.println(iterRef.next());
			listItems.add("c");
		}
	}
}
