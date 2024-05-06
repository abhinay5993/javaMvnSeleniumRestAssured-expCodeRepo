package com.udemy.dsapart1.stacks;
import java.util.Scanner;
import java.util.Stack;

public class CustomPushAndPopToStack {

	static Stack<Double> firstStack;
	
	public static void main(String[] args) {
	Scanner scInpObj = new Scanner(System.in);
	System.out.print("\nEnter the size of Stack : ");
	int sizeOfStack = scInpObj.nextInt();
	System.out.println("\nEnter the stack elements : ");
	firstStack = new Stack<>();
	pushElementsIntoStack(sizeOfStack);
	System.out.println("\nInput Stack : " + firstStack);
	System.out.print("\nEnter the index position to insert element to Stack : ");
	int indexToPush = scInpObj.nextInt();
	System.out.print("\nEnter the data element to be pushed in Stack : ");
	double doubDataToPush = scInpObj.nextDouble();
	doCustomPushToStackByIndex(doubDataToPush,indexToPush,firstStack);
	System.out.println("\nUpdated Stack post push new elements : " + firstStack);
	
	System.out.print("\nEnter the index position to remove element from Stack : ");
	int indexToPop = scInpObj.nextInt();
	doCustomPopToStackByIndex(indexToPop,firstStack);
	System.out.println("\nUpdated Stack post pop of elements : " + firstStack);
	}


	private static void doCustomPushToStackByIndex(double doubDataToPush, int indexToPush, Stack<Double> firstStack2) {
		Stack<Double> tempStack = new Stack<>();
		for (int i = 1; i <= firstStack2.size() - indexToPush + 1; i++) {
			double srcStackPeek = firstStack2.peek();
			tempStack.push(srcStackPeek);
			firstStack2.pop();
		}
		firstStack2.push(doubDataToPush);
		while (!tempStack.isEmpty()) {
			double destTempStackPeek = tempStack.peek();
			firstStack2.push(destTempStackPeek);
			tempStack.pop();
		}
	}


	private static void doCustomPopToStackByIndex(int indexToPop, Stack<Double> firstStack2) {
		Stack<Double> tempStack = new Stack<>();
		if (indexToPop < 0 || indexToPop >= firstStack2.size()) {
		throw new IndexOutOfBoundsException(indexToPop + " Index is not in range.");
		}
		for (int i = 1; i <= firstStack2.size() - indexToPop + 1; i++) {
		tempStack.push(firstStack2.pop());
		}
		firstStack2.pop();
		while (!tempStack.isEmpty()) {
			firstStack2.push(tempStack.pop());
		}
	}
	
	
	private static void pushElementsIntoStack(int sizeOfStack) {
	Scanner scInp1Obj = new Scanner(System.in);
	for (int i = 0; i < sizeOfStack; i++) {
			System.out.print("\npush the element No " + (i + 1) + " : ");
			firstStack.push(scInp1Obj.nextDouble());
		}
	}

}