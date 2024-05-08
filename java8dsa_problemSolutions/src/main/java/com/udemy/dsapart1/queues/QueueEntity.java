package com.udemy.dsapart1.queues;

public class QueueEntity {
	
	private double[] dataItem;
	private int rearIndex;
	private int sizeOfQue;
	
	public QueueEntity(int sizeOfQue) {
	this.rearIndex = -1;
	this.dataItem=new double[sizeOfQue];
	}
	

	/**
	 * @return the rearIndex
	 */
	public int getRearIndex() {
	return rearIndex;
	}

	/**
	 * @return the sizeOfQue
	 */
	public int getSizeOfQue() {
	return sizeOfQue;
	}

	
	public void doEnqueInsertElement(double inputData) {
	rearIndex++;
	dataItem[rearIndex] = inputData;
	sizeOfQue++;
	System.out.println("\n"+inputData+" value enqued to que.");
	}
	
	
	public double doDequeRemoveElement() {
	double tempDequeElement = dataItem[0];
	for (int i = 0; i <rearIndex; i++) {
	dataItem[i] = dataItem[i + 1];
	}
	dataItem[rearIndex--]=0;
	sizeOfQue--;
	System.out.println("\n"+tempDequeElement+" item dequed from que.");
	return tempDequeElement;
	}

	
	/**
	 * @return the dataItem
	 */
	public double[] getDataItem() {
	return dataItem;
	}
	
}