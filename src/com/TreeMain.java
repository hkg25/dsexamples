package com;

import java.util.Arrays;
import java.util.List;

public class TreeMain {

	public static void main(String[] args) {
		String[] stringNodes = { "Harish", "Garg", "Pallav", "Tyagi", "Sudhanshu", "Pant", "Mukul", "Sharma" };
		List<String> list = Arrays.asList(stringNodes);
		TreeImpl<String> tree = new TreeImpl<>();
		tree.createTree(list);
		System.out.println("Node count is : " + tree.count());
		System.out.println("Inorder is : ");
		tree.inOrder(Boolean.TRUE);
		System.out.println("\n Preorder is : ");
		tree.preOrder(Boolean.TRUE);
		System.out.println("\n Postorder is : ");
		tree.postOrder(Boolean.TRUE);

		System.out.println("\n ===================================================================");

		Integer[] intNodes = { 1, 5, 8, 2, 4, 9, 45 };
		List<Integer> list1 = Arrays.asList(intNodes);
		TreeImpl<Integer> tree1 = new TreeImpl<>();
		tree1.createTree(list1);
		System.out.println("Node count is : " + tree1.count());
		System.out.println("Inorder is : ");
		tree1.inOrder(Boolean.FALSE);
		System.out.println("\n Preorder is : ");
		tree1.preOrder(Boolean.FALSE);
		System.out.println("\n Postorder is : ");
		tree1.postOrder(Boolean.TRUE);
		tree1.postOrder(Boolean.FALSE);
	}

}
