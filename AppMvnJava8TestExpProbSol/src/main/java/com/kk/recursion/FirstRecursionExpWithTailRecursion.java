package com.kk.recursion;

public class FirstRecursionExpWithTailRecursion {
  public static void main(String[] args) {
	  computeReverseNaturalNumbers(20);
	System.out.println("\nN-th Fibonci Term : "+printNthFiboNaciNum(10));
	naturalOrderComputeSeries(30);
}
  
  static void computeReverseNaturalNumbers(long n)
  {
	 if(n==10)
	 {
		 System.out.println("\nNumbers Test If : "+n);
		 return;
	 }
	 System.out.println("\nNumbers  : "+n); 
	 //As this is the last function call without returning anything (Example of Tail Recursion)
	 computeReverseNaturalNumbers(n-1);
  }
  
  static void naturalOrderComputeSeries(long n)
  {
	 if(n==0)
	 {
		 System.out.println("\nNumbers - naturalOrderComputeSeries Test If : "+n);
		 return;
	 }
	 //As this is the last function call without returning anything (Example of Tail Recursion)
	 naturalOrderComputeSeries(n-1);
	 System.out.println("\nNumbers  : "+n); 
  }
  
 
	static long printNthFiboNaciNum(long n) {
		if (n < 2) {
			return n;
		}
		return printNthFiboNaciNum(n - 1) + printNthFiboNaciNum(n - 2);
	}
  
}
