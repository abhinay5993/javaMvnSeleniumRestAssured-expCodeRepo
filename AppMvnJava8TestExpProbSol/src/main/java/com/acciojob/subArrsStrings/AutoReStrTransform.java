package com.acciojob.subArrsStrings;
import java.util.Scanner;

public class AutoReStrTransform {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("\nEnter the String : ");
		String inpStr=scn.nextLine();
		System.out.println("\nOutput Str : "+printAutoReStrTransform(inpStr));
	}

	private static String printAutoReStrTransform(String inpStr) {
		String strArr[] = inpStr.split("-");
		StringBuilder sbObj = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			sbObj.append(strArr[i].charAt(0));
		}
		return sbObj.toString();
	}

}