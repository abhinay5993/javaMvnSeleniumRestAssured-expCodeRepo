package com.guvi.dsalgo;
import java.util.Arrays;
import java.util.Scanner;

//this algorithms deals with rotation of array with Reversal approach.
// Time  Complexity O(n)
// Space Complexity O(1)
//Ex. Original Array A={1,2,3, 5,6,7,8} Rotated Array B={5,6,7,8,1,2,3}
//0-2 3-6
//321 8765
//5678 123
public class RotatedVersionOfInputArray {
	
	static RotatedVersionOfInputArray obj;
	private int sizeOfArray;
	private Object[] dataHolder;

	public int getSizeOfArray() {
		return sizeOfArray;
	}
	
	public Object[] getDataHolder() {
		return dataHolder;
	}
	
	public void setSizeOfArray(int sizeOfArray) {
		this.sizeOfArray = sizeOfArray;
		this.dataHolder=new Object[sizeOfArray];
	}
	
	public static void addInitialDataIntoArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array : ");
		int arrSize = Integer.parseInt(sc.nextLine());
		obj = new RotatedVersionOfInputArray();
		obj.setSizeOfArray(arrSize);
		System.out.println("\nEnter the Items : ");
		for (int i = 0; i < obj.getSizeOfArray(); i++) {
			obj.dataHolder[i] = sc.nextLine();
		}
		System.out.println("\nAvaiable data into Array : "+Arrays.toString(obj.getDataHolder()));
	}
	
	//Reversing the data
	public static void reverseArrayData(Object[] inpData,int i,int j)
	{
		int leftPos=i;
		int rightPos=j;
		while(leftPos<rightPos)
		{
		Object temp=inpData[leftPos];
		inpData[leftPos]=inpData[rightPos];
		inpData[rightPos]=temp;
		leftPos++;
		rightPos--;
		}
	}
	
	//rotate through reversal
	public static void rotateArrayUsingReversal(Object[] inpData,int kPos)
	{
		kPos=kPos%inpData.length;
		if(kPos<0)
		{
			kPos=kPos+inpData.length;
		}
		//rotate through reversal of 1st Sub-Array part-1
		reverseArrayData(inpData,0,inpData.length-kPos-1);
		
		//rotate through reversal of 2nd Sub-Array part-2
		reverseArrayData(inpData,inpData.length-kPos, inpData.length-1);
		
		//rotate the whole array
		reverseArrayData(inpData,0,inpData.length-1);
		
	}
	
	public static void main(String[] args) {
		addInitialDataIntoArray();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter k-th position of Array through which array to be rottated : ");
		int kPos = Integer.parseInt(sc.nextLine());
		
		rotateArrayUsingReversal(obj.getDataHolder(),kPos);
		
		System.out.println("\nNew Roatted by K-th="+kPos+" postion of Array : "+Arrays.toString(obj.getDataHolder()));
	}
	

}