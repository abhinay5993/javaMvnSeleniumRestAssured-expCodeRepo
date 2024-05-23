package com.udemy.dsapart1.stacks;
import java.util.Scanner;
import java.util.Stack;

public class StackSorting {
	
	static Stack<Double> firstStack;
	static Stack<Double> secStack;
	
	public static void main(String[] args) {
	Scanner scInpObj = new Scanner(System.in);
	System.out.print("\nEnter the size of Stack : ");
	int sizeOfStack = scInpObj.nextInt();
	System.out.println("\nEnter the stack elements : ");
	firstStack = new Stack<>();
	secStack=new Stack<>();
	pushElementsIntoStack(sizeOfStack);
	System.out.println("\nInput Stack : " + firstStack);
	System.out.println("\nOutput Stack sorted in increasing/ascending order  : " +sortStackByAscOrder(firstStack));
	System.out.println("\nOutput Stack sorted in dicreasing/descending order : " +sortStackByDescOrder(secStack));
	}
	
	
	private static Stack<Double> sortStackByAscOrder(Stack<Double> firstStack2) {
	Stack<Double> tempStack = new Stack<>();
	while (!firstStack2.isEmpty()) {
	double peekOfSrcStack = firstStack2.pop();
	    while (!tempStack.isEmpty() && tempStack.peek() > peekOfSrcStack) {
		firstStack2.push(tempStack.pop());
		}
	tempStack.push(peekOfSrcStack);
	}
	return tempStack;
	}


	private static Stack<Double> sortStackByDescOrder(Stack<Double> firstStack2) {
	Stack<Double> tempStack = new Stack<>();
	while (!firstStack2.isEmpty()) {
	double peekOfSrcStack = firstStack2.pop();
	    while (!tempStack.isEmpty() && tempStack.peek() < peekOfSrcStack) {
		firstStack2.push(tempStack.pop());
		}
	tempStack.push(peekOfSrcStack);
	}
	return tempStack;
	}
	
	
	private static void pushElementsIntoStack(int sizeOfStack) {
	Scanner scInp1Obj = new Scanner(System.in);
	for (int i = 0; i < sizeOfStack; i++) {
		System.out.print("\npush the element No " + (i + 1) + " : ");
		double dataItem=scInp1Obj.nextDouble();
		firstStack.push(dataItem);
		secStack.push(dataItem);
	}
	}
	
}