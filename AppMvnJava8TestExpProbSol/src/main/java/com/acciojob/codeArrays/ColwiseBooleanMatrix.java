package com.acciojob.codeArrays;
import java.util.Scanner;

//Optimized Time Complexity can be achived but space complexity will be incresed.
//Trade off between Time Vs Space Complexity.
public class ColwiseBooleanMatrix {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int binaryMat[][]=new int[m][n];
		System.out.println("\nInput Matrix : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				binaryMat[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nColumn wise Matrix Transformation : ");
		printColwiseBooleanMatrix(binaryMat);
	}
	
	public static void printColwiseBooleanMatrix(int inpMat[][])
	{
		int row=inpMat.length;
		int col=inpMat[0].length;
		int colinfoMat[]=new int[col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(inpMat[i][j]==1)
				{
					colinfoMat[j]=1;
				}
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(colinfoMat[j]==1)
				{
					inpMat[i][j]=1;
				}
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			System.out.print(inpMat[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}
	
}