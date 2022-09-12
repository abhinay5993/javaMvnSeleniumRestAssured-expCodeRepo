package com.acciojob.preDSA;
import java.util.Scanner;

public class PlusMinusRatioProb {

	public static void main(String[] args) {
		double pVeCount = 0,negVeCount = 0,zeroCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter size of the array : ");
		int n = sc.nextInt();
		int[] numarr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter " + (i + 1) + " array Elements : ");
			numarr[i] = sc.nextInt();
			if (numarr[i] > 0) {
				pVeCount++;
			}

			if (numarr[i] < 0) {
				negVeCount++;
			}

			if (numarr[i] == 0) {
				zeroCount++;
			}

		}
		System.out.println(" ");
		System.out.println((pVeCount / n));
		System.out.println((negVeCount / n));
		System.out.println((zeroCount / n));
	}
}
