package com.algorithm.queue;

public interface Queue {
	public void enQueue(int data);

	public int deQueue();

	public int Front();

	public int QueueSize();

	public boolean isEmpty();

	public boolean isFull();

	

}
