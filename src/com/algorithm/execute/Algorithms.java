package com.algorithm.execute;

import com.algorithm.linkedList.DLL;

public class Algorithms {

	public static void main(String[] args) {
		System.out.println("double linked list");
		DLL testDLL = new DLL();
		addInfront(5, testDLL);
		addEnd(6, testDLL);
		//testDLL.printList();
		/*//System.out.println(testDLL.getLength());
		System.out.println("deleted item "+testDLL.delete().getData());
		testDLL.printList();
		System.out.println("deleted item last"+testDLL.deleteEnd().getData());*/
		//testDLL.printList();
		testDLL.add(15, 99);
		testDLL.printList();
		testDLL.add(1, 1000);
	}

	private static void addInfront(int tillVal, DLL dll) {
		for (int i = 1; i <= tillVal; i++) {
			dll.insert(i);
		}
	}

	private static void addEnd(int tillVal, DLL dll) {
		for (int i = tillVal; i >= 1; i--) {
			dll.insertEnd(i);
		}
	}

}
