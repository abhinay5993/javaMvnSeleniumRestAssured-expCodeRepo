package com.udemy.dsapart1.stacks;
import java.util.Scanner;
import java.util.Stack;

public class SimpleStackOperations {

	public static Stack<Double> firstStack;
	
	public static void main(String[] args) {
	Scanner scInpObj = new Scanner(System.in);
	System.out.print("\nEnter the size of Stack : ");
	int sizeOfStack = scInpObj.nextInt();
	firstStack = new Stack<>();
	firstStack.setSize(sizeOfStack);
	System.out.println("\nSize of stack has been set.");
	System.out.println("\nEnter the stack elements : ");
	pushElementsIntoStack(sizeOfStack);
	System.out.println("\nInput Stack : " + firstStack);
	System.out.println("\nInitial size of stack - "+firstStack.size());
	System.out.println("\nInitial capacity of stack - "+firstStack.capacity());
	
	System.out.println("\nIs the stack is Empty : "+firstStack.isEmpty());
	System.out.println("***************** Perform Some Pop() & peek() operation LIFO (principle) **********************");
	System.out.println("\npeek the item : "+firstStack.peek());
	System.out.println("\nAfter peek Current Stack status : "+firstStack);
	System.out.println("\npop the item : "+firstStack.pop());
	System.out.println("\npop the item : "+firstStack.pop());
	System.out.println("\nAfter pop's Current Stack status : "+firstStack);
	System.out.println("\npop the item : "+firstStack.pop());
	System.out.println("\nCurrent Stack status : "+firstStack);
	System.out.println("\npeek the item : "+firstStack.peek());
	System.out.println("\nModifyed size of stack - "+firstStack.size());
	System.out.println("\nModifyed capacity of stack - "+firstStack.capacity());
	
	System.out.println("***************** Perform insert operation **********************");
	firstStack.insertElementAt(112.0, 4);
	System.out.println("\nInserting 112.0 at 4th position.");
	firstStack.insertElementAt(150.0, 3);
	System.out.println("\nInserting 150.0 at 3rd position.");
	System.out.println("\nCurrent new Stack status : "+firstStack);
	firstStack.insertElementAt(166.0, 5);
	System.out.println("\nInserting 166.0 at 5th position.");
	System.out.println("\nCurrent new Stack status : "+firstStack);
	
	System.out.println("***************** Perform remove operation **********************");
	System.out.println("\nRemove by index operation status : "+firstStack.remove(3));
	System.out.println("\nCurrent new Stack status : "+firstStack);
	System.out.println("\nRemove by value operation status : "+firstStack.remove(150.0));
	System.out.println("\n2nd Remove by value operation status : "+firstStack.remove(6.0));
	System.out.println("\nCurrent new final Stack status : "+firstStack);
	System.out.println("\nFinal size of stack - "+firstStack.size());
	System.out.println("\nFinal capacity of stack - "+firstStack.capacity());
	}

	private static void pushElementsIntoStack(int sizeOfStack) {
		Scanner scInp1Obj = new Scanner(System.in);
		for (int i = 0; i < sizeOfStack; i++) {
			System.out.print("\npush the element No " + (i + 1) + " : ");
			firstStack.push(scInp1Obj.nextDouble());
		}
	}

}