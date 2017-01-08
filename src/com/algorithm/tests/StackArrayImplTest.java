package com.algorithm.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algorithm.stacks.StackArrayImpl;

public class StackArrayImplTest {
	int defaultStackCapacity = 10;
	StackArrayImpl stackArrayImpl;
	StackArrayImpl stackArrayImplParam;

	@Before
	public void createStack() {
		stackArrayImpl = new StackArrayImpl();
		stackArrayImplParam = new StackArrayImpl(15);
	}
	@Test
	public final void testStackArrayImplInt() {
		System.out.println(stackArrayImplParam.size());
		assertEquals("default stack capacity", defaultStackCapacity, stackArrayImpl.getSize());
	}

	@Test
	public final void testStackArrayImpl() {
		System.out.println(stackArrayImplParam.size());
		assertEquals("parameter stack capacity", 15, stackArrayImplParam.getSize());
	}

	@Test
	public final void testPush() {
		System.out.println(stackArrayImplParam.size());
		int j = 15;
		for (int i = 0; i < j; i++) {
			stackArrayImplParam.push(i);
		}
		assertEquals(j, stackArrayImplParam.size());
	}

	@Test
	public final void testPop() {
		System.out.println(stackArrayImplParam.size());
		pushInStack(10, stackArrayImplParam);
		int popResult = stackArrayImplParam.pop();
		assertEquals(popResult, 9);

	}

	@Test
	public final void testTop() {
		System.out.println(stackArrayImplParam.size());
		pushInStack(10, stackArrayImplParam);
		assertEquals(stackArrayImplParam.getTop(), 9);
	}

	@Test
	public final void testSize() {
		System.out.println(stackArrayImplParam.size());
		pushInStack(10, stackArrayImplParam);
		assertEquals(stackArrayImplParam.size(), 10);
	}

	@Test
	public final void testIsEmpty() {
		
		System.out.println(stackArrayImplParam.size());
		assertEquals(stackArrayImplParam.isEmpty(), 1);
	}

	@Test
	public final void testIsStackFull() {
		System.out.println(stackArrayImplParam.size());
		pushInStack(15, stackArrayImplParam);
		assertEquals(stackArrayImplParam.isStackFull(), 1);
	}
    /*output functions*/
	private void printStack(int stack[]) {
		for (int i = 0; i < stack.length; i++) {
			System.out.println(stack[i]);
		}
	}

	private void pushInStack(int j, StackArrayImpl arrayImplF) {
		for (int i = 0; i < j; i++) {
			arrayImplF.push(i);
		}
	}
}
