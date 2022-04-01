package com.problemsolving.testUtilExps;
import java.util.Arrays;

public class GuviSumOfArrayElements {
	
public static void main(String[] args) {
	int arr1[]= {3,4,57,-5,9,55};
	int arr2[]= {7,6,5,88};
	System.out.println("\nArray-1 data : "+Arrays.toString(arr1));
	System.out.println("\nArray-2 data : "+Arrays.toString(arr2));
	System.out.println("\nResultant array by sum of elements : "+Arrays.toString(sumOfArrayElements(arr1, arr2)));
}

public static int[] sumOfArrayElements(int[] arr1,int[] arr2) {
	int carry=0;
	int arr1Count=arr1.length-1;
	int arr2Count=arr2.length-1;
	int resultArray[] = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
	int res3Count=resultArray.length-1;
	
	while(res3Count>=0)
	{
		int digit=carry;
		
		if(arr1Count>=0)
		{
			digit=digit+arr1[arr1Count]	;
		}
		
		if(arr2Count>=0)
		{
			digit=digit+arr2[arr2Count]	;
		}
		
		carry=(digit/10);
		digit=(digit%10);
		resultArray[res3Count]=digit;
		
		arr1Count--;
		arr2Count--;
		res3Count--;
	}
	
	System.out.println("\nCarry data : ");
	if(carry!=0)
	{
	System.out.print(carry);
	}
	
	System.out.println("\nResult data : ");
	for(double val:resultArray)
	{
	System.out.print(val);
	}
	
	return resultArray;
}

}