package com.prog.edubridgeindia.collecFmwrks;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * Mini project
 * Switch Cases: 
 * Which Collection class you   want to use:
 * 1)	AL
 * 2)	LL
 * 3)	V
 * 4)	Stack
 * 5)	HashSet
 * 6) Priority Que
 * 7) ArrayDeque
 * 
 * Use another Switch after selection of COllection:
 * What operation you want to perform on HS: 
 * 1)	Add elements 
 * 2)	Remove elements
 * 3)	Display data
 * 4)	Sort data
 * 5)	Search element
 * 
 */

public class LinkedHashSetsExamplesTest {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Varchas");
		lhs.add("Satyam");
		lhs.add("Vishal");
		lhs.add("Arvaind");
		lhs.add("Satyam");
		lhs.remove("Varchas");

		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}