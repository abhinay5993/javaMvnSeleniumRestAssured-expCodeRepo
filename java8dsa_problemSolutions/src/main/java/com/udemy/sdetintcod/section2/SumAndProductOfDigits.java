package com.udemy.sdetintcod.section2;
import java.util.Scanner;

public class SumAndProductOfDigits {

	public static void main(String[] args) {
	Scanner scnsInp=new Scanner(System.in);
	System.out.println("\nEnter the number : ");
	long num=scnsInp.nextLong();
	System.out.println("\nThe inputed "+num+" is and the sum of Digits : "+getTheSumOfDigits(num));
	System.out.println("\nThe inputed "+num+" is and the Product of Digits : "+getTheProductOfDigits(num));
	scnsInp.close();
	}

	private static long getTheProductOfDigits(long num) {
	long productOfDigits=1;
	while (num!=0) {
	//get the last digit of the number
	long lastDigit=(num%10);
	productOfDigits=productOfDigits*lastDigit;
	//Cut/reduce the number & keep remaining
	num=num/10;
	}
	return productOfDigits;
	}

	private static long getTheSumOfDigits(long num) {
		long sumOfDigits = 0;
		while (num != 0) {
			// get the last digit of the number
			long lastDigit = (num % 10);
			sumOfDigits = sumOfDigits + lastDigit;
			// Cut/reduce the number & keep remaining
			num = num / 10;
		}
		return sumOfDigits;
	}

}