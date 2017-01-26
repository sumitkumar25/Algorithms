package com.algorithm.queue;

import java.util.Arrays;

public class QueueCircularArrayImpl implements Queue {
	private static final int CAPACITY = 10;
	private int size, front, rear;
	private int CAP;
	private int[] arrayQueue;

	public int[] getArrayQueue() {
		return arrayQueue;
	}

	private int netCapacity;

	public QueueCircularArrayImpl() {
		this.size = 0;
		this.front = 0;
		this.rear = 0;
		this.arrayQueue = new int[CAPACITY];
		this.netCapacity = CAPACITY;
	}

	public QueueCircularArrayImpl(int cAP) {
		this.size = 0;
		this.front = 0;
		this.rear = 0;
		this.arrayQueue = new int[cAP];
		this.netCapacity = cAP;
	}

	public void enQueue(int data) {
		if (this.size == this.netCapacity) {
			throw new IllegalStateException("Queue full");
		} else {
			arrayQueue[this.rear] = data;
			this.size++;
			this.rear = (this.rear + 1) % netCapacity;
		}

	}

	@Override
	public String toString() {
		return "QueueCircularArrayImpl [size=" + size + ", front=" + front
				+ ", rear=" + rear + ", arrayQueue="
				+ Arrays.toString(arrayQueue) + "]";
	}

	public int deQueue() {
		int result = 0;
		if (isEmpty()) {
			throw new IllegalStateException("Queue Empty");
		} else {
			result = arrayQueue[front];
			this.size--;
			this.front = (this.front + 1) % netCapacity;
		}
		return result;
	}

	public int Front() {
		return this.front;
	}

	public int QueueSize() {
		return this.size;
	}

	public boolean isEmpty() {
		return (this.size == 0);
	}

	public boolean isFull() {
		return (this.size == this.netCapacity);
	}

}
