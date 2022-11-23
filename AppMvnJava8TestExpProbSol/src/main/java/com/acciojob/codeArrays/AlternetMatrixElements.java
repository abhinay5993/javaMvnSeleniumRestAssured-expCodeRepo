package com.acciojob.codeArrays;
import java.util.Scanner;

public class AlternetMatrixElements {

		public static void main (String[] args) throws java.lang.Exception
		{
			Scanner sc=new Scanner(System.in);
	                int n=sc.nextInt();
	                int m=sc.nextInt();
	                int num[][]=new int[n][m];
	                for(int i=0;i<n;i++)
	                {
	                        for(int j=0;j<m;j++)
	                        {
	                                num[i][j]=sc.nextInt();
	                        }
	                }

	                for(int i=0;i<n;i++)
	                {
	                        if(i%2==0)
	                        {
	                                for(int j=0;j<m;j++)
	                                {
	                                System.out.print(num[i][j]+" ");
	                                }         
	                        }
	                        else
	                        {
	                                for(int j=m-1;j>=0;j--)
	                                {
	                                System.out.print(num[i][j]+" ");
	                                }         
	                        }
	                }
	                
		}
}