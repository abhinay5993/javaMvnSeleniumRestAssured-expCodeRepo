package com.problemsolving.testUtilExps;

import java.util.Scanner;

public class GuviPatternTestExp {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the Number of Rows : ");
		long num=Long.parseLong(sc.nextLine());
		System.out.println("\nInputed Number of Rows : "+num);
		System.out.println("\nRequired Pattern as follows : ");
		printPatterTri(num);
	}
	
	public static void printPatterTri(long rowNum) {
		for (int row = 1; row <= rowNum; row++) {
			
			for (int sp = 0; sp < rowNum - row; sp++) {
				System.out.print(" ");
			}

			for (int col = row; col >= 1; col--) {
				System.out.print(col+" ");
			}

			for (int col = 2; col <= row; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
}