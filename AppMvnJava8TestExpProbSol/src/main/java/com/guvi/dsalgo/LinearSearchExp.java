package com.guvi.dsalgo;
import java.util.Arrays;

public class LinearSearchExp {

	public static void main(GuviCustStringExps[] args) {
		int testData[] = { 1, 21, 45, 66, 98, 85, 78, 4, 55, 48 };
		System.out.println("\nAvailable Data : " + Arrays.toString(testData));
		int itemTobeSearched = 45;
		getItemPositionUsingLinearSearch(testData, itemTobeSearched);
	}

	public static void getItemPositionUsingLinearSearch(int inpData[], int searchItem) {
		int searchItemIndex = 0;
		for(int i=0;i<inpData.length;i++)
		{
		   if(inpData[i]==searchItem)
		   {
			 searchItemIndex=i;
			 break;
		   }
		}
		System.out.println("\nThe searched Item:"+searchItem+" exists into position : "+searchItemIndex);
	}

}