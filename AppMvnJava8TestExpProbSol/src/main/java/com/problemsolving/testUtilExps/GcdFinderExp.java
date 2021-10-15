package com.problemsolving.testUtilExps;
import java.util.Scanner;

public class GcdFinderExp {
	
	public static void main(String[] args) {
		long num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the 1st No : ");
		num1=Long.parseLong(sc.nextLine());
		System.out.print("\nEnter the 2nd No : ");
		num2=Long.parseLong(sc.nextLine());
		System.out.println("\nGCD of Two Numbers : "+computeGcdOfTwoNumbers(num1, num2));
	}
	
	public static long computeGcdOfTwoNumbers(long a, long b) {
		if (b == 0) {
			return a;
		} else {
			return computeGcdOfTwoNumbers(a, a % b);
		}
	}

}
