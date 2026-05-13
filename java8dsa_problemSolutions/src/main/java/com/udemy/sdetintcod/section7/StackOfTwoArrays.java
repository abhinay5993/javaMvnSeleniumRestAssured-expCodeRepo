package com.udemy.sdetintcod.section7;

/**
 * Entity representation for stack implementations
 * 
 */
public class StackOfTwoArrays {

	// max size of stack
	private int capacity;
	// current size of stack
	private int size;
	// index of top element of stack
	private int stackTop;
	// to hold stack data.
	private int[] dataArray;
	// Auxiliary array to keep track of stack index.
	private int[] indexArray;

	// Constructor of type
	public StackOfTwoArrays(int capacity) {
		this.capacity = capacity;
		// space allocation of data array
		this.dataArray = new int[capacity];
		// space allocation of Auxiliary index array
		this.indexArray = new int[capacity];
		// initialization current size of stack
		this.size = 0;
		// initialization of top elements position.
		this.stackTop = -1;
		System.out.println("\nStack initialized with initial capacity : " + capacity);
	}

	public boolean isStackEmpty() {
		return (size == 0);
	}

	public int getCurrentSize() {
		return size;
	}

	public void pushToStack(int dataValue) {
		if (size >= capacity) {
			System.out.println("\nStack is overflowed! - unable to push item.");
			return;
		}
		stackTop++;
		dataArray[stackTop] = dataValue;
		indexArray[stackTop] = stackTop;
		size++;
		System.out.println("\nValue : " + dataValue + " pushed to stack.");
	}

	public int popFromStack() {
		if (size == 0) {
			System.out.println("\nStack is Empty!..");
			return -1;
		}
		int popedValued = dataArray[stackTop];
		stackTop--;
		size--;
		System.out.println("\nValue : " + popedValued + " removed/pop-out from top of stack.");
		return popedValued;
	}

	public int getStackPeek() {
		if (size == 0) {
			System.out.println("\nStack is Empty!..");
			return -1;
		}
		int peekElement = dataArray[stackTop];
		System.out.println("\nValue : " + peekElement + " peeked at top of stack.");
		return peekElement;
	}

	public void showStack() {
		System.out.println("**************************************");
		System.out.println("\nContent of data-array : ");
		for (int i = 0; i < getCurrentSize(); i++) {
			System.out.print(dataArray[i] + ", ");
		}
		System.out.println(" ");
		System.out.println("\nContent of index-array : ");
		for (int i = 0; i < getCurrentSize(); i++) {
			System.out.print(indexArray[i] + ", ");
		}
		System.out.println("\n");
	}

}