package com.problemsolving.testUtilExps;

public class OverFlowUnderFlowExp {
	
	public static void main(String[] args) {
		
		int maxVal=Integer.MAX_VALUE;
		int minVal=Integer.MIN_VALUE;
		System.out.println("\nInteger Min Val : "+minVal);
		System.out.println("\nInteger Max Val : "+maxVal);
		
		if(minVal-1==maxVal)
		{
		System.out.println("\nInteger Value OverFlowed");	
		}
		else
		{
			System.out.println("\nInteger Value UnderFlowed");
		}
	}

}