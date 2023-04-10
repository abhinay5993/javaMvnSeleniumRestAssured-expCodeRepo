package com.prog.edubridgeindia;

public class PlayWithArrays {

	public static void main(String[] args) {
		int[][] twoDArr= { {4,3,4},{3,4,3},{3,4,3} };
		System.out.println("\nInput value of Matrix : ");
		for(int i=0;i<twoDArr.length;i++)
		{
			for(int j=0;j<twoDArr[i].length;j++)
			{
				System.out.print(" "+twoDArr[i][j]);
			}
			System.out.println(" ");
		}
		
		//Jagged Array implimentation-
		int jagArr[][]=new int[3][];
		jagArr[0]=new int[3];
		jagArr[1]=new int[5];
		jagArr[2]=new int[8];
		int countTag=0;
		for(int i=0;i<jagArr.length;i++)
		{
			for(int j=0;j<jagArr[i].length;j++)
			{
				jagArr[i][j]=countTag++;
			}
		}
		
		System.out.println("\nPrint the data of Jagged Array : ");
		for(int i=0;i<jagArr.length;i++)
		{
			for(int j=0;j<jagArr[i].length;j++)
			{
				System.out.print(" "+jagArr[i][j]);
			}
			System.out.println(" ");
		}
		
	}

}