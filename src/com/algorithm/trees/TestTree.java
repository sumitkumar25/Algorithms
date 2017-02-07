package com.algorithm.trees;

public class TestTree {

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new BinaryTreeNode(1));
        binaryTree.getRoot().setLeft(new BinaryTreeNode(2));
        binaryTree.getRoot().setRight(new BinaryTreeNode(3));
        binaryTree.getRoot().getLeft().setLeft(new BinaryTreeNode(4));
        binaryTree.getRoot().getLeft().setRight(new BinaryTreeNode(5));
        System.out.println("-----inorder-----");
		binaryTree.inOrderTraversal(binaryTree.getRoot());
        System.out.println("inorder non recursive");
        binaryTree.nrInOrderTraversal(binaryTree.getRoot());
		/*System.out.println("------postOrder--------");
		binaryTree.postOrderTraversal(binaryTree.getRoot());
		System.out.println("------preOrder----------");
		binaryTree.preOrderTraversal(binaryTree.getRoot());*/
	}
}
