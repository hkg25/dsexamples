package com.stack;

public class StackImplUsingArray<T> {

	private T[] array;

	private int top;

	private int capacity;

	@SuppressWarnings("unchecked")
	public StackImplUsingArray(int capacity) {
		array = (T[]) new Object[capacity];
		top = -1;
		this.capacity = capacity;
	}

	public void push(T data) {
		if (isFull()) {
			System.out.println("Stack is full");
			return;
		}
		array[++top] = data;
		// System.out.println("Item is added to stack " + data);
	}

	public T pop() {
		T value = null;
		if (!isEmpty()) {
			value = array[top--];
		}
		return value;
	}

	public T peek() {
		T value = null;
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
		StackImplUsingArray<Integer> stack = new StackImplUsingArray<>(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
