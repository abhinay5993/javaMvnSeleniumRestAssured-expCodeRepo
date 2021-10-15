package com.problemsolving.testUtilExps;
import java.util.Scanner;

import sun.reflect.generics.tree.Tree;

public class GuviUniqeCharFinder {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the input String : ");
		String inpData=sc.nextLine();
		System.out.println("\nInputed String : "+inpData);
		System.out.println("\nValidate the Charecters of Strings are Unique : "+isStrCharsUnique(inpData));

	}


	public static boolean isStrCharsUnique(String inpData) {
		boolean isDistinctChar = false;
		if (inpData.length() > 280) {
			isDistinctChar = false;
		}

		boolean[] boolArr = new boolean[128];
		for (int outer = 0; outer < inpData.length(); outer++) {
			int asciVal = inpData.charAt(outer);
			System.out.println(asciVal + "----->" + inpData.charAt(outer));
			System.out.println("\nValue of --> booleanArr[] " + boolArr[asciVal]);
			
			if (boolArr[asciVal]) {
				isDistinctChar = false;
			} else {
				boolArr[asciVal] = true;
				isDistinctChar = true;
			}
		}
		return isDistinctChar;
	}

}