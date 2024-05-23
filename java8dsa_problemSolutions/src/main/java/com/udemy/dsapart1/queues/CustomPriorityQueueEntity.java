package com.udemy.dsapart1.queues;

public class CustomPriorityQueueEntity {
	
	private double[] dataItem;
	private int rearIndex;
	private int sizeOfQue;
	
	public CustomPriorityQueueEntity(int sizeOfQue) {
	this.rearIndex = -1;
	this.sizeOfQue=sizeOfQue;
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

	
	public void priorityEnqueueOperation(double inputData) {
	if (rearIndex == -1) {
		rearIndex++;
		dataItem[rearIndex] = inputData;
	} else {
		for (int i = rearIndex; i >=0; i--) 
		{
		if (dataItem[i] > inputData) {
		    dataItem[i + 1] = dataItem[i];
			dataItem[i]=(i==0)?inputData:dataItem[i];
			} else {
			dataItem[i + 1] = inputData;
			break;
			}
		}
	rearIndex++;
	}
	sizeOfQue++;
	System.out.println("\n" + inputData + " value enqued to que.");
	}
	
	
	public double priorityDequeOperation() {
	double tempDequeElement = dataItem[0];
	for (int i = 0; i <rearIndex; i++) {
    dataItem[i]=dataItem[i+1];
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