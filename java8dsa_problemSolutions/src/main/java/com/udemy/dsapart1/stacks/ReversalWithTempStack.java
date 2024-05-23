package com.udemy.dsapart1.stacks;
import java.util.Scanner;
import java.util.Stack;

public class ReversalWithTempStack {
	
	static Stack<Double> firstStack;
	static Stack<Double> tempSecStack;
	static Stack<Double> temp3rdStack;
		
	public static void main(String[] args) {
	Scanner scInpObj = new Scanner(System.in);
	System.out.print("\nEnter the size of Stack : ");
	int sizeOfStack = scInpObj.nextInt();
	System.out.println("\nEnter the stack elements : ");
	firstStack = new Stack<>();
	tempSecStack=new Stack<>();
	temp3rdStack=new Stack<>();
	pushElementsIntoStack(sizeOfStack);
	System.out.println("\nInput Stack : " + firstStack);
	moveStackElementsToReverseItems(firstStack,tempSecStack);
	moveStackElementsToReverseItems(tempSecStack,temp3rdStack);
	moveStackElementsToReverseItems(temp3rdStack,firstStack);
	System.out.println("\nOutput Reversed Stack : "+firstStack);
	}

	
	private static void moveStackElementsToReverseItems(Stack<Double> sourceStack, Stack<Double> destinationStack) {
		while (!sourceStack.isEmpty()) {
			double srcStackPeekItems = sourceStack.peek();
			destinationStack.push(srcStackPeekItems);
			sourceStack.pop();
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