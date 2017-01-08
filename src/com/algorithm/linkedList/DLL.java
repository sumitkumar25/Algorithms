package com.algorithm.linkedList;

public class DLL {
	private DoubleListNode head;
	private DoubleListNode tail;
	private int length;

	public DLL() {
		this.head = new DoubleListNode(Integer.MIN_VALUE, null, null);
		this.tail = new DoubleListNode(Integer.MIN_VALUE, head, null);
		this.length = 0;
		this.head.setNext(tail);
	}

	public int getLength() {
		return length;
	}

	/** 1. insert in front */
	public void insert(int data) {
		DoubleListNode newNode = new DoubleListNode(data, head, head.getNext());
		newNode.getNext().setPrev(newNode);
		head.setNext(newNode);
		length += 1;
	}

	/** 2. insert at end */
	public void insertEnd(int data) {
		DoubleListNode newNode = new DoubleListNode(data, tail.getPrev(), tail);
		newNode.getPrev().setNext(newNode);
		tail.setPrev(newNode);
		length += 1;
	}

	/** 3.delete at start */
	public DoubleListNode delete() {
		if (head.getNext() == null || head.getNext() == tail) {
			return null;
			// can check length also
		}
		DoubleListNode firstNode = head.getNext();
		firstNode.getNext().setPrev(head);
		head.setNext(firstNode.getNext());
		return firstNode;
	}

	/** 4.delete at end */
	public DoubleListNode deleteEnd() {
		if (tail.getPrev() == head || tail.getPrev() == null) {
			return null;
			// can check length also
		}
		DoubleListNode lastNode = tail.getPrev();
		lastNode.getPrev().setNext(tail);
		tail.setPrev(lastNode.getPrev());
		return lastNode;
	}

	/** insert at position n: n>0 */
	public void add(int pos, int data) {
		if (pos > length) {
			insertEnd(data);
		} else if (pos <= length && pos > 0) {
			DoubleListNode temp = head;
			DoubleListNode newNode = new DoubleListNode(data);
			int i = 0;
			while (i < pos-1 && temp.getNext() != null) {
				temp = temp.getNext();
				i++;
				System.out.println("data at pos " + i + "is" + temp.getData());

			}
			newNode.setPrev(temp);
			newNode.setNext(temp.getNext());
			temp.getNext().setPrev(newNode);
			temp.setNext(newNode);
			System.out.println("added at position " + i);
			printList();
		}
	}

	public void printList() {
		DoubleListNode temp = head.getNext();
		while (temp.getNext() != tail) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}
}
