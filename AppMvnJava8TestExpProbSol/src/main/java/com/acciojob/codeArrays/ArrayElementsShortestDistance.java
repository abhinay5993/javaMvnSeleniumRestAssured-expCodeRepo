package com.acciojob.codeArrays;
import java.util.Scanner;

public class ArrayElementsShortestDistance {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numarr = new int[n];
		for (int i = 0; i < n; i++) {
			numarr[i] = sc.nextInt();
		}
		System.out.println(getShortestDist(numarr));
	}

	
	public static int getShortestDist(int inDat[]) {
		int shortDist = Integer.MAX_VALUE;
		
		for (int i = 0; i < inDat.length; i++) 
		{
			for (int j = i + 1; j < inDat.length; j++) 
			{
				if (inDat[i] % 2 == 0 && inDat[j] % 2 == 0) 
				{
					if (j - i < shortDist) 
					{
						shortDist = Math.abs(i - j);
					}
				}
			}
		}
		
		if (shortDist == Integer.MAX_VALUE) {
			return -1;
		} else {
			return shortDist;
		}
		
	}
    
}