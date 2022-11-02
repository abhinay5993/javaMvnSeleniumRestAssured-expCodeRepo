package com.acciojob.preDSA;
import java.util.Scanner;

public class OddAccioDiamondPattern {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nNo of TestCases : ");
		int tc=sc.nextInt();
		
		for(int tests=0;tests<tc;tests++)
		{
			int row=sc.nextInt();
			int spaces=row-1;
			int halfSize=(row/2)+1;
			int stars=1;
			
			for(int i=1;i<=halfSize;i++)
			{
				
				for(int j=1;j<=spaces;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=stars;j++)
				{
					System.out.print("* ");
				}
				stars=stars+2;
				spaces=spaces-2;
				System.out.println();
				
			}
			
			stars=stars-4;
			spaces=spaces+4;
			for(int i=1;i<=halfSize-1;i++)
			{
				
				for(int j=1;j<=spaces;j++)
				{
					System.out.print(" ");
				}
				
				for(int j=1;j<=stars;j++)
				{
					System.out.print("* ");
				}
				stars=stars-2;
				spaces=spaces+2;
				System.out.println();
				
			}
			
		}
		
	}

}