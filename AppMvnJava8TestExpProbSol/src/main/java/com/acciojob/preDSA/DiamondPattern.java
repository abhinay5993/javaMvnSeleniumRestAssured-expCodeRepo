package com.acciojob.preDSA;
import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			
			int n = sc.nextInt();
			for (int i = 1; i <= (n / 2) + 1; i++) {
				for (int j = 1; j <= (n - (2 * i - 1)); j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= (i * 2) - 1; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}

			for (int i = n / 2; i >= 1; i--) {
				for (int j = 1; j <= (n - (2 * i - 1)); j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= (i * 2) - 1; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
		
	}

}