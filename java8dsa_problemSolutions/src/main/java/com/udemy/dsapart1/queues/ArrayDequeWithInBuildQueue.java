package com.udemy.dsapart1.queues;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ArrayDequeWithInBuildQueue {

	static double[] arrayOfQue;
	static Queue<Double> doubleQueue; 
	
	public static void main(String[] args) {
	Scanner scInpObj = new Scanner(System.in);
	System.out.print("\nEnter the size of Que : ");
	int sizeOfQue = scInpObj.nextInt();
	doubleQueue=new ArrayDeque<>();
	pushElementsIntoArray(sizeOfQue);
	System.out.println("\nInput initial ArrayDeque Items : "+doubleQueue);
	System.out.println("\nItem removed : "+doubleQueue.remove());
	System.out.println("\nItem removed : "+doubleQueue.remove());
	System.out.println("\nNew Item 3934.394 added : "+doubleQueue.add(3934.394));
	System.out.println("\nNew Item -39.394 added : "+doubleQueue.add(-39.394));
	System.out.println("\nLatest peeked item : "+doubleQueue.peek());
	System.out.println("\nNew Item 5000.20 added : "+doubleQueue.add(5000.20));
	System.out.println("\nLatest peeked item : "+doubleQueue.peek());
	System.out.println("\nItem removed : "+doubleQueue.remove());
	System.out.println("\nFinal latest updated ArrayDeque Items : "+doubleQueue);
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