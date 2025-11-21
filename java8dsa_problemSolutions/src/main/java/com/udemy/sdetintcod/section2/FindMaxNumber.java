package com.udemy.sdetintcod.section2;
import java.util.Scanner;

public class FindMaxNumber {

	public static void main(String[] args) {
	Scanner scnsInp = new Scanner(System.in);
	System.out.println("\nEnter the 1st number : ");
	double num1 = scnsInp.nextDouble();
	System.out.println("\nEnter the 2nd number : ");
	double num2 = scnsInp.nextDouble();
	System.out.println("\nEnter the 3rd number : ");
	double num3 = scnsInp.nextDouble();
	System.out.println("\nThe Maximum among three number ( "+num1+" ,"+num2+" ,"+num3+" ) is : "+getMaxNumber(num1,num2,num3));
	scnsInp.close();
	}

	private static double getMaxNumber(double num1, double num2, double num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num1 && num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}

}