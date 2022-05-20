package com.kk.recursion;

public class FirstRecursionExpWithTailRecursion {
  public static void main(String[] args) {
	computeNaturalNumbers(1);
	System.out.println("\nN-th Fibonci Term : "+printNthFiboNaciNum(50));
}
  
  static void computeNaturalNumbers(long n)
  {
	 if(n==10)
	 {
		 System.out.println("\nNumbers  : "+n);
		 return;
	 }
	 System.out.println("\nNumbers  : "+n); 
	 //As this is the last function call without returning anything (Example of Tail Recursion)
	 computeNaturalNumbers(n+1);
  }
  
	static long printNthFiboNaciNum(long n) {
		if (n < 2) {
			return n;
		}
		return printNthFiboNaciNum(n - 1) + printNthFiboNaciNum(n - 2);
	}
  
}
