package com.udayan.dsa.lists;

import com.udayan.dsa.Node;

public class LoopTest {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		  
		  myLinkedList.append(2); 
		  myLinkedList.append(3); 
		  myLinkedList.append(4);
		  myLinkedList.append(5);
		  myLinkedList.append(6);
		  myLinkedList.append(7);
		  
		  myLinkedList.getHead().getNext().getNext().setNext(myLinkedList.getHead().getNext());
		  boolean hasLoop = hasLoop(myLinkedList);
		  System.out.println(myLinkedList.getHead().getNext().getNext().getNext().getValue());
		  System.out.println("hasLoop = "+hasLoop);
		}

	private static boolean hasLoop(LinkedList myLinkedList) {
		Node slow = myLinkedList.getHead();
		Node fast = myLinkedList.getHead();
		while(fast != null && fast.getNext() != null) {
			slow =  slow.getNext();
			fast = fast.getNext().getNext();
			if(fast == slow) return true;
		}
		return false;
	}
}
