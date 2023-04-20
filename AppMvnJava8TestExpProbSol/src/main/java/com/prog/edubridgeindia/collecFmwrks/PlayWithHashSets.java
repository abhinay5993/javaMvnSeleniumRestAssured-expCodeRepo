package com.prog.edubridgeindia.collecFmwrks;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PlayWithHashSets {

	public static void main(String[] args) {
		Integer[] A = { 10, 20, 30, 40, 50, 60, 70 };
		Integer[] B = { 20, 25, 30, 35, 40, 45, 50, 55 };
		
		Set<Integer> setA = new HashSet<Integer>();
		setA.addAll(Arrays.asList(A));
		System.out.println("\nSet A data : "+setA);
		
		Set<Integer> setB = new HashSet<Integer>();
		setB.addAll(Arrays.asList(B));
		System.out.println("\nSet B data : "+setB);
		
		Set<Integer> setU = new HashSet<Integer>(setA);
		setU.addAll(setB);// union
		System.out.println("\nValue of Set After Union of A & B : "+setU);
		
		Set<Integer> setI = new HashSet<Integer>(setA);
		setI.retainAll(setB);// 10,20,30,40,50,60,70
		System.out.println("\nValue of Set After Intersection of A & B : "+setI);
		
		Set<Integer> setD = new HashSet<Integer>(setA);
		setD.removeAll(setB);
		System.out.println("\nValue of Set After Set Difference of A & B : "+setD);

	}

}
