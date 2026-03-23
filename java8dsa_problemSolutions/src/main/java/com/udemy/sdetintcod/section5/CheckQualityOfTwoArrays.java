package com.udemy.sdetintcod.section5;
import java.util.Arrays;

public class CheckQualityOfTwoArrays {

	public static void main(String[] args) {
	int[] arrayA={1, 2, 3, 4, 5};
	int[] arrayB={1, 2, 3, 4, 5};
	System.out.println("\nCheck Quality status : "+getQualityStatusOfArrayElements(arrayA,arrayB));
	
	int c[] = { 10, 20, 30 };
    int d[] = { 45, 50, 55, 60, 65 };
    
	System.out.println("\nCheck Quality status : "+getQualityStatusOfArrayElements(c,d));
	System.out.println("************* Evaluation using Arrays in-build methdo ******************");
	boolean flagVal=Arrays.equals(arrayA, arrayB);
	String statusFld=(flagVal==true)?"Equals.":"Not-Equals.";
	System.out.println("\nCheck Quality status using in-built method : "+statusFld);
	
	boolean flag1Val=Arrays.equals(c, d);
	String status1Fld=(flag1Val==true)?"Equals.":"Not-Equals.";
	System.out.println("\nCheck Quality status using in-built method : "+status1Fld);
	}

	private static String getQualityStatusOfArrayElements(int[] arrayA, int[] arrayB) {
		System.out.println("\nInput array A : "+Arrays.toString(arrayA));
		System.out.println("\nInput array B : "+Arrays.toString(arrayB));
		String strResult = "Equals";
		if (arrayA.length == arrayB.length) {
			for (int i = 0; i < arrayA.length; i++) {
				for (int j = 0; j < arrayB.length; j++) {
					if (arrayA[i] != arrayB[i]) {
						strResult = "Not Equals.";
					}
				}
			}
		} else {
			strResult = "Not Equals.";
		}
		return strResult;
	}

}