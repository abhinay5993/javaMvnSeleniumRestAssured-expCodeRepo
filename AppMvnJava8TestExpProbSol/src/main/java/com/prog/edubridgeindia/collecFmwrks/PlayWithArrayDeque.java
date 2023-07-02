package com.prog.edubridgeindia.collecFmwrks;
import java.util.ArrayDeque;
import java.util.Deque;


/*
 * Follows - LIFO & FIFO
 * 
 */

public class PlayWithArrayDeque {

	public static void main(String[] args) {

		Deque<String> emplist = new ArrayDeque<String>();
		emplist.add("Varchas");
		emplist.addLast("Vishal");
		emplist.add("Bhushan");
		emplist.add("Akash");
		System.out.println(emplist.peekLast());
		System.out.println("---------------------------");
		for (String el : emplist) {
			System.out.println(el);

		}
	}

}