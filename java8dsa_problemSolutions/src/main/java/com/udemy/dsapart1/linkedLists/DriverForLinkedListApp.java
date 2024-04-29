package com.udemy.dsapart1.linkedLists;

public class DriverForLinkedListApp {
	
	public static void main(String[] args) {
	LinkedNodeEntity nodeObj=new LinkedNodeEntity(384.34);
	System.out.println("First Node : "+nodeObj);
	System.out.println("\nAfter adding 1st node to LinkedList : ");
	nodeObj.printDataItemsOfLinkedList(nodeObj);
	
	nodeObj.addNodeAtEndOfLinkList(-34.4);
	nodeObj.addNodeAtEndOfLinkList(394.4);
	nodeObj.addNodeAtEndOfLinkList(0.344);
	nodeObj.addNodeAtEndOfLinkList(540.34);
	nodeObj.addNodeAtEndOfLinkList(349.340);
	nodeObj.addNodeAtEndOfLinkList(100);
	System.out.println("\n");
	System.out.println("\nAfter adding multiple nodes to LinkedList : ");
	System.out.println("************************************************");
	nodeObj.printDataItemsOfLinkedList(nodeObj.getHeadNodeRef());
	System.out.println("\nHead Node - "+nodeObj.getHeadNodeRef().getDataValue());
	System.out.println("\nTail Node - "+nodeObj.getTailNodeRef().getTailNodeRef());
	System.out.println("\nCheck is the node with Value : 0.344 is exists into linkedList - "+nodeObj.checkIsNodeExistsWithAGivenValue(0.344));
	System.out.println("\nCheck is the node with Value : 73 is exists into linkedList - "+nodeObj.checkIsNodeExistsWithAGivenValue(73));
	System.out.println("\n");
	nodeObj.addNodeAtBegeningOfLinkList(44);
	nodeObj.addNodeAtBegeningOfLinkList(11);
	nodeObj.addNodeAtBegeningOfLinkList(2);
	nodeObj.addNodeAtBegeningOfLinkList(22);
	System.out.println("\nAfter adding multiple nodes at the begening of LinkedList : ");
	System.out.println("******************************************************************");
	nodeObj.printDataItemsOfLinkedList(nodeObj.getHeadNodeRef());
	
	System.out.println(" ");
	System.out.println("\nAdding nodes at the given index of LinkedList : ");
	System.out.println("***************************************************");
	nodeObj.addNodeToLinkListByIndex(555,5);
	System.out.println(" ");
	nodeObj.printDataItemsOfLinkedList(nodeObj.getHeadNodeRef());
	System.out.println("\nTotal size of linkList : "+nodeObj.getSizeOfLinkList());
	
	System.out.println(" ");
	System.out.println("\nRemoving node from head/begening of LinkedList : ");
	System.out.println("*****************************************************");
	nodeObj.removeNodeFromHead();
	nodeObj.removeNodeFromHead();
	System.out.println("\n2 nodes deleted from begening..\n");
	nodeObj.printDataItemsOfLinkedList(nodeObj.getHeadNodeRef());
	System.out.println("\nLatest size of linkList : "+nodeObj.getSizeOfLinkList());
	
	System.out.println(" ");
	System.out.println("\nRemoving node from tail of LinkedList : ");
	System.out.println("*******************************************");
	nodeObj.removeNodeFromTail();
	nodeObj.removeNodeFromTail();
	System.out.println("\n2 nodes deleted from tail.\n");
	nodeObj.printDataItemsOfLinkedList(nodeObj.getHeadNodeRef());
	System.out.println("\nLatest size of linkList : "+nodeObj.getSizeOfLinkList());
	
	System.out.println(" ");
	System.out.println("\nRemoving node with even data value from LinkedList : ");
	System.out.println("********************************************************");
	nodeObj.deleteAllNodesWithEvenValues();
	System.out.println("\nnodes deleted from linkList.\n");
	nodeObj.printDataItemsOfLinkedList(nodeObj.getHeadNodeRef());
	System.out.println("\nLatest size of linkList : "+nodeObj.getSizeOfLinkList());
	
	System.out.println(" ");
	System.out.println("\nDelete node against a data value from LinkedList : ");
	System.out.println("*****************************************************");
	nodeObj.deleteNodeFromLinkListByValue(-34.4);
	System.out.println("\nnode with value '-34.4' deleted from linkList.\n");
	nodeObj.printDataItemsOfLinkedList(nodeObj.getHeadNodeRef());
	System.out.println("\nLatest size of linkList : "+nodeObj.getSizeOfLinkList());
	
	System.out.println(" ");
	System.out.println("\nReverse the LinkedList : ");
	System.out.println("***************************");
	nodeObj.reverseTheDirectionOfLinkList();
	nodeObj.printDataItemsOfLinkedList(nodeObj.getPreviousNodeRef());
	System.out.println("\nHead Node - "+nodeObj.getPreviousNodeRef().getDataValue());
	System.out.println("\nTail Node - "+nodeObj.getPreviousNodeRef().getTailNodeRef());
	
	}

}