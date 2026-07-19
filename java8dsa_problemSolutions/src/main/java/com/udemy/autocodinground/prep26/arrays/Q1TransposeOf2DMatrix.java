package com.udemy.autocodinground.prep26.arrays;
import java.util.Scanner;

public class Q1TransposeOf2DMatrix {

	public static void main(String[] args) {
	Scanner scpIn = new Scanner(System.in);
	System.out.println("\nEnter number of Row : ");
	int row=scpIn.nextInt();
	System.out.println("\nEnter number of Column : ");
	int col=scpIn.nextInt();
	int[][] inputNumArray=new int[row][col];
	if (inputNumArray == null || inputNumArray.length == 0 || inputNumArray[0].length == 0) {
		System.out.println("\nTranspose is not!! possible..");
	} else {
		genarateInputMatrix(inputNumArray, row, col);
		System.out.println("\nResultant Transpose Matrix : ");
		performMatrixTranspose(inputNumArray);
	}
	scpIn.close();
	}

	private static void performMatrixTranspose(int[][] inputNumArray) {
		int rowCount = inputNumArray.length; 
		int colCount = inputNumArray[0].length;
		int[][] resutMat=new int[colCount][rowCount];
		
		//Traverse through input array 'inputNumArray' w.r.t row x col
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < colCount; col++) {
			//Fill 'resutMat' transpose matrix elements w.r.t col x row with 'inputNumArray' 'row', 'col'
			resutMat[col][row]=inputNumArray[row][col];
			}
		}
	showInputMatrix(resutMat);
	}

	private static void genarateInputMatrix(int[][] inputNumArray,int row, int col) {
	Scanner scpIn = new Scanner(System.in);
	System.out.println("\nEnter the "+row+" x "+col+" matrix elements : ");
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
		inputNumArray[i][j]=scpIn.nextInt();
		}
	}
	showInputMatrix(inputNumArray);
	scpIn.close();
	}

	private static void showInputMatrix(int[][] inputMat) {
		int rowCount = inputMat.length;
		int colCount = inputMat[0].length;
		System.out.println("\nValue of "+rowCount+" x "+colCount+" Matrix : ");
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				System.out.print(inputMat[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

	
}