package com.guvi.dsalgo;
import java.util.Arrays;
import java.util.Scanner;

public class GuviQueueDequeueImp {
	
	private int sizeOfArray;
	private Object[] dataHolder;
	static GuviQueueDequeueImp obj;
	int frontHeadPos=-1;
	int rearTailPos=-1;
	
	public int getSizeOfArray() {
		return sizeOfArray;
	}
	
	public Object[] getDataHolder() {
		return dataHolder;
	}
	
	public boolean isQueEmpty()
	{
	return (dataHolder.length==0);
	}
	
	public boolean checkArrayCapacityIsFull() {
		boolean status = ((rearTailPos+1)% dataHolder.length)==frontHeadPos;
		return status;
	}
	
	public void setSizeOfArray(int sizeOfArray) {
		this.sizeOfArray = sizeOfArray;
		this.dataHolder=new Object[sizeOfArray];
	}
	
	public static void addInitialDataIntoArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array : ");
		int arrSize = Integer.parseInt(sc.nextLine());
		obj = new GuviQueueDequeueImp();
		obj.setSizeOfArray(arrSize);
		System.out.println("\nEnter the Items : ");
		for (int i = 0; i < obj.getSizeOfArray(); i++) {
			obj.dataHolder[i] = sc.nextLine();
		}
		System.out.println("\nAvaiable data into Array : "+Arrays.toString(obj.getDataHolder()));
	}
	
	public void pushEnque(Object obj) {
		if (this.checkArrayCapacityIsFull()) {
			System.out.println("\nQue is FULL!!!...");
		} else if (this.isQueEmpty()) {
			frontHeadPos = rearTailPos = 0;
		} else {
			rearTailPos = ((rearTailPos + 1) % dataHolder.length);
			dataHolder[rearTailPos] = obj;
			sizeOfArray++;
		}
		System.out.println("\nItem Inserted : " + obj);
	}
	
	
	public void popDeque() {
		Object delObj = null;
		if (this.isQueEmpty()) {
			System.out.println("\nQue is Empty !!!");
		} else if (frontHeadPos == rearTailPos) {
			frontHeadPos=rearTailPos=-1;
		} else {
			frontHeadPos = ((frontHeadPos + 1) % dataHolder.length);
			delObj = this.dataHolder[frontHeadPos];
			sizeOfArray--;
		}
		System.out.println("\nItem Deleted : " + delObj);
	}
	
	public static void main(GuviCustStringExps[] args) {
		addInitialDataIntoArray();
		obj.pushEnque(377);
		obj.pushEnque(null);
		obj.pushEnque(-93439);
		obj.pushEnque("@*&$*&");
		obj.pushEnque("atif");
		System.out.println("\nAvaiable data into Array : "+Arrays.toString(obj.getDataHolder()));
		obj.popDeque();
		obj.popDeque();
		obj.popDeque();
		System.out.println("\nAvaiable data into Array : "+Arrays.toString(obj.getDataHolder()));
	}
	
}