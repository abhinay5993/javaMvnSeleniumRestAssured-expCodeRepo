package com.acciojob.preDSA;
import java.util.Scanner;

public class PrintChar2LoopsIIPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nl = sc.nextInt();

		for (int i = 1; i <= nl; i++) {
			char startCh = (char) ('A' + i - 1);
			for (int j = 1; j <= i; j++) {
				System.out.print(startCh);
				startCh++;

				if (startCh > 'Z') {
					startCh = 'A';
				}
			}
			System.out.println("");
		}
	}

}