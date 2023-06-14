package com.udayan.dsa.lists;

import java.util.HashSet;
import java.util.Set;

import com.udayan.dsa.Node;

public class RemoveDuplicates {

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		int arr[] = new int[] {2,1,7,8,2,7,3};
		for(int i =0; i<=arr.length -1 ; i++) {
		  myLinkedList.append(arr[i]); 
		}
		myLinkedList.printList();
		
		removeDuplicates(myLinkedList);
		
		myLinkedList.printList();

	}

	private static void removeDuplicates(LinkedList myLinkedList) {
		Set<Integer> values = new HashSet<>();
        Node previous = null;
        Node current = myLinkedList.getHead();
        while (current != null) {
            if (values.contains(current.getValue())) {
                previous.setNext(current.getNext());
                myLinkedList.setLength(myLinkedList.getLength()-1);
            } else {
                values.add(current.getValue());
                previous = current;
            }
            current = current.getNext();
        }
		
	}

}
