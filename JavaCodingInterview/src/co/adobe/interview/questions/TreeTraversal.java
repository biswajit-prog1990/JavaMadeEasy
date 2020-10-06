package co.adobe.interview.questions;

import co.adobe.interview.questions.utility.*;
/*
 * Program - To do different Tree Traversals of a Binary Search Tree
 * InOrder Traversal - Left, Root, Right
 * PreOrder Traversal - Root, Left, Right
 * PostOrder Traversal - Left, Right, Root
 */

public class TreeTraversal {

	public static void main(String[] args) {
		System.out.print("PreOrder Traversal - ");
		Util.preOrderTraversal(Util.createHierarchy());
		System.out.println();
		System.out.print("InOrder Traversal - ");
		Util.inOrderTraversal(Util.createHierarchy());
		System.out.println();
		System.out.print("PostOrder Traversal - ");
		Util.postOrderTraversal(Util.createHierarchy());
	}

}
