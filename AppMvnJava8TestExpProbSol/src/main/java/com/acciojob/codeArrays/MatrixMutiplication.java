package com.acciojob.codeArrays;
import java.util.Scanner;

public class MatrixMutiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNo of Test Case : ");
		int nTc = sc.nextInt();
		for (int tc = 0; tc < nTc; tc++) {
			System.out.print("\nEnter TC-"+(tc+1)+" No of rows : ");
			int N = sc.nextInt();
			System.out.print("\nEnter TC-"+(tc+1)+" No of cols : ");
			int M = sc.nextInt();
			int A[][] = new int[N][M];
			int B[][] = new int[N][M];
			System.out.println("\nInput Matrix A : ");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					A[i][j] = sc.nextInt();
				}
			}

			System.out.println("\nInput Matrix B : ");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					B[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("\nOutput Product of Matrix A x B for  TC-"+(tc+1)+" : ");
			if(A[0].length==B.length)
			{
				printProductOfMatrix(A, B);
			}
			else
			{
				System.out.println("\nMatrix Mutiplication not!! possible..");
			}
		}
	}
	
	public static void printProductOfMatrix(int inpA[][], int inpB[][]) {
		int row=inpB.length;
		int col=inpA[0].length;
		int prodAns[][]=new int[row][col];
		
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				for (int k = 0; k < row; k++) 
				{
					prodAns[i][j] = prodAns[i][j] + inpA[i][k] * inpB[k][j];
				}
			}
		}

		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				System.out.print(prodAns[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}