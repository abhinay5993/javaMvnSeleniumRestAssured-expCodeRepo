package com.udemy.sdetintcod.section2;
import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
	Scanner scnsInp=new Scanner(System.in);
	System.out.println("\nEnter the number : ");
	long num=scnsInp.nextLong();
	System.out.println("\nThe inputed "+num+" is : "+validateIfNumberIsPrime(num));
	scnsInp.close();
	}

	private static String validateIfNumberIsPrime(long num) {
		String resultOut = "Prime number";
		if (num <= 1) {
			return resultOut = "Not a Prime number.";
		}
		for (long i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return resultOut = "Not a Prime number.";
			}
		}
		return resultOut;
	}

}