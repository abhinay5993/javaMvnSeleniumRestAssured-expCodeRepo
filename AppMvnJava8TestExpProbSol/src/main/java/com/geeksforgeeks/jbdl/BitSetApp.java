package com.geeksforgeeks.jbdl;
import java.util.BitSet;

public class BitSetApp {
	public static void main(String[] args) {

		BitSet xObj = new BitSet(5);

		for (int i = 0; i < 5; ++i) {
			xObj.set(i);
		}
		
		xObj.clear(2);
		System.err.println("\nObject Data : " + xObj);
	}
}