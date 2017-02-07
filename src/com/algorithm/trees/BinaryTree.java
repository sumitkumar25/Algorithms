package com.algorithm.trees;

import java.util.ArrayList;
import java.util.Stack;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class BinaryTree {
	private BinaryTreeNode root;

	public void insert(int data) {
		BinaryTreeNode node = new BinaryTreeNode(data);
		if (root == null) {
			root = node;
		} else if (root.getData() >= data) {
			positionAndInsert(node, root);
		} else {
			positionAndInsert(node, root);
		}
	}

	/**
	 * recursive traversal
	 */
	public void inOrderTraversal(BinaryTreeNode node) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (node != null) {
			inOrderTraversal(node.getLeft());
			// result.add(node.getData());
			System.out.println(node.getData());
			inOrderTraversal(node.getRight());
		}
		// System.out.println(result.toString());
	}

	public void postOrderTraversal(BinaryTreeNode node) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (node != null) {
			postOrderTraversal(node.getLeft());
			postOrderTraversal(node.getRight());
			// result.add(node.getData());
			System.out.println(node.getData());
		}
		// System.out.println(result.toString());
	}

	public void preOrderTraversal(BinaryTreeNode node) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (node != null) {
			// result.add(node.getData());
			System.out.println(node.getData());
			preOrderTraversal(node.getLeft());
			preOrderTraversal(node.getRight());
		}
		// System.out.println(result.toString());
	}

	public void nrInOrderTraversal(BinaryTreeNode node) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		BinaryTreeNode curr = node;
		Boolean finished = false;
		while (!finished) {
			if (curr != null) {
				stack.push(curr);
				curr = curr.getLeft();
			} else {
				if (stack.isEmpty()) {
					finished = true;
				} else {
					curr = stack.pop();
					System.out.println(curr.getData());
					curr = curr.getRight();
				}
			}
		}
	}

	/*
	 * public void nrPostOrderTraversal(BinaryTreeNode node) {
	 * Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>(); Boolean
	 * finished = false; BinaryTreeNode curr = node; while (!finished) { if
	 * (curr != null) {
	 * 
	 * } }
	 * 
	 * }
	 */

	public void nrPreOrderTraversal(BinaryTreeNode node) {
		if (root == null) {
			return;
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(node);
		while (!stack.isEmpty()) {
			BinaryTreeNode temp = stack.pop();
			System.out.println(temp.getData());
			if (temp.getRight() != null) {
				stack.push(temp.getRight());
			}
			if (temp.getLeft() != null) {
				stack.push(temp.getLeft());;
			}
		}
	}

	private void positionAndInsert(BinaryTreeNode node, BinaryTreeNode currNode) {
		if (currNode == null) {
			currNode = node;
			return;
		} else if (currNode.getData() <= node.getData()) {
			if (currNode.getRight() == null) {
				currNode.setRight(node);
			} else {
				positionAndInsert(node, currNode.getRight());
			}
		} else if (currNode.getData() >= node.getData()) {
			if (currNode.getLeft() == null) {
				currNode.setLeft(node);
			} else {
				positionAndInsert(node, currNode.getLeft());
			}
		}
	}

	/**
	 * iterative traversal
	 */

	public BinaryTreeNode getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}
}
