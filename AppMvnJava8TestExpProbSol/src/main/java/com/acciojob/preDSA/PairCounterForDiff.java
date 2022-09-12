package com.acciojob.preDSA;
import java.util.Arrays;
import java.util.Scanner;

public class PairCounterForDiff {

	public static void main(String[] args) {
		int pairCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSize of Array N : ");
		int n = sc.nextInt();
		System.out.println("\nPair difference Value K : ");
		int k = sc.nextInt();
		int[] numarr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter value-"+(i+1)+" : ");
			numarr[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if (numarr[i] == numarr[j]) {
					return;
				}
				if (Math.abs(numarr[i] - numarr[j]) == k) {
					pairCount++;
				}
			}
		}
		System.out.println("\nCurrent Array data : "+Arrays.toString(numarr));
		System.out.println("\nCount of total pairs of integers : "+pairCount);
	}

}
