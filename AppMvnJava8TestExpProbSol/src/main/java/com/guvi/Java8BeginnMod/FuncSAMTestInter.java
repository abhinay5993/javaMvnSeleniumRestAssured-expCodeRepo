package com.guvi.Java8BeginnMod;

@FunctionalInterface // only Single abstract Method (SAM) Interface is '@FunctionalInterface'
public interface FuncSAMTestInter extends FuncTestInter {
	
	String myOS();

	default // Java-8 static methode imp
	double areaOfSqu(double x)
	{
		System.out.println("\nFuncSAMTestInter --> areaOfCircByRedious(double x) meth");
		return x*x;
	}


	// Java-8 default methode imp
	default double cirPeri(double r) {
		System.out.println("\nFuncSAMTestInter --> cirPeri(double r) meth");
		return 2 * piVal * r;
	}


}