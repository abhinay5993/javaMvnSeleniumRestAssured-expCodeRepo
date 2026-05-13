package com.udemy.sdetintcod.section7;
import java.util.Scanner;

public class StackDriverEx59OfTwoArrays {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.println("\nEnter the stack capacity : ");
		int stkCapacity = scin.nextInt();
		System.out.println("************************************");
		StackOfTwoArrays stackObj=new StackOfTwoArrays(stkCapacity);
		System.out.println("\nPush data to stack : ");
		for (int i = 0; i < stkCapacity; i++) {
			int dataItem=scin.nextInt();
			stackObj.pushToStack(dataItem);
		}
		stackObj.showStack();
		System.out.println("\nShow me current size of stack : "+stackObj.getCurrentSize());
		System.out.println("\nRemoving items-1 : "+stackObj.popFromStack());
		System.out.println("\nRemoving items-2 : "+stackObj.popFromStack());
		System.out.println("\nGet Peek Element of stack : "+stackObj.getStackPeek());
		stackObj.showStack();
		System.out.println("\nRemoving items-4 : "+stackObj.popFromStack());
		stackObj.showStack();
		System.out.println("\nShow me current size of stack : "+stackObj.getCurrentSize());
		System.out.println("\nEmpty Status of stack : "+stackObj.isStackEmpty());
		
		scin.close();
	}

}