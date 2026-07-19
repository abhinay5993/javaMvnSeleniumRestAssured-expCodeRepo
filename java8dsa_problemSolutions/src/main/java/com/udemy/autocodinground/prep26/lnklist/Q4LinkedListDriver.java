package com.udemy.autocodinground.prep26.lnklist;

public class Q4LinkedListDriver {

	public static void main(String[] args) {
	CustomLinkedListEntity<Integer> custObj1=new CustomLinkedListEntity<>();
	custObj1.insertAtHead(2939);
	custObj1.insertAtTail(6666);
	custObj1.insertAt(2,99000);
	custObj1.insertAt(3,111111);
	custObj1.insertAt(4,121);
	custObj1.insertAt(5,33333);
	custObj1.viewLinkLists();
	
	CustomLinkedListEntity<String> custObj2=new CustomLinkedListEntity<>();
	custObj2.insertAtHead("SDET");
	custObj2.insertAtHead("Atif");
	custObj2.insertAtTail("ITCI");
	custObj2.insertAtHead("ANDROID-16");
	custObj2.insertAt(4,"Java-17-SDK");
	custObj2.insertAt(5,"Carat:ame");
	custObj2.insertAtTail("Abhinay");
	custObj2.viewLinkLists();
	custObj2.removeAt(3);
	custObj2.removeAt(2);
	custObj2.viewLinkLists();
	}

}