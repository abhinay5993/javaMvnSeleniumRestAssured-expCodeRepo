package com.udemy.dsapart1.queues;
import java.util.Arrays;
import java.util.Scanner;

public class DriverForQueueOperations {
	
	static double[] arrayOfQue;
	static QueueEntity queObj;
	public static void main(String[] args) {
	Scanner scInpObj = new Scanner(System.in);
	System.out.print("\nEnter the size of Que : ");
	int sizeOfQue = scInpObj.nextInt();
	queObj=new QueueEntity(sizeOfQue);
	pushElementsIntoArray(sizeOfQue);
	System.out.println("\nNew Que after enqueue operation : "+Arrays.toString(queObj.getDataItem()));
	queObj.doDequeRemoveElement();
	queObj.doDequeRemoveElement();
	queObj.doDequeRemoveElement();
	System.out.println("\nNew Que after dequeue operation : "+Arrays.toString(queObj.getDataItem()));
	queObj.doEnqueInsertElement(48.34);
	queObj.doEnqueInsertElement(5000.34);
	System.out.println("\nNew Que after Enqueue operation : "+Arrays.toString(queObj.getDataItem()));
	System.out.println("\nLatest size of Queue : "+queObj.getSizeOfQue());
	}

	
	private static void pushElementsIntoArray(int sizeOfQue) {
	arrayOfQue=new double[sizeOfQue];
	Scanner scInp1Obj = new Scanner(System.in);
	for (int i = 0; i < sizeOfQue; i++) {
		System.out.print("\npush the element No " + (i + 1) + " : ");
		arrayOfQue[i]=scInp1Obj.nextDouble();
		queObj.doEnqueInsertElement(arrayOfQue[i]);
		}
	}
	
}