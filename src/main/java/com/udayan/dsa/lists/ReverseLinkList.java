package com.udayan.dsa.lists;

public class ReverseLinkList {

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		  
	  myLinkedList.append(2); 
	  myLinkedList.append(3); 
	  myLinkedList.append(4);
	 
	  printList(myLinkedList);
	  
	  myLinkedList.reverseLinkList();
	  
	  printList(myLinkedList);
	}
	

	private static void printList(LinkedList myLinkedList) {
		System.out.println("Linked List: ");
        myLinkedList.printList();
        System.out.println();
	}

}
