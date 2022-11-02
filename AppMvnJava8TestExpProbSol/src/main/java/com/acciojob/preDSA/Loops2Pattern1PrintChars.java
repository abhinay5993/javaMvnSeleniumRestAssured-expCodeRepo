package com.acciojob.preDSA;
import java.util.Scanner;

public class Loops2Pattern1PrintChars {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int asciiAValue=65;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				char c=(char) (asciiAValue+i);
				System.out.print(c);	
			}
			System.out.println("");		
		}
	}
}