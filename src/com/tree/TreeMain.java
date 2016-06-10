package com.tree;

import java.util.Arrays;
import java.util.List;

public class TreeMain {

	public static void main(String[] args) {
		Integer[] intNodes = { 1, 5, 8, 2, 4, 9, 45 };
		List<Integer> list1 = Arrays.asList(intNodes);
		TreeImpl<Integer> tree1 = new TreeImpl<>();
		tree1.createTree(list1);
		System.out.println("Node count is : " + tree1.count());
		System.out.println("Inorder is : ");
		tree1.inOrder(Boolean.TRUE);
		System.out.print("\n");
		tree1.inOrder(Boolean.FALSE);
		System.out.println("\nPreorder is : ");
		tree1.preOrder(Boolean.TRUE);
		System.out.print("\n");
		tree1.preOrder(Boolean.FALSE);
		System.out.println("\nPostorder is : ");
		tree1.postOrder(Boolean.TRUE);
		System.out.print("\n");
		tree1.postOrder(Boolean.FALSE);
	}

}
