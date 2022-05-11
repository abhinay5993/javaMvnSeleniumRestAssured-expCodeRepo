package com.guvi.dsalgo;

public class SimpleHashLookUpFrequency {

	public static void main(String[] args) {
		int[] objArray = { 2, 1, 6, 7, 6, 4, 3, 5, 2, 6 };
		frequencyHashCounter(objArray);
	}

	public static void frequencyHashCounter(int[] inpObj) {
		int hashTab[] = new int[inpObj.length];

		for (int i = 0; i < hashTab.length; i++) {
			hashTab[inpObj[i]] = hashTab[inpObj[i]] + 1;
		}

		for (int i = 0; i < inpObj.length; i++) {
			if (hashTab[i] != 0)
			{
				System.out.println("\n Index " + i + " value of hash frequency : " + hashTab[i]);
			}
		}
	}

}