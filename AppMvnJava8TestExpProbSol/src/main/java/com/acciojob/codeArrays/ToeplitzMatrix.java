package com.acciojob.codeArrays;
import java.util.Scanner;

public class ToeplitzMatrix {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int mRow=sc.nextInt();
        int nCol=sc.nextInt();
        int inpMat[][]=new int[mRow][nCol];
        for(int i=0;i<mRow;i++)
        {
                for(int j=0;j<nCol;j++)
                {
                   inpMat[i][j]=sc.nextInt(); 
                }
        }
        System.out.println(isToeplitzMatrix(inpMat));
	}
	
	public static boolean isToeplitzMatrix(int inpArr[][]) {
		int row = inpArr.length - 1;
		int col = inpArr[0].length - 1;
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++)
			{
				if (inpArr[i][j] != inpArr[i + 1][j + 1]) {
					return false;
				}
			}
		}
		return true;
	}
	
}