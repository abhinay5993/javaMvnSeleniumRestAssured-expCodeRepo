package com.udemy.dsapart1.queues;
import java.util.Scanner;
import java.util.Stack;

public class HybridQueueUsingStack {
	
	static double[] arrayOfQue;
	static Stack<Double> srcStack;
	static Stack<Double> tempStack;
	
	public static void main(String[] args) {
	Scanner scInpObj = new Scanner(System.in);
	System.out.print("\nEnter the size of Que : ");
	int sizeOfQue = scInpObj.nextInt();
	srcStack=new Stack<>();
	tempStack=new Stack<>();
	pushElementsIntoArray(sizeOfQue);
	System.out.println("\nNew hybrid-Queue after enqueue operation : "+srcStack);
	performCustomDeque();
	performCustomDeque();
	performCustomEnque(1002.33);
	performCustomEnque(-239.33);
	performCustomDeque();
	performCustomDeque();
	performCustomDeque();
	System.out.println("\nLatest hybrid-Queue status : "+srcStack);
	}

	
	public static void performCustomEnque(double dataItem)
	{
	srcStack.push(dataItem);
	System.out.println("\n"+dataItem+" enqueued/pushed to stack.");
	}
	
	
	public static double performCustomDeque() {
	while (!srcStack.isEmpty()) {
	tempStack.push(srcStack.pop());
	}
	double tempPeekItem=tempStack.pop();
	while (!tempStack.isEmpty()) {
		   srcStack.push(tempStack.pop());
	}
	System.out.println("\n"+tempPeekItem+" item dequeued from que.");
	return tempPeekItem;
	}
	
	
	private static void pushElementsIntoArray(int sizeOfQue) {
	arrayOfQue=new double[sizeOfQue];
	Scanner scInp1Obj = new Scanner(System.in);
	for (int i = 0; i < sizeOfQue; i++) {
		System.out.print("\npush the element No " + (i + 1) + " : ");
		arrayOfQue[i]=scInp1Obj.nextDouble();
		performCustomEnque(arrayOfQue[i]);
		}
	}
	
}