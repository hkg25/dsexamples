package com.linkedlist.singly;

public class Main {

	public static void main(String[] args) {
		String str[] = { "A", "B", "C", "D", "E", "F" };
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.createList(str);
		list.displayLinkedList();
	}

}
