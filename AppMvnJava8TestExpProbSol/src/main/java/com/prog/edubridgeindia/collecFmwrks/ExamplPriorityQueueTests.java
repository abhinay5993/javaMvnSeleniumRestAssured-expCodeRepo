package com.prog.edubridgeindia.collecFmwrks;
import java.util.Iterator;
import java.util.PriorityQueue;

/*
 * Follows - LIFO
 */

public class ExamplPriorityQueueTests {

	public static void main(String[] args) {
		PriorityQueue<String> ts = new PriorityQueue<String>();
		ts.add("Apple");
		ts.add("Banana");
		ts.add("XYZ");
		ts.add("Chikoo");
		ts.add("Apple");
		System.out.println("\nUse of poll() from PriorityQueue : " + ts.poll());
		Iterator<String> itr = ts.iterator();
		System.out.println("----------------");
		while (itr.hasNext()) {
			System.out.println("\nQue Items : " + itr.next());
		}
	}

}