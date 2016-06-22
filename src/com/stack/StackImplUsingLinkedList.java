package com.stack;

import com.linkedlist.singly.Node;

public class StackImplUsingLinkedList {

	private Node<Integer> top;

	@SuppressWarnings("unused")
	private int size;

	public StackImplUsingLinkedList() {
		top = null;
		size = 0;
	}

	public void push(int data) {
		Node<Integer> node = new Node<Integer>(data);
		if (!isEmpty())
			node.setNext(top);
		top = node;
		size++;
		System.out.println("Data is added to stack : " + data);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public int pop() {
		int value = Integer.MIN_VALUE;
		if (!isEmpty()) {
			Node node = top;
			top = node.getNext();
			size--;
			value = (int) node.getData();
		}
		return value;
	}

	public int peek() {
		int value = Integer.MIN_VALUE;
		if (!isEmpty()) {
			value = (int) top.getData();
		}
		return value;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public static void main(String[] args) {
		StackImplUsingLinkedList stack = new StackImplUsingLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
