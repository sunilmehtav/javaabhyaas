package com.udayan.dsa.lists;

public class Main {

	public static void main(String[] args) {
		
	  LinkedList myLinkedList = new LinkedList(4);
	  
	  myLinkedList.append(11); myLinkedList.append(13); myLinkedList.append(7);
	  printList(myLinkedList);
	  
	  myLinkedList.prepend(10); myLinkedList.prepend(8); printList(myLinkedList);
	  
	  myLinkedList.removeLast(); myLinkedList.removeLast();
	  printList(myLinkedList);
		 
        
        System.out.println("Second List : \n");
        LinkedList myLinkedList2 = new LinkedList(4);
        myLinkedList2.append(11);
        printList(myLinkedList2);
        myLinkedList2.removeLast();
        printList(myLinkedList2);
        myLinkedList2.removeLast();
        printList(myLinkedList2);
        
        System.out.println(myLinkedList2.removeFirst());
        myLinkedList2.append(11);
        System.out.println(myLinkedList2.removeFirst());
        myLinkedList2.append(11);
        myLinkedList2.append(12);
        
        printList(myLinkedList2);
	}
	
	private static void printList(LinkedList myLinkedList) {
		System.out.println("Linked List: ");
        myLinkedList.printList();
        myLinkedList.getLength();
        System.out.println();
	}
	
}
