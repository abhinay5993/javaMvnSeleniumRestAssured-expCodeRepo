package com.acciojob.preDSA;

import java.util.Scanner;

public class RightAngleTriangleStars {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSize of StairCase : ");
		int n = sc.nextInt();
		int charValCount = 1;
		int spaceCount = n-charValCount;

		for (int i = 0; i <n; i++) {

			for (int j =0; j <charValCount; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			System.out.println();
			charValCount++;
			spaceCount--;
		}
	}

}