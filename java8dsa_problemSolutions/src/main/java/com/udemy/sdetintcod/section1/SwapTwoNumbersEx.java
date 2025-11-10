package com.udemy.sdetintcod.section1;
import java.util.Scanner;

public class SwapTwoNumbersEx {

	public static void main(String[] args) {
		Scanner scInput = new Scanner(System.in);
		System.out.print("\nEnter the 1st Number : ");
		double inpNumX = scInput.nextDouble();
		System.out.print("\nEnter the 2nd Number : ");
		double inpNumY = scInput.nextDouble();
		doSwappingByAddSubstract(inpNumX,inpNumY);
		scInput.close();
	}

	private static void doSwappingByAddSubstract(double inpNumX, double inpNumY) {
	System.out.println("\nOriginal Value of X = "+inpNumX+" , Y = "+inpNumY+" ");
	inpNumX=inpNumX+inpNumY;
	inpNumY=inpNumX-inpNumY;
	inpNumX=inpNumX-inpNumY;
	System.out.println("\nSwapped Value of X = "+inpNumX+" , Y = "+inpNumY+" ");
	}

}