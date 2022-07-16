package com.dsa.hershalGoogleSdet;
import java.util.Arrays;

public class SortTestDriverExp {

	public static void main(String[] args) {
		
		double[] inpDataArray= {66,-4,30,777,52,-0.555};
		System.out.println("\nInput array before quick sorting : "+Arrays.toString(inpDataArray));
		//calling sorting algo to sort data
		new SortingAlgorithmsExp().quickSorting(inpDataArray);
		System.out.println("\nInput array After quick sorting : "+Arrays.toString(inpDataArray));
	}
	
}