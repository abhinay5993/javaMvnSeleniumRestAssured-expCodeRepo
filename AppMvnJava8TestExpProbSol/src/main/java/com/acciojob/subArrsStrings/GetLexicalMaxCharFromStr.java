package com.acciojob.subArrsStrings;
import java.util.Scanner;

public class GetLexicalMaxCharFromStr {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("\nEnter the String : ");
		String inpStr=scn.nextLine();
		getLexicalMaxCharOccuranceCount(inpStr.toLowerCase().replaceAll(" ",""));
	}

	private static void getLexicalMaxCharOccuranceCount(String inpStr) {
		int freqArr[]=new int[26];
		for(int i=0;i<inpStr.length();i++)
		{
			char ch=inpStr.charAt(i);
			int indexLoc=ch-'a';
			freqArr[indexLoc]++;
		}
		int maxItem=Integer.MIN_VALUE;
		char maxCharItem='a';
		for(int i=0;i<26;i++)
		{
			if(freqArr[i]>maxItem)
			{
				maxItem=freqArr[i];
				maxCharItem=(char) ('a'+i);
			}
		}
		System.out.println("\nMaximum char : '"+maxCharItem+"' with occurance count : "+maxItem);
	}

}