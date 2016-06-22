package com.stack;

public class StackImplUsingArray {

	private int[] array;

	private int top;

	private int capacity;

	public StackImplUsingArray(int capacity) {
		array = new int[capacity];
		top = -1;
		this.capacity = capacity;
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack is full");
			return;
		}
		array[++top] = data;
		System.out.println("Item is added to stack " + data);
	}

	public int pop() {
		int value = Integer.MIN_VALUE;
		if (!isEmpty()) {
			value = array[top--];
		}
		return value;
	}

	public int peek() {
		int value = Integer.MIN_VALUE;
		if (!isEmpty()) {
			value = array[top];
		}
		return value;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public static void main(String[] args) {
		StackImplUsingArray stack = new StackImplUsingArray(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
