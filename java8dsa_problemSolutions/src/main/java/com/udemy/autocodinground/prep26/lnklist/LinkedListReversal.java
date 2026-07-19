package com.udemy.autocodinground.prep26.lnklist;

public class LinkedListReversal {

	public static void main(String[] args) {
	CustomLinkedListEntity<Integer> lnkObjs=new CustomLinkedListEntity<>();
	lnkObjs.insertAtHead(0);
	lnkObjs.insertAt(1,50);
	lnkObjs.insertAt(2,100);
	lnkObjs.insertAt(3,150);
	lnkObjs.insertAt(4,200);
	lnkObjs.insertAt(5,250);
	lnkObjs.insertAtTail(500);
	lnkObjs.insertAt(7,300);
	lnkObjs.insertAtHead(25);
	lnkObjs.viewLinkLists();
	LinkedNode<?> currentTempHead=lnkObjs.getHeadNode();
	LinkedNode<?> revLnkListHead=performLinkedListReversal(currentTempHead);
	
	System.out.println("\nThe reversed linked-List :");
	lnkObjs.viewLinkLists(revLnkListHead);
	}

	private static LinkedNode<?> performLinkedListReversal(LinkedNode<?> currentHead) {
		if (currentHead==null || currentHead.getNextRef()==null) {
			return currentHead;
		}
		LinkedNode<?> currentNode = currentHead;
		LinkedNode<?> prevNode = null;
		LinkedNode<?> afterNode = null;

		while (currentNode != null) {
			afterNode = currentNode.getNextRef();
			currentNode.setNextRef(prevNode);
			prevNode = currentNode;
			currentNode = afterNode;
		}
		return prevNode;
	}

}