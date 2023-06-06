package com.udayan.dsa.lists;

import com.udayan.dsa.Node;

public class Main {

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.append(11);
        myLinkedList.append(13);
        myLinkedList.append(7);
        myLinkedList.printList();
	}
	
}
