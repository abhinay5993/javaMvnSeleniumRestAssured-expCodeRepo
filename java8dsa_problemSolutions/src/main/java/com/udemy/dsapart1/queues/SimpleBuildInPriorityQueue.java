package com.udemy.dsapart1.queues;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class SimpleBuildInPriorityQueue {

	static double[] arrayOfQue;
	static Queue<Double> priorQue; 
	
	public static void main(String[] args) {
	Scanner scInpObj = new Scanner(System.in);
	System.out.print("\nEnter the size of Que : ");
	int sizeOfQue = scInpObj.nextInt();
	priorQue=new PriorityQueue<>();
	pushElementsIntoArray(sizeOfQue);
	System.out.println("\nInput initial Priority Queue Items : "+priorQue);
	System.out.println("\nItem removed : "+priorQue.remove());
	System.out.println("\nItem removed : "+priorQue.remove());
	System.out.println("\nNew Item 3934.394 added : "+priorQue.add(3934.394));
	System.out.println("\nNew Item -39.394 added : "+priorQue.add(-39.394));
	System.out.println("\nLatest peeked item : "+priorQue.peek());
	System.out.println("\nNew Item 5000.20 added : "+priorQue.add(5000.20));
	System.out.println("\nLatest peeked item : "+priorQue.peek());
	System.out.println("\nItem removed : "+priorQue.remove());
	System.out.println("\nFinal latest updated Priority Queue Items : "+priorQue);
	}
	
	
	private static void pushElementsIntoArray(int sizeOfQue) {
	arrayOfQue=new double[sizeOfQue];
	Scanner scInp1Obj = new Scanner(System.in);
	for (int i = 0; i < sizeOfQue; i++) {
		System.out.print("\npush the element No " + (i + 1) + " : ");
		arrayOfQue[i]=scInp1Obj.nextDouble();
		priorQue.add(arrayOfQue[i]);
		}
	}
	
}