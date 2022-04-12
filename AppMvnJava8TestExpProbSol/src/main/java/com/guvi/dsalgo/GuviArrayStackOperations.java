package com.guvi.dsalgo;
import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;

//this algorithms deals with Stack Operation of Array
public class GuviArrayStackOperations {
	
	static GuviArrayStackOperations obj;
	private int sizeOfArray;
	private int top;
	
	private Object[] dataHolder;

	public int getSizeOfArray() {
		return sizeOfArray;
	}
	
	public Object[] getDataHolder() {
		return dataHolder;
	}
	
	public final void setSizeOfArray(int sizeOfArray) {
		this.top=-1;
		this.sizeOfArray = sizeOfArray;
		this.dataHolder=new Object[sizeOfArray];
	}
	
	public static void addInitialDataIntoStackSpace() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Stack Array : ");
		int arrSize = Integer.parseInt(sc.nextLine());
		obj = new GuviArrayStackOperations();
		obj.setSizeOfArray(arrSize);
		System.out.println("\nEnter the Items : ");
		for (int i = 0; i < obj.getSizeOfArray(); i++) {
			obj.pushObject(sc.nextLine());
		}
		System.out.println("\nAvaiable data into Stack : "+Arrays.toString(obj.getDataHolder()));
	}
	
	public static void main(String[] args) {
		addInitialDataIntoStackSpace();
		
		System.out.println("\nData Exists in Array : "+Arrays.asList(obj.getDataHolder()));
		obj.pushObject("atifAlsam");
		System.out.println("\nData Exists in Array : "+Arrays.asList(obj.getDataHolder()));
		obj.popObject();
		System.out.println("\nData Exists in Array : "+Arrays.asList(obj.getDataHolder()));
		obj.popObject();
		System.out.println("\nData Exists in Array : "+Arrays.asList(obj.getDataHolder()));
		System.out.println("\nCheck EmptyNess Status : "+obj.isStackEmpty());
		System.out.println("\nPeek/Top Object value of Stack : "+obj.peekFromTop());
		
	}
	
	
	public boolean isStackEmpty() {
		boolean flagVal = false;
		if (this.top<0) {
			System.out.println("\nStack is Empty!!..");
			flagVal = true;
		} else {
			System.out.println("\nStack is not Empty!!..");
		}
		return flagVal;
	}

	public void pushObject(Object objData) {
		if (top >= getSizeOfArray() - 1) {
			System.out.println("\nStack OverFlowed!!!..");
		} else {
			this.dataHolder[++top] = objData;
			System.out.println("\nItem pushed to Stack : " + String.valueOf(objData));
		}
	}
	
	public void popObject() {
		if (isStackEmpty()) {
			System.out.println("\nStack UnderFlowed!!!..");
		} else {
			System.out.println("\nItem Poped/deleted from Stack : " +dataHolder[top]);
			this.dataHolder=ArrayUtils.remove(obj.getDataHolder(),top);
			top--;
		}
	}
	
	public Object peekFromTop() {
		System.out.println("\npeek or top from Stack : " + String.valueOf(this.dataHolder[top]));
		return this.dataHolder[top];
	}
	
}