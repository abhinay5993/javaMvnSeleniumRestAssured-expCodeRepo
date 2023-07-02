package com.prog.edubridgeindia.collecFmwrks;
import java.util.Iterator;
import java.util.TreeSet;

public class SortedTreeSetsExps {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Orange");
		ts.add("Banana");
		ts.add("Apple");
		ts.add("Chikoo");
		ts.add("Apple");
		System.out.println("\nUse of Lower       : "+ts.lower("Banana"));
		System.out.println("\nUse of pollFirst() : "+ts.pollFirst());
		
		System.out.println("\n-----------------Iterated Data -------------------");
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
