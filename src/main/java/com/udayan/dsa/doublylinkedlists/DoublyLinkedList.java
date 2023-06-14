package com.udayan.dsa.doublylinkedlists;

import com.udayan.dsa.DNode;

public class DoublyLinkedList {
    DNode head;
    DNode tail;
    int length;

    public DoublyLinkedList(int value) {
        DNode dNode = new DNode(value);
        head = dNode;
        tail = dNode;
        length = 1;

    }

    public DNode getHead() {
        return head;
    }

    public void setHead(DNode head) {
        this.head = head;
    }

    public DNode getTail() {
        return tail;
    }

    public void setTail(DNode tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void append(int value) {
        if (head == null && tail == null) {
            DNode dNode = new DNode(value);
            head = dNode;
            tail = dNode;
            length = 1;
        } else {
            DNode dNode = new DNode(value);
            tail.setNext(dNode);
            dNode.setPrevious(tail);
            tail = dNode;
            length++;
        }
    }

    public void removeLast() {
        if (length == 1) {
            head = null;
            tail = null;

        } else {
            DNode temp = tail;
            tail = tail.getPrevious();
            tail.setNext(null);
            temp.setPrevious(null);
        }
        length--;
    }

    public void printList() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null\n");
    }

    public void reverseList() {
        DNode current = head;
        DNode temp = null;

        while (current != null) {
            temp = current.getPrevious();
            current.setPrevious(current.getNext());
            current.setNext(temp);
            current = current.getPrevious();
        }
        temp = head;
        head = tail;
        tail = temp;
    }

}
