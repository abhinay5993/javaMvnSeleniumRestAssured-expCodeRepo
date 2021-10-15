package com.guvi.Java8BeginnMod;

@FunctionalInterface // only Single abstract Method (SAM) Interface is '@FunctionalInterface'
public interface FuncTestInter {

	double piVal = 3.141;

	// Java-8 static methode imp
	double areaOfSqu(double x);


	// Java-8 default methode imp
	default double cirPeri(double r) {
		System.out.println("\nFuncTestInter --> cirPeri(double r) meth");
		return 2 * piVal * r;
	}

	// Java-8 static methode imp
	static double areaOfCircByRedious(double x) {
		System.out.println("\nFuncTestInter --> areaOfCircByRedious(double x) meth");
		return piVal * x * x;
	}

}