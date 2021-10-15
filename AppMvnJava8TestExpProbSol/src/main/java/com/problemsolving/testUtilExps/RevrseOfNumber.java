package com.problemsolving.testUtilExps;
import java.util.Scanner;

public class RevrseOfNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the Number : ");
		long num=Long.parseLong(sc.nextLine());
		System.out.println("\nInputed Number : "+num);
		System.out.println("\nReverse Value of the Number : "+getRevNum(num));
		System.out.println("\nReverse Value of the Number using getNumericReverse() methode : "+getNumericReverse(num));
	}
	
	public static String getRevNum(long num)
	{
		String rev="";
		String strValOfNum=String.valueOf(num);
		for(int i=strValOfNum.length()-1;i>=0;i--)
		{
			rev=rev+strValOfNum.charAt(i);
		}
		return rev;
	}
	
	public static long getNumericReverse(long num) {
		long rev = 0, reminder;
		while (num != 0) {
			reminder = (num % 10);
			rev = rev * 10 + reminder;
			num = num / 10;
		}
		return rev;
	}

}