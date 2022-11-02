package com.acciojob.codeArrays;
import java.util.Scanner;

public class SecondLargestArrayItem {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int n = sc.nextInt();
		int num[] = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] >= max) {
				secMax = max;
				max = num[i];
			} else if (num[i] != max && num[i] >= secMax) {
				secMax = num[i];
			}
		}
		System.out.println(secMax);

	}

}