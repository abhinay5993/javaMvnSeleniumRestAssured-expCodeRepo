package com.udemy.dsapart1.queues;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReversingQueueUsingStack {
	
	static double[] arrayOfQue;
	static Queue<Double> doubleQueue; 
	
	public static void main(String[] args) {
	Scanner scInpObj = new Scanner(System.in);
	System.out.print("\nEnter the size of Que : ");
	int sizeOfQue = scInpObj.nextInt();
	doubleQueue=new ArrayDeque<>();
	pushElementsIntoArray(sizeOfQue);
	System.out.println("\nInput initial ArrayDeque Items : "+doubleQueue);
	System.out.println("\nResultant Revered ArrayDeque Items : "+doReverseItemsOfArrayDeque(doubleQueue));
	}
	
	
	private static ArrayDeque<Double> doReverseItemsOfArrayDeque(Queue<Double> srcArrayDqueue) {
	Stack<Double> tempStack = new Stack<>();
	while (!srcArrayDqueue.isEmpty()) {
		   tempStack.push(srcArrayDqueue.poll());
	}
	while (!tempStack.isEmpty()) {
		   srcArrayDqueue.add(tempStack.pop());
	 }
	return (ArrayDeque<Double>) srcArrayDqueue;
	}


	private static void pushElementsIntoArray(int sizeOfQue) {
	arrayOfQue=new double[sizeOfQue];
	Scanner scInp1Obj = new Scanner(System.in);
	for (int i = 0; i < sizeOfQue; i++) {
		System.out.print("\npush the element No " + (i + 1) + " : ");
		arrayOfQue[i]=scInp1Obj.nextDouble();
		doubleQueue.add(arrayOfQue[i]);
		}
	}

}