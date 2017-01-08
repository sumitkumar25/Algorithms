package com.algorithm.linkedList;

public class DoubleListNode {
	private int data;
	private DoubleListNode prev;
	private DoubleListNode next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoubleListNode getPrev() {
		return prev;
	}

	public void setPrev(DoubleListNode prev) {
		this.prev = prev;
	}

	public DoubleListNode(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	public DoubleListNode(int data, DoubleListNode prev, DoubleListNode next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public DoubleListNode getNext() {
		return next;
	}

	public void setNext(DoubleListNode next) {
		this.next = next;
	}
}
