package com.linkedlist.singly;

public class Main {

	public static void main(String[] args) {
		String str[] = { "A", "B", "C", "D", "E", "F" };
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.createList(str);
		list.displayLinkedList();

		// append characters java
		char x = 'a';
		char y = 'b';

		System.out.println("\n" + (x +"+"+ y));

	}

}
