package com.kkakYoubtubeDsa;
import java.util.Scanner;

public class TriPattern3 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.println("\nEnter no of rows : ");
		int nth=sca.nextInt();
		System.out.println("   ");
		for(int i=1;i<=nth;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
			System.out.print("  ");
			}
			for(int j=1;j<=nth-i+1;j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
	}
}
