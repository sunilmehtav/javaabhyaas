package com.udayan.dsa.lists;

import com.udayan.dsa.Node;

public class NthNodeFromEndFinder {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        for (int i = 2; i <= 10; i++) {
            myLinkedList.append(i);
        }
        myLinkedList.printList();

        Node nthNode = findNthNodeFromEnd(myLinkedList, 3);
        System.out.println(nthNode.getValue());

    }

    private static Node findNthNodeFromEnd(LinkedList myLinkedList, int n) {
        Node slow = myLinkedList.getHead();
        Node fast = myLinkedList.getHead();
        for (int i = 0; i < n; i++) {
            if (fast == null) return null;
            fast = fast.getNext();

        }
        while (fast != null) {
            slow = slow.getNext();
            fast = fast.getNext();
        }
        return slow;
    }

}
