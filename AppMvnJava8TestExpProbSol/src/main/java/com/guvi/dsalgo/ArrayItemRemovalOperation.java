package com.guvi.dsalgo;
import java.util.Arrays;

public class ArrayItemRemovalOperation {
	public static void main(String[] args) {
		Object[] testData= {"app",2.34,-45.44,"QA","SDET"};
		System.out.println("\nExisting data : "+Arrays.asList(testData));
		System.out.println("\nExisting data : "+Arrays.asList(removeItemForArrayByIndex(testData,2)));
	}

	public static Object[] removeItemForArrayByIndex(Object[] inpData,int indexPos) {
		Object[] copy = new Object[inpData.length - 1];

		for (int i = 0, j = 0; i <inpData.length; i++) {
		    if (i != indexPos) {
		        copy[j++] = inpData[i];
		    }
		}
		return copy;
	}

}