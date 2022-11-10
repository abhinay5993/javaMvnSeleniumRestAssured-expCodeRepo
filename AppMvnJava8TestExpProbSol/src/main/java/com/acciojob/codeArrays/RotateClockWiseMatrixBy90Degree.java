package com.acciojob.codeArrays;
import java.util.Scanner;

//Optimized solution for only ( N x N --> Square matrix)
//Expected Auxiliary Space: O(1) using swapping
//Matrix rotation by 90 degree Clock Wise.

public class RotateClockWiseMatrixBy90Degree {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
        if(N==M)
        {
        System.out.println("\nInput Matrix : ");
		int inpMat[][]=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				inpMat[i][j]=sc.nextInt();
			}
		}
     	//For clock wise 90 Degree rotation
		System.out.println("\nClock wise 90 Degree rotation of Matrix : ");
		reverseRightRoationBySwapping(getTransposeMatrix(inpMat));
		
		//For Anti-clock wise 90 Degree rotation
		System.out.println("\nAnti-Clock wise 90 Degree rotation of Matrix : ");
		reverseLeftRotationBySwapping(getTransposeMatrix(inpMat));
        }
	}
	
	//Transposing the matrix
	public static int[][] getTransposeMatrix(int inpMat[][]) {
		for (int i = 0; i < inpMat.length; i++) {
			for (int j = i + 1; j < inpMat.length; j++) {
				int temp = inpMat[i][j];
				inpMat[i][j] = inpMat[j][i];
				inpMat[j][i] = temp;
			}
		}
		return inpMat;
	}

	// Reverse every rows of the matrix by clock Wise.
	public static void reverseRightRoationBySwapping(int transposeMat[][]) {
		int start = 0;
		int end = transposeMat.length - 1;
		while (start < end) {
			for (int i = 0; i < transposeMat.length; i++) {
				int temp = transposeMat[i][start];
				transposeMat[i][start] = transposeMat[i][end];
				transposeMat[i][end] = temp;
			}
			start++;
			end--;
		}
		
		for (int i = 0; i < transposeMat.length; i++) {
			for (int j = 0; j < transposeMat.length; j++) {
				System.out.print(transposeMat[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}
	
	
	// Reverse every Cols of the matrix by Anti-Clock Wise
	public static void reverseLeftRotationBySwapping(int transposeMat[][]) {
		int start = 0;
		int end = transposeMat.length - 1;
		while (start < end) {
			for (int i = 0; i < transposeMat.length; i++) {
				int temp = transposeMat[start][i];
				//for Anti-Clock Wise
				transposeMat[start][i] = transposeMat[end][i];
				transposeMat[end][i] = temp;
			}
			start++;
			end--;
		}
		
		for (int i = 0; i < transposeMat.length; i++) {
			for (int j = 0; j < transposeMat.length; j++) {
				System.out.print(transposeMat[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}

}