package com.algorithm.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.algorithm.queue.QueueCircularArrayImpl;

public class QueueCircularArrayImplTest {
	private QueueCircularArrayImpl arrayImplTest;
	private int capacity = 20;

	@Before
	public void createQueue() {
		arrayImplTest = new QueueCircularArrayImpl(capacity);
		for (int i = 1; i <= capacity-2; i++) {
			arrayImplTest.enQueue(i + 10);
		}
	}

	@After
	public void displayQueue() {
		System.out.println(arrayImplTest.toString());
	}

	@Test
	public void testEnQueue() {
		int[] result = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
				24, 25, 26, 27, 28,0,0 };
		assertArrayEquals(result, arrayImplTest.getArrayQueue());
	}

	@Test
	public void testDeQueue() {
		int data = arrayImplTest.deQueue();
		assertEquals(11, data);
				
	}

	@Test
	public void testFront() {
		assertEquals(0, arrayImplTest.Front());
	}

	@Test
	public void testQueueSize() {
		assertEquals(18, arrayImplTest.QueueSize());
	}

	@Test
	public void testIsEmpty() {
		for (int i = 0; i < capacity-2; i++) {
			int j=arrayImplTest.deQueue();
			j=0;
		}
		assertTrue(arrayImplTest.isEmpty());
	}

}
