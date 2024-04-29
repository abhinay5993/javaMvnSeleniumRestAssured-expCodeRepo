package com.udemy.dsapart1.linkedLists;

public class LinkedNodeEntity {
	
	private double dataValue;
	private LinkedNodeEntity nextNodeRef;
	private LinkedNodeEntity previousNodeRef;
	private LinkedNodeEntity headNodeRef;
	private LinkedNodeEntity tailNodeRef;
	private LinkedNodeEntity currentNodeRef;
	
	public LinkedNodeEntity(double dataValue) {
	this.dataValue = dataValue;
	}
	
	/**
	 * @return the dataValue
	 */
	public double getDataValue() {
	return dataValue;
	}

	/**
	 * @return the nextNodeRef
	 */
	public LinkedNodeEntity getNextNodeRef() {
	return nextNodeRef;
	}

	
	/**
	 * @return the tailNodeRef
	 */
	public LinkedNodeEntity getHeadNodeRef() {
	return headNodeRef;
	}
	
	/**
	 * @return the tailNodeRef
	 */
	public LinkedNodeEntity getTailNodeRef() {
	return tailNodeRef;
	}

	
	/**
	 * @return the currentNodeRef
	 */
	public LinkedNodeEntity getCurrentNodeRef() {
	return currentNodeRef;
	}


	/**
	 * @return the previousNodeRef
	 */
	public LinkedNodeEntity getPreviousNodeRef() {
	return previousNodeRef;
	}


	@Override
	public String toString() {
	return "LinkedNodeEntity [dataValue=" + dataValue + ", nextNodeRef=" + nextNodeRef + "]";
	}


	public void addNodeAtEndOfLinkList(double nodeDataValue) {
		LinkedNodeEntity newNodeObj = new LinkedNodeEntity(nodeDataValue);
		if (headNodeRef == null) {
			headNodeRef = newNodeObj;
			tailNodeRef = newNodeObj;
		} else {
			tailNodeRef.nextNodeRef = newNodeObj;
			newNodeObj.nextNodeRef = null;
			tailNodeRef = newNodeObj;
		}
	}
	

	/**
	 * Lecture #21 Assignment: Java program to add node at the beginning with a
	 * given value
	 * 
	 * @param nodeDataValue
	 * 
	 */
	public void addNodeAtBegeningOfLinkList(double nodeDataValue) {
		LinkedNodeEntity newNodeObj = new LinkedNodeEntity(nodeDataValue);
		if (headNodeRef == null || tailNodeRef==null) {
			headNodeRef = newNodeObj;
			tailNodeRef = newNodeObj;
		} else {
			newNodeObj.nextNodeRef=headNodeRef;
			headNodeRef=newNodeObj;
		}
	}
	
	
	public void printDataItemsOfLinkedList(LinkedNodeEntity headNodeRef) {
		LinkedNodeEntity currentNodeRef = headNodeRef;
		while (currentNodeRef != null) {
			System.out.print(""+currentNodeRef.dataValue+" --> ");
			currentNodeRef = currentNodeRef.nextNodeRef;
		}
	}
	
	
	public boolean checkIsNodeExistsWithAGivenValue(double targetValue) {
		boolean blnFlag = false;
		currentNodeRef = headNodeRef;
		while (currentNodeRef != null) {
			if (currentNodeRef.dataValue == targetValue) {
				blnFlag = true;
			}
		currentNodeRef = currentNodeRef.nextNodeRef;
		}
		return blnFlag;
	}
	
	
	public void addNodeToLinkListByIndex(double dataValue, int targetIndex) {
	LinkedNodeEntity newNodeObj = new LinkedNodeEntity(dataValue);
	int count = 1;
	LinkedNodeEntity currentNodeRef = headNodeRef;
	while (currentNodeRef != null && count != targetIndex - 1) {
	currentNodeRef = currentNodeRef.nextNodeRef;
	count++;
	}
	LinkedNodeEntity tempNode=currentNodeRef.nextNodeRef;
	currentNodeRef.nextNodeRef=newNodeObj;
	newNodeObj.nextNodeRef=tempNode;
	}
	
	
	public void removeNodeFromTail() {
		LinkedNodeEntity currentNodeRef = headNodeRef;
		if (getSizeOfLinkList() == 1) {
			headNodeRef = null;
			tailNodeRef = null;
		} else {
		while (currentNodeRef.nextNodeRef.nextNodeRef != null) {
				currentNodeRef = currentNodeRef.nextNodeRef;
		}
		currentNodeRef.nextNodeRef = null;
		tailNodeRef = currentNodeRef;
		}
	}

	
	public void removeNodeFromHead() {
		if (getSizeOfLinkList() == 1) {
			headNodeRef = null;
			tailNodeRef = null;
		} else {
			headNodeRef = headNodeRef.nextNodeRef;
		}
	}

	
	public int getSizeOfLinkList() {
	int count = 0;
	LinkedNodeEntity currentNodeRef = headNodeRef;
	while (currentNodeRef != null) {
	currentNodeRef = currentNodeRef.nextNodeRef;
	count++;
	}
	return count;
	}

	
	/**
	 * Lecture #26 Assignment: delete node at a given index
	 * 
	 * @param targetIndex
	 * 
	 */
	public void removeNodeFromLinkListByIndex(int targetIndex) {
	int count = 1;
	LinkedNodeEntity currentNodeRef = headNodeRef;
	while (currentNodeRef != null && count != targetIndex - 1) {
	currentNodeRef = currentNodeRef.nextNodeRef;
	count++;
	}
	currentNodeRef.nextNodeRef=currentNodeRef.nextNodeRef.nextNodeRef;
	}
	
	
	/**
	 * Lecture #27 Assignment Part 1 : Implementing a function to delete a node with
	 * a given value
	 * 
	 * @param targetDataValue
	 * 
	 */
	public void deleteNodeFromLinkListByValue(double targetDataValue) {
	if (headNodeRef.getDataValue() == targetDataValue) {
		removeNodeFromHead();
	} else if (tailNodeRef.getDataValue() == targetDataValue) {
		removeNodeFromTail();
	} else {
		LinkedNodeEntity currentNodeRef = headNodeRef;
		LinkedNodeEntity previousNodeRef = null;
		while (currentNodeRef != null && currentNodeRef.getDataValue() != targetDataValue) {
				previousNodeRef = currentNodeRef;
				currentNodeRef = currentNodeRef.nextNodeRef;
		}
		if (currentNodeRef == null) {
				throw new RuntimeException("the node with the given value is not found!!");
		}
		previousNodeRef.nextNodeRef = currentNodeRef.nextNodeRef;
		}
	}
	
	
	/**
	 * Lecture #27 Assignment Part 2(using the deleteNodeWithAGivenValue() function
	 * here): remove all nodes with even values
	 * 
	 */
	public void deleteAllNodesWithEvenValues() {
	LinkedNodeEntity currentNodeRef = headNodeRef;
	while (currentNodeRef != null) {
	if (currentNodeRef.getDataValue() % 2 == 0) {
	    deleteNodeFromLinkListByValue(currentNodeRef.dataValue);
	 }
	 currentNodeRef = currentNodeRef.nextNodeRef;
	 }
	}
	

	public void reverseTheDirectionOfLinkList() {
		LinkedNodeEntity currentNodeRef = headNodeRef;
		while (currentNodeRef != null) {
		nextNodeRef = currentNodeRef.nextNodeRef;
		currentNodeRef.nextNodeRef = previousNodeRef;
		previousNodeRef = currentNodeRef;
		currentNodeRef = nextNodeRef;
		}
	}
	
	
}