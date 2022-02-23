package com.problemsolving.testUtilExps;

public class GuviStrCompareWithoutCmp {
	
	public static void main(String[] args) {
		String x1="caratlane";
		String x2="Fshdhakss";
		System.out.println("\nString compare status : "+compStrWithoutCompareFunc(x1, x2));
	}
	
	public static int compStrWithoutCompareFunc(String s1, String s2) {
		int status = ' ';
		String compareStatus = "NA";
		try {
			if (s1.length() == s2.length()) {
				for (int i = 0; i < s1.length(); i++) {
					if (s1.charAt(i) == s2.charAt(i)) {
						status = 0;
						compareStatus = "both are same";
					}
					else if (s1.charAt(i) > s2.charAt(i)) {
						status = 1;
						compareStatus = "s1=" + s1 + " > s2=" + s2 + " ";
					}
					else{
						status = -1;
						compareStatus = "s1=" + s1 + " < s2=" + s2 + " ";
					}
				}
				System.out.println("\nComparsion status : " + compareStatus);
			} else {
				System.out.println("\nInvalid!! due to length miss match");
			}
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		return status;
	}

}