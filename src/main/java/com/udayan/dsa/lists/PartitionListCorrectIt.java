package com.udayan.dsa.lists;

import com.udayan.dsa.Node;

public class PartitionListCorrectIt {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        int arr[] = new int[]{10, 2, 7, 8, 4, 6, 3, 5, 9};
        for (int i = 0; i <= arr.length - 1; i++) {
            myLinkedList.append(arr[i]);
        }
        myLinkedList.printList();

        partitionList(myLinkedList, 5);

        myLinkedList.printList();

    }

    private static void partitionList(LinkedList myLinkedList, int x) {
        if (myLinkedList.getHead() == null) return;

        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = myLinkedList.getHead();

        while (current != null) {
            if (current.getValue() < x) {
                prev1.setNext(current);
                prev1 = current;
            } else {
                prev2.setNext(current);
                prev2 = current;
            }
            current = current.getNext();
        }

        prev2.setNext(null);
        prev1.setNext(dummy2.getNext());

        myLinkedList.setHead(dummy1.getNext());

    }

}
