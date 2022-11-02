package com.acciojob.preDSA;
import java.util.Scanner;

public class Coditional2Q4BigLight {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int v1 = sc.nextInt();
		int h2 = sc.nextInt();
		int v2 = sc.nextInt();

		if (v1 > v2) {
			System.out.println("NO");
			
		} else if (v1 == v2) {
			
			if (h1 == h2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		} else {
			
			int heightGap = (h1 - h2);
			int speedGap = (v2 - v1);
			if (heightGap % speedGap == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}

	}

}