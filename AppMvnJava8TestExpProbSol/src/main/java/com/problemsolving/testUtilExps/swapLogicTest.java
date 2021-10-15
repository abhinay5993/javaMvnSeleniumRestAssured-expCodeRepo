package com.problemsolving.testUtilExps;
import java.util.Scanner;

public class swapLogicTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the X = ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the Y = ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the Z = ");
		int z = Integer.parseInt(sc.nextLine());

		System.out.println("\nValues Before Swap : X=" + x + " Y=" + y + " ");
		//y = x + y - (x = y);
		int t=y;
		y=x;
		x=t;
		System.out.println("\nValues After Swap : X=" + x + " Y=" + y + " ");

		int max = (x > y) ? (x > z) ? x : z : (y > z) ? y : z;

		System.out.println("\nLargest Number : " + max);

	}

}