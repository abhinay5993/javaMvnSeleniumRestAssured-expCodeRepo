package com.problemsolving.testUtilExps;

import java.util.Scanner;

public class GenarateJSONResponse {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter String : ");
		String strInpData=sc.nextLine();
		System.out.print("\nEnter how many charecters you want to extract from first : ");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("\nEntered Input String : "+strInpData);
		extractSubStrings(strInpData, num);
	}

	public static void extractSubStrings(String data,int lastPos)
	{
		String extData=data.substring(0, lastPos);
		System.out.println("\nfetched first "+lastPos+" characters of the string : "+extData);
	}
}
