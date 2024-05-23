package com.udemy.dsapart1.binarytrees;
import java.util.Arrays;
import java.util.Scanner;

public class TestDriverForBinaryTreeOperation {
	
	static double inputArr[];
	static BinaryTreeNodeEntity binTreeObj;
	
	public static void main(String[] args) {
	Scanner scInp=new Scanner(System.in);
	System.out.print("\nEnter the size of Array : ");
	int sizeOfArr = scInp.nextInt();
	inputArr = new double[sizeOfArr];
    binTreeObj=new BinaryTreeNodeEntity();
	System.out.println("\nEnter the Array elements : ");
	pushElementsIntoTreeLikeArray(inputArr);
	System.out.println("\nInput Tree Array : " + Arrays.toString(inputArr));
	binTreeObj.insertANode(101.55);
	binTreeObj.insertANode(49.009);
	binTreeObj.insertANode(0.9999);
	System.out.println("\n************** Binary Tree elements (Inorder Traversal Result **************");
	binTreeObj.printSortedOrder();
	System.out.println("\nRoot Node of Binary Tree : "+binTreeObj.getRootNode());
	System.out.println("\nThe maximum element from tree : "+binTreeObj.getMaximumElement());
	System.out.println("\nThe minimum element from tree : "+binTreeObj.getMinimumElement());
	System.out.println("\nCurrent hight of tree : "+binTreeObj.getBinaryTreeHeight());
	binTreeObj.insertANode(10000);
	binTreeObj.insertANode(-900);
	System.out.println("\n************** Updated Binary Tree elements (Inorder Traversal Result **************\n");
	binTreeObj.printSortedOrder();
	System.out.println("\nRoot Node of latest Binary Tree : "+binTreeObj.getRootNode());
	System.out.println("\nUpdated Current hight of tree : "+binTreeObj.getBinaryTreeHeight());
	System.out.print("\nEnter element to check in tree : ");
	double searchDataItem = scInp.nextDouble();
	System.out.println("\nIs the seached item present in Tree : "+binTreeObj.isElementPresent(searchDataItem));
	}

	
	private static void pushElementsIntoTreeLikeArray(double[] inputArr2) {
	Scanner scInp1Obj = new Scanner(System.in);
	for (int i = 0; i < inputArr.length; i++) {
		System.out.print("\nEnter the element No " + (i + 1) + " : ");
		inputArr[i] = scInp1Obj.nextDouble();
		//Inserting nodes to Binary Tree.
		binTreeObj.insertANode(inputArr[i]);
		}
	}

}