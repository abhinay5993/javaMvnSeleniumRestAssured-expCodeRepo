package com.kkakYoubtubeDsa;

/*
 * 1. a & b --> represent bitwise and operator.
 * 2. a | b --> represent bitwise or operator.
 * 3. a ^ b --> represent bitwise XOR operator.
 * 4. Assignment operators with combination-
 *    x +=2;  --> x=x+2;
 *    x -=2;  --> x=x-2;
 *    x *=2;  --> x=x*2;
 *    x /=2;  --> x=x/2;
 *    x %=2;  --> x=x%2;
 *    x &=2;  --> x=x & 2;
 *    x |=2;  --> x=x | 2;
 *    x ^=2;  --> x=x ^ 2;
 *    x >>=2; --> x=x >> 2;
 *    x <<=2; --> x=x << 2;
 *    x =~n; --> x = -(n+1)
 */

public class Lecture5AkOperators {

	public static void main(String[] args) {
		int z=~50;
		System.out.println("\nNew Value of Z : "+z);
		int n=5;
		n ^=20;
		System.out.println("\nValue of n ^=20;  --> n=n ^ 20 --> "+n);
		System.out.println("  ");
		int x=10;
		int y=13;
		System.out.println(" x & y : "+(x & y));
		System.out.println(" x | y : "+(x | y));
		System.out.println(" x ^ y : "+(x ^ y));
		System.out.println(" ~y : "+(~y));
		//Right shift by 1 position
		int numOfDight=1;
		int rightShift=(y >> numOfDight);
		int leftShiftValue=(y << numOfDight);
		//In case of right shift number is getting devided by 2
		System.out.println("\n "+y+" >> "+numOfDight+" right shift by "+numOfDight+" digit : "+rightShift);
		//In case of Left shift number is getting multiplyed by 2
		System.out.println("\n "+y+" << "+numOfDight+" Left shift by "+numOfDight+" digit : "+leftShiftValue);
	}

}