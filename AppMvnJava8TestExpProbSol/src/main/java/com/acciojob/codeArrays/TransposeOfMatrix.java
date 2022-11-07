package com.acciojob.codeArrays;
import java.util.Scanner;

public class TransposeOfMatrix {

	//Optimized solution for only ( N x N --> Square matrix)
	//Expected Auxiliary Space: O(1) using swapping
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int inpMat[][]=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				inpMat[i][j]=sc.nextInt();
			}
		}
		
		getTransposeMatrix(inpMat);
	}
	
	public static void getTransposeMatrix(int inpMat[][]) {
		for (int i = 0; i < inpMat.length; i++) {
			for (int j = i + 1; j < inpMat.length; j++) {
				int temp = inpMat[i][j];
				inpMat[i][j] = inpMat[j][i];
				inpMat[j][i] = temp;
			}
		}

		for (int i = 0; i < inpMat.length; i++) {
			for (int j = 0; j < inpMat.length; j++) {
				System.out.print(inpMat[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}