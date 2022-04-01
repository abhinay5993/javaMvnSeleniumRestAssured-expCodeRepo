package com.geeksforgeeks.jbdl;
import java.util.Arrays;

public class ArraysExpsTest {
	public static void main(String[] args) {
		
		int inpArray[] = new int[5];
		for (int i = 5; i > 0; i--) {
			inpArray[5 - i] = i;
		}
		Arrays.fill(inpArray, 1, 4, 8);
		for (int i = 0; i < 5; i++) {
			System.err.print(inpArray[i]);
		}
	}
}