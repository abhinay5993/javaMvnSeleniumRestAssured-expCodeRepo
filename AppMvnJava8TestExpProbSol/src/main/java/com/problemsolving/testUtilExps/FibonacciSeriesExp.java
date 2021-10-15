package com.problemsolving.testUtilExps;

import java.util.Scanner;

public class FibonacciSeriesExp {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the Number of Terms : ");
		long num=Long.parseLong(sc.nextLine());
		System.out.println("\nNumber of terms into Fibonacci Series : "+num);
		System.out.println("\nRequired Series as follows : ");
		genarateFibonacciSeries(num);
	}
	
	public static void genarateFibonacciSeries(long nt)
	{
		long t1=0,t2=1,sumT3=0;
		System.out.print(t1+" ");
		System.out.print(t2+" ");
		for(int i=0;i<nt;i++)
		{
	    sumT3=t1+t2;
		System.out.print(sumT3+" ");
		t1=t2;
		t2=sumT3;
		}
	}

}