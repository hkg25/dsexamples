package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class TreeImpl<T> {

	private TreeNode<T> root;

	public TreeImpl() {
		root = null;
	}

	public TreeNode<T> createTree(List<T> list) {
		if (list == null || list.isEmpty()) {
			System.out.println("List is null or Empty");
			return null;
		} else {
			T elem = null;
			for (int i = 0; i < list.size(); i++) {
				elem = list.get(i);
				add(elem);
			}
		}
		return root;
	}

	public void add(T data) {
		root = addNode(root, data);
	}

	private TreeNode<T> addNode(TreeNode<T> node, T data) {
		if (node == null) {
			node = new TreeNode<>(data);
		} else {
			if (node.getLeftNode() == null) {
				node.setLeftNode(addNode(node.getLeftNode(), data));
			} else {
				node.setRightNode(addNode(node.getRightNode(), data));
			}
		}
		return node;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void deleteNode() {
		// TODO : Add implementation
	}

	public void preOrder(boolean isRecursive) {
		if (isRecursive) {
			preOrder(root);
		} else {
			List<T> list = preOrderNonRecursive(root);
			for (T data : list) {
				System.out.print(data + "-->");
			}
		}
	}

	private void preOrder(TreeNode<T> node) {
		if (node != null) {
			System.out.print(node.getData() + "-->");
			preOrder(node.getLeftNode());
			preOrder(node.getRightNode());
		}
	}

	private List<T> preOrderNonRecursive(TreeNode<T> node) {
		List<T> list = new ArrayList<>();
		if (node == null)
			return list;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode<T> tempNode = stack.pop();
			list.add(tempNode.getData());
			if (tempNode.getRightNode() != null) {
				stack.push(tempNode.getRightNode());
			}
			if (tempNode.getLeftNode() != null) {
				stack.push(tempNode.getLeftNode());
			}
		}
		return list;
	}

	public void postOrder(boolean isRecursive) {
		if (isRecursive) {
			postOrder(root);
		} else {
			List<T> list = postOrderNonRecursive(root);
			for (T data : list) {
				System.out.print(data + "-->");
			}
		}
	}

	private void postOrder(TreeNode<T> node) {
		if (node != null) {
			postOrder(node.getLeftNode());
			postOrder(node.getRightNode());
			System.out.print(node.getData() + "-->");
		}
	}

	private List<T> postOrderNonRecursive(TreeNode<T> node) {
		List<T> list = new ArrayList<>();
		if (node == null)
			return list;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		TreeNode<T> prev = null;
		while (!stack.isEmpty()) {
			TreeNode<T> current = stack.peek();
			if (prev == null || prev.getLeftNode() == current || prev.getRightNode() == current) {
				if (current.getLeftNode() != null) {
					stack.push(current.getLeftNode());
				} else if (current.getRightNode() != null) {
					stack.push(current.getRightNode());
				}
			} else if (current.getLeftNode() == prev) {
				if (current.getRightNode() != null)
					stack.push(current.getRightNode());
			} else {
				list.add(current.getData());
				stack.pop();
			}
			prev = current;
		}
		return list;
	}

	public void inOrder(boolean isRecursive) {
		if (isRecursive) {
			inOrder(root);
		} else {
			List<T> list = inOrderNonRecursive(root);
			for (T data : list) {
				System.out.print(data + "-->");
			}
		}
	}

	private void inOrder(TreeNode<T> node) {
		if (node != null) {
			inOrder(node.getLeftNode());
			System.out.print(node.getData() + "-->");
			inOrder(node.getRightNode());
		}
	}

	private List<T> inOrderNonRecursive(TreeNode<T> node) {
		List<T> list = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		Boolean done = Boolean.FALSE;
		TreeNode<T> currentNode = node;
		while (!done) {
			if (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeftNode();
			} else {
				if (stack.isEmpty()) {
					done = true;
				} else {
					currentNode = stack.pop();
					list.add(currentNode.getData());
					currentNode = currentNode.getRightNode();
				}
			}
		}
		return list;
	}
	
	public void levelOrderTraversal(){
		levelOrderTraversal(root);
	}
	
	//TODO : Add Complete Implementation
	private List<List<T>> levelOrderTraversal(TreeNode<T> node){
		List<List<T>> list = new ArrayList<>();
		if(node ==null){
			return list;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		queue.offer(null);
		List<T> elems = new ArrayList<>();
		while(!queue.isEmpty()){
			TreeNode<T> tempNode = queue.poll();
			if(tempNode != null){
				
			}
		}
		return null;
		
	}

	public int count() {
		return countNodes(root);
	}

	private int countNodes(TreeNode<T> node) {
		int count = 0;
		if (node != null) {
			count = 1;
			count += countNodes(node.getLeftNode());
			count += countNodes(node.getRightNode());
		}
		return count;
	}

}
