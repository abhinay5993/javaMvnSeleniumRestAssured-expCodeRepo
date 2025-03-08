package com.amodleetcodesol.arrays;

public class ValidateTwoStringArraysAreEquivalent {

	public static boolean stringArraysAreEqual(String[] word1, String[] word2) {
		StringBuilder strBld1 = new StringBuilder();
		StringBuilder strBld2 = new StringBuilder();

		for (String strwd1 : word1) {
			strBld1.append(strwd1);
		}

		for (String strwd2 : word2) {
			strBld2.append(strwd2);
		}
		return strBld1.toString().equals(strBld2.toString());
	}

	public static void main(String[] args) {
		System.out.println("\nString arrays set1 equality status : "+stringArraysAreEqual(new String[]{"ab","c"}, new String[]{"a","bc"}));
		System.out.println("\nString arrays set2 equality status : "+stringArraysAreEqual(new String[]{"x","df"}, new String[]{"rr","oc"}));
	}

}