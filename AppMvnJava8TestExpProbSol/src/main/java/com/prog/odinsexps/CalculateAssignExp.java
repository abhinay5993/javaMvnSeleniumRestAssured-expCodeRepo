package com.prog.odinsexps;
import java.util.Scanner;

public class CalculateAssignExp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, result = 0;
		System.out.print("\nPlease enter your first number : ");
		x = sc.nextInt();
		System.out.print("\nPlease enter your second number : ");
		y = sc.nextInt();
		System.out.println("\nPlease enter operator : ");
		char oper = sc.next().charAt(0);
		
		if (oper == '*') {
			result = (x * y);
		} else if (oper == '+') {
			result = (x + y);
		} else if (oper == '-') {
			result = (x - y);
		} else if (oper == '/') {
			result = (x / y);
		} else if (oper == '%') {
			result = (x % y);
		} else {
			System.out.print("\nInvalid Operation!!..");
		}
		System.out.println("\nThe result is : " + result);
	}
}