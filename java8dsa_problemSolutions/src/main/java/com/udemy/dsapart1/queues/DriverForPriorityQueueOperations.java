package com.udemy.dsapart1.queues;
import java.util.Arrays;
import java.util.Scanner;

public class DriverForPriorityQueueOperations {
	
	static double[] arrayOfQue;
	static CustomPriorityQueueEntity queObj;
	public static void main(String[] args) {
	Scanner scInpObj = new Scanner(System.in);
	System.out.print("\nEnter the size of Que : ");
	int sizeOfQue = scInpObj.nextInt();
	queObj=new CustomPriorityQueueEntity(sizeOfQue);
	pushElementsIntoArray(sizeOfQue);
	System.out.println("\nNew Priority Sorted Queue after enqueue operation : "+Arrays.toString(queObj.getDataItem()));
	System.out.println("\nLatest size of Priority Queue : "+queObj.getSizeOfQue());
	queObj.priorityDequeOperation();
	queObj.priorityDequeOperation();
	queObj.priorityDequeOperation();
	System.out.println("\nLatest size of Priority Queue : "+queObj.getSizeOfQue());
	System.out.println("\nNew Priority Sorted Queue after dequeue operation : "+Arrays.toString(queObj.getDataItem()));
	queObj.priorityEnqueueOperation(500.001);
	queObj.priorityEnqueueOperation(9001);
	System.out.println("\nNew Priority Sorted Queue after Enqueue operation : "+Arrays.toString(queObj.getDataItem()));
	System.out.println("\nLatest size of Priority Queue : "+queObj.getSizeOfQue());
	}

	
	private static void pushElementsIntoArray(int sizeOfQue) {
	arrayOfQue=new double[sizeOfQue];
	Scanner scInp1Obj = new Scanner(System.in);
	for (int i = 0; i < sizeOfQue; i++) {
		System.out.print("\npush the element No " + (i + 1) + " : ");
		arrayOfQue[i]=scInp1Obj.nextDouble();
		queObj.priorityEnqueueOperation(arrayOfQue[i]);
		}
	}
	
}