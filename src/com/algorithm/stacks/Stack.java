package com.algorithm.stacks;

public interface Stack {
	/**
	 * main stack operations
	 * 
	 * @throws Exception
	 */
	public void push(int data);

	public int pop();

	/**
	 * auxlliary stack operation
	 */
	public int top();

	public int size();

	public int isEmpty();

	public int isStackFull();

}
