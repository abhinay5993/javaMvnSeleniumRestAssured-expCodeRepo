package com.acciojob.subArrsStrings;
import java.util.Scanner;

// n*(n+1)/2 possible combination of SubString from Given input String.
public class GetPossibleSubString {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("\nEnter the String : ");
	String inpStr=scn.nextLine();
	System.out.println("\nPossible output Sub-Strings : ");
	printAllSubstrings(inpStr);
	}

	private static void printAllSubstrings(String inpStr) {
		for(int i=0;i<inpStr.length();i++)
		{
			for(int j=i+1;j<=inpStr.length();j++)
			{
			System.out.println(inpStr.substring(i,j));
			}
		}
	}

}