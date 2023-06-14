package com.udayan.dsa;

public class DNode {
	int value;
	DNode next;
	DNode previous;
	public DNode(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public DNode getNext() {
		return next;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void setNext(DNode next) {
		this.next = next;
	}
	public DNode getPrevious() {
		return previous;
	}
	public void setPrevious(DNode previous) {
		this.previous = previous;
	}
	

}
