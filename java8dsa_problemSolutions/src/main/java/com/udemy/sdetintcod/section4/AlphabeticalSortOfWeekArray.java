package com.udemy.sdetintcod.section4;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * Part of TCS interview - 07-02-2026
 * 
 */
public class AlphabeticalSortOfWeekArray {

	public static void main(String[] args) {
	String[] strWeekArray={"sun","mon","tue","wed","thu","fri","sat"};
	System.out.println("\nInput string array : "+Arrays.toString(strWeekArray));
	System.out.println("\nResultant Sorted Array : "+Arrays.toString(alphaSortedArrayItems(strWeekArray)));
	System.out.println("*****************************************************************");
	
	String[] studNames= {"Atif","Chuhan","KK","Aslam","Farhan","Zaved","Bilal","Faisal","Noor","Lata","Mika","Sonu"};
	performBubbleSortOnTextArray(studNames);
	
	}

	
	/**
	 * Using TreeSet inbuilt sorted property
	 * 
	 * @param strWeekArray
	 * @return
	 */
	private static String[] alphaSortedArrayItems(String[] strWeekArray) {
		Set<String> sortedSet = new TreeSet<>();
		for (String strItems : strWeekArray) {
			sortedSet.add(strItems);
		}
		return sortedSet.toArray(new String[0]);
	}
	
	
	/**
	 * Do bubble sort on Text array
	 * 
	 * @param strNamesArr
	 * 
	 */
	private static void performBubbleSortOnTextArray(String[] strNamesArr) {
		int arrayLen = strNamesArr.length - 1;

		for (int i = 0; i < arrayLen; i++) {
			for (int j = 0; j < arrayLen - i; j++) {
				if (strNamesArr[j].compareTo(strNamesArr[j + 1]) > 0) {
					String strTemp = strNamesArr[j];
					strNamesArr[j] = strNamesArr[j + 1];
					strNamesArr[j + 1] = strTemp;
				}
			}
		}

		System.out.println("\n********* Sorted Names *********************");
		for (String strNameItems : strNamesArr) {
			System.out.print(strNameItems + ", ");
		}
	}
	

}