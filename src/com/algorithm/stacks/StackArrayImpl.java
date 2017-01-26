package com.algorithm.stacks;

public class StackArrayImpl implements Stack {
	private int size = 10;
	private int[] stack;
	private int top;

	public StackArrayImpl(int size) {
		this.stack = new int[size];
		this.top = -1;
		this.size = size;
	}

	public StackArrayImpl() {
		this.stack = new int[size];
		this.top = -1;
	}

	 
	public void push(int data) {
		if(this.isStackFull() ==1){
			System.out.println("stack full");
		}
		this.stack[++top] = data;
	}

	 
	public int pop() {
		if (this.isEmpty() == 1) {
			System.out.println("stack empty");
		}
		int top = this.stack[this.top];
		this.stack[this.top] = Integer.MIN_VALUE;
		return top;
	}

	 
	public int top() {
		return this.top;
	}

	 
	public int size() {
		return this.top + 1;
	}

	 
	public int isEmpty() {
		if (this.top > -1) {
			return 0;
		}
		return 1;
	}

	 
	public int isStackFull() {
		return this.stack.length == this.size() ? 1 : 0;
	}

	public int getSize() {
		return size;
	}

	public int getTop() {
		return top;
	}

	public int[] getStack() {
		return stack;
	}
}
