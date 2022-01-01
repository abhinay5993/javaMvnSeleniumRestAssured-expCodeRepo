package com.problemsolving.testUtilExps;

public class HeritageSumOfSeries {
	
	public static void main(String[] args) {
		long nThterms=10;
		sumOfSeriesForNthTerms(nThterms);
	}

	public static void sumOfSeriesForNthTerms(long nThterms)
	{
		long fact=1;
		double sum=0;
		for(int i=1;i<=nThterms;i++)
		{
	     sum=(sum+(i+1)/fact*2*(i-1));
	     System.out.println(i+"<------>"+sum);
		}
		System.out.println("\nSum of Series for "+nThterms+"-th Terms : "+sum);
	}
}