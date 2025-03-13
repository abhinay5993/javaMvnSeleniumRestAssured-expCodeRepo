package com.amodleetcodesol.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArrayElements {

	public static void main(String[] args) {
	Scanner scObj=new Scanner(System.in);
	int[] inpArray={2,5,1,3,4,7};
	System.out.print("\nEnter the position to start shuffleing : ");
	int shufflePos=scObj.nextInt();
	System.out.println("Input Array : "+Arrays.toString(inpArray));
	System.out.println("\nThe shuffled output array : "+Arrays.toString(performShufflingOverArrayElements(inpArray,shufflePos)));
	
	int[] inpArray2={1,2,3,4,4,3,2,1};
	System.out.print("\nCASE 2 : Enter the position to start shuffleing : ");
	int shuffle2Pos=scObj.nextInt();
	System.out.println("2nd Input Array : "+Arrays.toString(inpArray2));
	System.out.println("\nThe 2nd shuffled output array : "+Arrays.toString(performShufflingOverArrayElements(inpArray2,shuffle2Pos)));
	
	}

	private static int[] performShufflingOverArrayElements(int[] inpArray, int shufflePos) {
		int[] resultArray = new int[2 * shufflePos];
		int k = 0;
		for (int i = 0; i < 2 * shufflePos; i += 2) {
			resultArray[i] = inpArray[k];
			resultArray[i + 1] = inpArray[k + shufflePos];
			k++;
		}
		return resultArray;
	}

	
}