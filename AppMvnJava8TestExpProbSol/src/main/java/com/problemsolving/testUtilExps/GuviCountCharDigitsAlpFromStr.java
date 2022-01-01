package com.problemsolving.testUtilExps;
import java.util.Scanner;

public class GuviCountCharDigitsAlpFromStr {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter The input String : ");
		String inpStrData=sc.nextLine();
		System.out.println("\nEntered String Data :  "+inpStrData+" \n");
		extractCountOfCharDigitsAndAlphanumericData(inpStrData);
	}
	
	public static void extractCountOfCharDigitsAndAlphanumericData(String inpData) {
	int numOfChars=0,numOfDigits=0,numOfVow=0,numOfSpace=0,speChar=0;
	String tempNumOfChars="";
	String tempNumOfDigits="";
	String tempNumOfVow="";
	String tempNumOfSpace="";
	String tempSpeChar="";
	
	for(int i=0;i<inpData.length();i++)
	{
	char ch=inpData.charAt(i);
	if(ch=='a' || ch=='A' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='e' || ch=='E' || ch=='u' || ch=='U')
	{
		tempNumOfVow=tempNumOfVow+inpData.charAt(i);
		numOfVow++;
	}
	else if ((ch >='a' && ch<='z') || (ch >='A' && ch<='Z'))
	{
	tempNumOfChars=tempNumOfChars+inpData.charAt(i);
	numOfChars++;
	}
	else if(ch>='0' && ch<='9')
	{
	tempNumOfDigits=tempNumOfDigits+inpData.charAt(i);
	numOfDigits++;
	}
	else if(Character.isSpace(ch))
	{
		tempNumOfSpace=tempNumOfSpace+inpData.charAt(i);
		numOfSpace++;
	}
	else{
	tempSpeChar=tempSpeChar+tempNumOfSpace+inpData.charAt(i);
	speChar++;
	}
	}

	System.out.println("\nNumber Of "+tempNumOfDigits+" Digits : "+numOfDigits);
	System.out.println("\nNumber Of "+tempNumOfChars+" Charecters : "+numOfChars);
	System.out.println("\nNumber Of Alphanumeric Charecters : "+numOfDigits+numOfChars);
	System.out.println("\nNumber Of "+tempNumOfVow+" Vaowel Charecters : "+numOfVow);
	System.out.println("\nNumber Of Spaces "+tempNumOfSpace+" Charecters : "+numOfSpace);
	System.out.println("\nNumber Of Special "+tempSpeChar+" Charecters : "+speChar);
	
	}
}
