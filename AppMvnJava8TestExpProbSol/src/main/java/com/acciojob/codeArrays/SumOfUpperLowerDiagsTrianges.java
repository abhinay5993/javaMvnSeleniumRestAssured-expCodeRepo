package com.acciojob.codeArrays;
import java.util.Scanner;

public class SumOfUpperLowerDiagsTrianges {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int numMat[][]=new int[N][N];
        int upperTriSum=0;
        int lowTriSum=0;
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
                  if(i<=j)
                  {
                  upperTriSum=upperTriSum+numMat[i][j];        
                  }
                 if(i>=j)
                  {
                  lowTriSum=lowTriSum+numMat[i][j];        
                  }
                }
        }
        System.out.println(upperTriSum+" "+lowTriSum);

	}

}