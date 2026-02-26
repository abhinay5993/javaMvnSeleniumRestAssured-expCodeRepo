package com.udemy.sdetintcod.section4;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortAndKeepUniques {

	public static void main(String[] args) {
		double[] numericArray={0.49,-4.009,55,33,4,0,7,33,5,2,1,4,10,30,10};
		System.out.println("\nInput number array : "+Arrays.toString(numericArray));
		System.out.println("\nResultant Sorted Array : "+Arrays.toString(numericArrayItems(numericArray)));
	}

	
	/**
	 * Using TreeSet inbuilt sorted property
	 * 
	 * @param strWeekArray
	 * @return
	 */
	private static Double[] numericArrayItems(double[] numArray) {
		Set<Double> sortedSet = new TreeSet<>();
		for (Double strItems : numArray) {
			sortedSet.add(strItems);
		}
		return sortedSet.toArray(new Double[0]);
	}
	
}