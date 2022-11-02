package com.acciojob.preDSA;
import java.util.Scanner;

public class LoopsIHCFtwoLCMNums {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num1=sc.nextLong();
		long num2=sc.nextLong();
		System.out.println("\nHCF of two Numbers : "+hcfOfTwoNumbers(num1, num2));
		System.out.println("\nLCM of two Numbers : "+getTwoNumbersLCM(num1, num2));
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
	
	
	public static long getTwoNumbersLCM(long num1, long num2) {
		long lcm = 0;
		long maxNum = Math.max(num1, num2);

		for (long i = maxNum; i <= num1 * num2; i = i + maxNum) {
			if (i % num1 == 0 && i % num2 == 0) {
				lcm = i;
				break;
			}
		}

		return lcm;
	}

}