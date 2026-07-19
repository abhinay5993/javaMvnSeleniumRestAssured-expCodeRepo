package com.udemy.autocodinground.prep26.lnklist;

public class CustomLinkedListEntity<T> {
	
	LinkedNode<?> headNode=null;
	LinkedNode<?> tailNode=null;
	private int size;
	
	/**
	 * @return the headNode
	 */
	public LinkedNode<?> getHeadNode() {
		return headNode;
	}
	
	/**
	 * @return the tailNode
	 */
	public LinkedNode<?> getTailNode() {
		return tailNode;
	}
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	
	public void insertAtHead(T inptData) {
		LinkedNode<T> currentTmpNd = new LinkedNode<>(inptData);
		if (headNode == null) {
			insertAtTail(inptData);
		} else {
			currentTmpNd.setNextRef(headNode);
			headNode = currentTmpNd;
			size++;
		}
	}
	
	public void insertAtTail(T inptData) {
		LinkedNode<T> currentTmpNd = new LinkedNode<>(inptData);
		if (headNode == null) {
		headNode=tailNode=currentTmpNd;
		} else {
		tailNode.setNextRef(currentTmpNd);
		}
		tailNode=currentTmpNd;
		size++;
	}
	
	
	public void insertAt(int index,T inptData) {
		if (index==0) {
		insertAtHead(inptData);
		return;
		}
		if (index==getSize()) {
		insertAtTail(inptData);
		return;
		}
		if (index<0 || index>getSize()) {
		System.out.println("\nInsertion not possible!!..");
		return;
		}
	    LinkedNode<?> currentTempHead=headNode;	
		LinkedNode<?> newNode = new LinkedNode<>(inptData);
		for (int i=1; i<=index-1; i++) {
		currentTempHead=currentTempHead.getNextRef();
		}
		newNode.getNextRef().setNextRef(currentTempHead.getNextRef());
		currentTempHead.getNextRef().setNextRef(newNode);
		
		size++;
	}
	
	
	public void removeAt(int index) {
		if (index==0) {
		headNode.setNextRef(headNode.getNextRef());
		size--;
		return;
		}
		if (index<0 || index>getSize()) {
		System.out.println("Insertion not possible!!..");
		return;
		}
		LinkedNode<?> currentTempHead=headNode;
		for (int i=1; i<=index-1; i++) {
		currentTempHead=currentTempHead.getNextRef();
		}
		currentTempHead.getNextRef().setNextRef(currentTempHead.getNextRef().getNextRef());
		headNode=currentTempHead;
		
		size--;
	}
	
	public void viewLinkLists() {
		System.out.println("\nExisting link-List item count : " + getSize());
		LinkedNode<?> currentTempHead = headNode;
		while (currentTempHead != null) {
		System.out.print(currentTempHead.getDataItem() + "--> ");
		currentTempHead = currentTempHead.getNextRef();
		}
		System.out.println(" ");
	}
	
	
	public void viewLinkLists(LinkedNode<?> headNode) {
		System.out.println("\nHead-Passed Existing link-List item count : " + getSize());
		LinkedNode<?> currentTempHead = headNode;
		while (currentTempHead != null) {
		System.out.print(currentTempHead.getDataItem() + "--> ");
		currentTempHead = currentTempHead.getNextRef();
		}
		System.out.println(" ");
	}

}