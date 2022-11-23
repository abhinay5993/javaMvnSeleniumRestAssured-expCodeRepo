package com.acciojob.codeArrays;
import java.util.Scanner;

public class MatsDiagonalsDifference {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int numMat[][]=new int[N][N];
        int priDiaSum=0;
        int secDiaSum=0;
        for(int i=0;i<N;i++)
        {
                for(int j=0;j<N;j++)
                {
                numMat[i][j]=sc.nextInt();
                }
        }

        for(int i=0;i<N;i++)
        {
                for(int j=0;j<N;j++)
                {
                        if(i==j)
                        {
                                priDiaSum=priDiaSum+numMat[i][j];
                        }
                        if(i+j==N-1)
                        {
                                secDiaSum=secDiaSum+numMat[i][j];
                        }
                }
        }
        System.out.println(Math.abs(priDiaSum-secDiaSum));

	}

}