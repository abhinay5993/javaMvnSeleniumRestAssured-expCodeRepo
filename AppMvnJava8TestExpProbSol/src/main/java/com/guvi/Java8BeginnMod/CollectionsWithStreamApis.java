package com.guvi.Java8BeginnMod;
import java.util.Arrays;
import java.util.List;

/*
 * 
 * filter()  --> use input argument as Predicate (which helps to take dicision on condition True/False)
 * map()     --> use input argument as Function (which helps to map or perform some operation)
 * stream()  --> Returns an Stream Interface which helps to process data
 * forEach() --> Helps to print data by taking an argument of Consumer Interface (i.e lambda expression.)
 * 
 */

public class CollectionsWithStreamApis {

	public static void main(String[] args) {
		List<Integer> lstInts = Arrays.asList(4, 54, 45, 99, 40, 34, 6, 3, 74, 22);
		System.out.println("\nInput data : " + lstInts);

		// Apply stream() on collection:
		// If we have to perform different operation the we need create object of
		// multiple stream() --> Interface object
		lstInts.stream().sorted() // sort data
				.map(x -> x * x) // map() helps to Transform / map stream data using some function.
				.forEach(n -> System.out.println("\nSquared Data : " + n));

		// Just print Even Numbers in Sorted order
		lstInts.stream().sorted().
		         filter(n -> n % 2 == 0) // filter() use to filter data using some predicate conditionals
				.forEach(x -> System.err.println("\nOnly Even Numbers : " + x));

	}

}