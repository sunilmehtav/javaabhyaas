package com.udayan.dsa.lists;

import com.udayan.dsa.Node;

public class LinkedList {
	private Node head;
	private Node tail;
	private int length;
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length =1;
	}
	public void append(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
		length++;
	}
	public void prepend(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		length++;
			
	}
	
	public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.getNext() != null) {
            pre = temp;
            temp = temp.getNext();
        }
        tail = pre;
        tail.setNext(null);
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
	
	public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

	public boolean insert(int index, int value) {
		return true;
	}
	
	public void reverseLinkList() {
		Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.getNext();
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.getNext();
            temp.setNext(before);
            before = temp;
            temp = after;
        }
        }
	
	public void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.getValue()+ " -> ");
			temp = temp.getNext();
		}
		System.out.print("null");
	}
	public Node getHead() {
		
		return head;
	}
	
	public Node getTail() {
		
		return tail;
	}
	
	public int getLength() {
		System.out.println("\nLength = "+length);
		return length;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	
	
	
}
