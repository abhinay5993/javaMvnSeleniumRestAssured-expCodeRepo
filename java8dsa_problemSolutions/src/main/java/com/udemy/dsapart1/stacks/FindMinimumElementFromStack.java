package com.udemy.dsapart1.stacks;
import java.util.Scanner;
import java.util.Stack;

public class FindMinimumElementFromStack {
	
	static Stack<Double> firstStack;
	static Stack<Double> tempStack;
	
	public static void main(String[] args) {
	Scanner scInpObj = new Scanner(System.in);
	System.out.print("\nEnter the size of Stack : ");
	int sizeOfStack = scInpObj.nextInt();
	System.out.println("\nEnter the stack elements : ");
	firstStack = new Stack<>();
	tempStack = new Stack<>();
	pushElementsIntoStack(sizeOfStack);
	System.out.println("\nInput Stack : " + firstStack);
	System.out.println("\nPush elements to stack using custom temp stack : ");
	int noOfNewItems = scInpObj.nextInt();
	for (int i=0;i<noOfNewItems;i++) {
	System.out.print("\npush the element No " + (i + 1) + " : ");
	customPush(scInpObj.nextDouble());
	}
	customPop();
	customPop();
	customPush(1000.300);
	System.out.println("\nFinal updated stack post push,pop operation : "+firstStack);
	System.out.println("\nMinimum peeked element from Stack : "+firstStack.peek());
	}


	private static void customPush(double itemToPush) {
	firstStack.push(itemToPush);
	if (tempStack.isEmpty()) {
		tempStack.push(itemToPush);
	} else if (tempStack.peek() > itemToPush) {
		tempStack.push(itemToPush);
	  }
	System.out.println("\n"+itemToPush+" item pushed to stack");
	}

	
	private static void customPop() {
	double srcStackPeek = firstStack.peek();
	System.out.println("\n"+firstStack.pop()+" item pop from stack");
	if (tempStack.peek() == srcStackPeek) {
			tempStack.pop();
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