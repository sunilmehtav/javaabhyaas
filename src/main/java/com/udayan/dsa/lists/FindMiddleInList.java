package com.udayan.dsa.lists;

import com.udayan.dsa.Node;

public class FindMiddleInList {
	public static void main(String[] args) {
	LinkedList myLinkedList = new LinkedList(1);
	  
	  myLinkedList.append(2); 
	  myLinkedList.append(3); 
	  myLinkedList.append(4);
	  myLinkedList.append(5);
	  myLinkedList.append(6);
	  myLinkedList.append(7);
	  
	 
	  printList(myLinkedList);
	  
	  Node middleNode = findMiddleInList(myLinkedList);
	  
	  System.out.println("Node value = "+middleNode.getValue());
	}
	private static Node findMiddleInList(LinkedList myLinkedList) {
		Node slow = myLinkedList.getHead();
		Node fast = myLinkedList.getHead();
		while(fast != null && fast.getNext() != null) {
			slow =  slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;
	}
	private static void printList(LinkedList myLinkedList) {
		System.out.println("Linked List: ");
	    System.out.println();
	}
}
