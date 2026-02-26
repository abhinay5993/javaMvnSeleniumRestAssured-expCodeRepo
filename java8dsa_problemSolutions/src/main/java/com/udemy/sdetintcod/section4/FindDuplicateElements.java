package com.udemy.sdetintcod.section4;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicateElements {

	public static void main(String[] args) {
		int[] numArray = {5,6,0,3,3,1,10,20,15,22,3,55,20,6,7,10};
		System.out.println("\nInput array : " + Arrays.toString(numArray));
		System.out.println("\n********* Duplicate Array elements ***********");
		getDuplicateArrayElements(numArray);
	}

	private static void getDuplicateArrayElements(int[] numArray) {
		Arrays.sort(numArray);
		Set<Integer> numHash = new TreeSet<>();
		for (int numItems : numArray) {
			if (numHash.contains(numItems)) {
				numHash.add(numItems);
				System.out.print(""+numItems+", ");
			} else {
				numHash.add(numItems);
			}
		}
		System.out.println("\nTest data : "+numHash);
	}
	
}