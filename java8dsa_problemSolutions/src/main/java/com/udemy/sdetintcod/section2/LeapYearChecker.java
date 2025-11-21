package com.udemy.sdetintcod.section2;
import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		Scanner scnsInp=new Scanner(System.in);
		System.out.println("\nEnter the year : ");
		long num=scnsInp.nextLong();
		System.out.println("\nThe inputed year "+num+" status is : "+isLeapYear(num));
		scnsInp.close();
	}

	private static String isLeapYear(long num) {
	String yearStatus = "Not a Leap Year.";
	if (num % 4 == 0) {
		if (num % 100 == 0) {
			if (num % 400 == 0) {
			yearStatus="Leap Year.";
			}
		}
		yearStatus="Leap Year.";
	}
	return yearStatus;
	}

}