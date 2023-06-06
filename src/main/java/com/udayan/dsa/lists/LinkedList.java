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
		tail = newNode;
		
		
	}
	public void prepend(int value) {
			
	}
	public boolean insert(int index, int value) {
		return true;
	}
	
	public void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.getValue()+ " -> ");
			temp = temp.getNext();
		}
		System.out.print("null");
	}
	public void getHead() {
		System.out.println("Head = "+head.getValue());
	}
	
	public void getTail() {
		System.out.println("Tail = "+tail.getValue());
	}
	
	public void getLength() {
		System.out.println("Length = "+length);
	}
	
	
}
