package com.problemsolving.testUtilExps;
import java.util.Scanner;

public class GuviLCMCalculatorExp {
	
	public static void main(String[] args) {
		long n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the First No : ");
		n1=sc.nextLong();
		System.out.print("\nEnter the 2nd No : ");
		n2=sc.nextLong();
		System.out.println("\nLCM of "+n1+" and "+n2+" is : "+computeLCMbyLongInput(n1, n2));
	}
	
	public static long computeLCMbyLongInput(long x1, long x2) {
		long hcf = 1, lcm;
		for (int i = 1; i <= x1; i++) {
			if (x1 % i == 0 && x2 % i == 0) {
				hcf = i;
			}
		}
		lcm = ((x1 * x2) / hcf);

		return lcm;
	}

}