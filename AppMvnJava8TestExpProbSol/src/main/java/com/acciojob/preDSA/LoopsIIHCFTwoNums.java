package com.acciojob.preDSA;

import java.util.Scanner;

public class LoopsIIHCFTwoNums {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num1=sc.nextLong();
		long num2=sc.nextLong();
		System.out.println(hcfOfTwoNumbers(num1, num2));
	}
	
	public static long hcfOfTwoNumbers(long num1, long num2) {
		long hcf = 0;
		long minNum = (num1 < num2) ? num1 : num2;
		
		for (long i = minNum; i >= 1; i--) {
			
			if (num1 % i == 0 && num2 % i == 0) {
				hcf = i;
				break;
			}
			
		}
		return hcf;
	}

}