package com.udemy.sdetintcod.section1;
import java.util.Scanner;

public class ConvertDecimalToBinaryNumber {

	public static void main(String[] args) {
		Scanner scInput = new Scanner(System.in);
		System.out.print("\nEnter the Number : ");
		long inpNumX = scInput.nextLong();
		System.out.println("\nEquivalant in-build Binary value conversion : " + Long.toBinaryString(inpNumX));
		System.out.println("\nEquivalant in-build Hexdecimal value conversion : " + Long.toHexString(inpNumX));
		System.out.println("\nEquivalant in-build Octal value conversion : " + Long.toOctalString(inpNumX));
		System.out.println("\nEquivalant in-build Unsigned value conversion : " + Long.toUnsignedString(inpNumX));
		System.out.println("\n***********************************");
		convertToBinaryNumber(inpNumX);
		System.out.println("\n***********************************");
		convertToOctalNumber(inpNumX);
		scInput.close();
	}

	private static void convertToBinaryNumber(long inpNumX) {
		long convertNum = 0, remMod, iCount = 1;
		while (inpNumX != 0) {
			// get the last digit.
			remMod = inpNumX % 2;

			// Reformation of the converted new number
			convertNum = convertNum + iCount * remMod;
			iCount = iCount * 10;

			// This the terminal operation to execute loop till finite execution until
			// inpNumX become zero
			inpNumX = inpNumX / 2;
		}
		System.out.println("\nComputed Binary Value : " + convertNum);
	}
	
	
	private static void convertToOctalNumber(long inpNumX) {
		long convertNum = 0, remMod, iCount = 1;
		while (inpNumX != 0) {
			// get the last digit.
			remMod = inpNumX % 8;

			// Reformation of the converted new number
			convertNum = convertNum + iCount * remMod;
			iCount = iCount * 10;

			// This the terminal operation to execute loop till finite execution until
			// inpNumX become zero
			inpNumX = inpNumX / 8;
		}
		System.out.println("\nComputed Octal Value : " + convertNum);
	}
	

}