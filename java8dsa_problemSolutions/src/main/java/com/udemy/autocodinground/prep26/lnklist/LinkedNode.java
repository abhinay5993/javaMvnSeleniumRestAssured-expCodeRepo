package com.udemy.autocodinground.prep26.lnklist;

public class LinkedNode<T> {

	private T dataItem;
	private LinkedNode<?> nextRef;
	
	public LinkedNode(T dataItem) {
		this.dataItem = dataItem;
	}

	/**
	 * @return the dataItem
	 */
	public T getDataItem() {
		return dataItem;
	}

	/**
	 * @return the nextRef
	 */
	public LinkedNode<?> getNextRef() {
		return nextRef;
	}

	/**
	 * @param nextRef the nextRef to set
	 */
	public void setNextRef(LinkedNode<?> nextRef) {
		this.nextRef = nextRef;
	}

}