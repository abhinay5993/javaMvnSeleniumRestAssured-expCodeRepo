package com.prog.edubridgeindia;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JaggedArrayWithEnhancedLoop {

	public static void main(String[] args) {
		// Declaration of Jagged Array (i.e. Whoes No of Rows are of same length , but
		// no of Columns are of different Length
		double jaggedArray[][]=new double[4][];
		jaggedArray[0]=new double[6];
		jaggedArray[1]=new double[3];
		jaggedArray[2]=new double[4];
		jaggedArray[3]=new double[8];
		
		System.out.println("\nFill Jagged Array With Items : ");
		fillWithInputElements(jaggedArray);
		System.out.println("\nJagged Array Data Set :");
		showJaggedArrayDataItems(jaggedArray);
		
		//Converting Permitive Array to Non-Primitive
		List<double[]> dobItems=Arrays.asList(jaggedArray);
		dobItems.forEach(x->System.out.println("\nData Items from List : "+Arrays.toString(x)));
		
		//Print Anonymous Array
		System.out.println("\nPrint the Values of Anonymous Array :");
		showJaggedArrayDataItems(new int[][] { {3,4,3,4,2,7},{3,4,5,3},{3,4,9} });
	}

	// Using Enhanced For Loop Show Items of Jagged Array
	private static void showJaggedArrayDataItems(double[][] jaggedArray) {
		for (double[] jaggedRow : jaggedArray) {
			for (double jaggedItems : jaggedRow) {
				System.out.print(jaggedItems+" ");
			}
			System.out.println();
		}
	}

	// Using Enhanced For Loop Show Items of Jagged Array
	private static void showJaggedArrayDataItems(int[][] jaggedArray) {
		for (int[] jaggedRow : jaggedArray) {
			for (int jaggedItems : jaggedRow) {
				System.out.print(jaggedItems+" ");
			}
			System.out.println();
		}
	}
	
	// Using Enhanced For Loop take input
	private static void fillWithInputElements(double[][] jaggedArray) {
		Scanner sct = new Scanner(System.in);
		for (int i = 0; i < jaggedArray.length; i++) {
			for (int j = 0; j < jaggedArray[i].length; j++) {
				jaggedArray[i][j] = sct.nextDouble();
			}
		}
	}

}