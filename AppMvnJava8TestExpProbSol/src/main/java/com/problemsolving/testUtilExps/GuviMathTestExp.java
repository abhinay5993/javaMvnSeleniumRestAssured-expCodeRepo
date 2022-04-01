package com.problemsolving.testUtilExps;
import java.util.Scanner;
import mathameticsPack.PerfromMathUtils;

public class GuviMathTestExp {
	
	public static void main(String[] args) {
		double num1;
		int num2;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the 1st No : ");
		num1=sc.nextDouble();
		System.out.print("\nEnter the 2nd No : ");
		num2=sc.nextInt();
		
		PerfromMathUtils mathObj=new PerfromMathUtils();
		mathObj.calcLOGBy10Base(num1);
		mathObj.calcPowerByBase(num1, num2);
		mathObj.calcSqurtByNumber(num1);
	}

}
