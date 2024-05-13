package com.udemy.dsapart1.timecomplexity;
import java.util.Arrays;
import java.util.Scanner;

public class ConstantTimeComplexityExample {
	
	static Object inputArr[];
	
	public static void main(String[] args) {
	Scanner scInp=new Scanner(System.in);
	System.out.println("\nEnter the Number to Check : ");
	double fracInptNum=scInp.nextDouble();
	System.out.println("\nThe input Number is : "+checkNumberIsOddOrEven(fracInptNum));
	
	System.out.print("\nEnter the size of Array : ");
	int sizeOfArr = scInp.nextInt();
	inputArr = new Object[sizeOfArr];
	System.out.println("\nEnter the Array elements : ");
	pushElementsIntoArray(inputArr);
	System.out.println("\nInput Array : " + Arrays.toString(inputArr));
	System.out.print("\nEnter the target Index : ");
	int targetIndex = scInp.nextInt();
	System.out.println("\nCheck Null value exists into target index of Array : "+checkNullValueExists(inputArr,targetIndex));
	}

	
	/**
	 * 
	 * @param inputArr2
	 * @param targetIndex
	 * @return typeOfNumber - String
	 * Constant Time Complexity - O(1).
	 * 
	 */
	private static String checkNullValueExists(Object[] inputArr2, int targetIndex) {
	String strNullStatus;
	Object objVal=inputArr2[targetIndex-1];
	System.out.println("\nTarget value : "+inputArr2[targetIndex-1]);
	strNullStatus=(objVal.equals(null) || objVal.toString().equalsIgnoreCase("null"))?"Null Exists":"Null Not! Exists";
	return strNullStatus;
	}


	/**
	 * 
	 * @param fracInptNum
	 * @return typeOfNumber - String
	 * Constant Time Complexity - O(1).
	 * 
	 */
	private static String checkNumberIsOddOrEven(double fracInptNum) {
	String typeOfNumber="";
	typeOfNumber=(fracInptNum%2==0)?"Even":"Odd";
	return typeOfNumber;
	}

	
	public static void pushElementsIntoArray(Object inputArr[]) {
		Scanner scInp1Obj = new Scanner(System.in);
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("\nEnter the element No " + (i + 1) + " : ");
			inputArr[i] = (Object)scInp1Obj.nextLine();
		}
	}
}