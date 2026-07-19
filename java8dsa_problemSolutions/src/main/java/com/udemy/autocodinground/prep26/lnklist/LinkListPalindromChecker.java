package com.udemy.autocodinground.prep26.lnklist;

public class LinkListPalindromChecker {

	public static void main(String[] args) {
		CustomLinkedListEntity<Integer> lnkObjs=new CustomLinkedListEntity<>();
		lnkObjs.insertAtHead(1);
		lnkObjs.insertAt(1,2);
		lnkObjs.insertAt(2,3);
		lnkObjs.insertAt(3,2);
		lnkObjs.insertAtTail(1);
		lnkObjs.viewLinkLists();
		String palStatus=(isLinkListPalindrom(lnkObjs.getHeadNode()))?"is Palindrom.":"not Palindrom.";
		System.out.println(palStatus);
		
		CustomLinkedListEntity<Integer> lnk2Objs=new CustomLinkedListEntity<>();
		lnk2Objs.insertAtHead(1);
		lnk2Objs.insertAt(1,2);
		lnk2Objs.insertAtTail(3);
		lnk2Objs.viewLinkLists();
		String pal2Status=(isLinkListPalindrom(lnk2Objs.getHeadNode()))?"is Palindrom.":"not Palindrom.";
		System.out.println(pal2Status);
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
	
	
	private static LinkedNode<?> getMidNode(LinkedNode<?> currentHead) {
		LinkedNode<?> slowNode = currentHead;
		LinkedNode<?> fastNode = currentHead;
		
		while (fastNode != null && fastNode.getNextRef() != null) {
			slowNode = slowNode.getNextRef();
			fastNode = fastNode.getNextRef().getNextRef();
		}
		return slowNode;
	}
	
	private static boolean isLinkListPalindrom(LinkedNode<?> currentHead) {
		boolean result = true;
		LinkedNode<?> p1 = currentHead;
		LinkedNode<?> midNode = getMidNode(currentHead);
		LinkedNode<?> p2 = performLinkedListReversal(midNode);
		
		while (p2 != null) {
			if (p1.getDataItem() != p2.getDataItem()) {
				return result = false;
			}
			p1 = p1.getNextRef();
			p2 = p2.getNextRef();
		}
		return result;
	}
	
}