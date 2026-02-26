package com.udemy.sdetintcod.section4;
import java.util.HashSet;
import java.util.Set;

public class CheckHashSetsEqualityStatus {

	public static void main(String[] args) {
	Set<String> strSet1 = new HashSet<>();
	Set<String> strSet2 = new HashSet<>();
	strSet1.add("Test");
	strSet2.add("Test");
	strSet1.add("Abhinay");
	strSet2.add("Abhinay");
	strSet1.add("KK");
	strSet2.add("KK");
	strSet1.add("CartLane");
	strSet2.add("CartLane");
	checkHashSetsEqualityStatus(strSet1,strSet2);
	
	strSet1.add("SDJD");
	strSet2.add("Test");
	strSet1.add("Abhi");
	strSet2.add("Abhinay");
	strSet1.add("KK");
	strSet1.add("KK");
	strSet2.add("KK");
	strSet1.add("QA");
	strSet2.add("CartLane");
	strSet2.add("SDET");
	strSet2.add("DevOps");
	strSet2.add("DevOps");
	checkHashSetsEqualityStatus(strSet1,strSet2);
	}

	private static void checkHashSetsEqualityStatus(Set<String> strSet1, Set<String> strSet2) {
		System.out.println("\nValue of Set 1 : "+strSet1);
		System.out.println("\nValue of Set 2 : "+strSet2);
		if (strSet1.equals(strSet2)) {
			System.out.println("\nBoth the hashSets are equal.");
		} else {
			System.out.println("\nBoth hashSets are Not-equal.");
		}
	}

}