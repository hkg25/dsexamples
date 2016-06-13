package com.linkedlist.singly;

public class SinglyLinkedList<T> {

	private Node<T> root;

	private int length = 0;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	public SinglyLinkedList() {
		this.root = null;
	}

	public void createList(T[] dataArr) {
		if (dataArr == null || dataArr.length == 0) {
			System.out.println("There is no record in list");
			return;
		} else {
			Node<T>[] nodeList = getNodeList(dataArr);
			root = nodeList[0];
			Node<T> node = null;
			for (int i = 1; i < nodeList.length; i++) {
				node = nodeList[i - 1];
				node.setNext(nodeList[i]);
			}
			Node<T> lastNode = node.getNext();
			lastNode.setNext(null);
		}
	}

	private Node<T>[] getNodeList(T[] nodes) {
		@SuppressWarnings("unchecked")
		Node<T>[] nodeList = new Node[nodes.length];
		length = nodes.length;
		for (int i = 0; i < nodes.length; i++) {
			nodeList[i] = new Node<T>(nodes[i]);
		}
		return nodeList;
	}

	public void displayLinkedList() {
		if (null == root) {
			return;
		}
		System.out.println("\n");
		Node<T> temp = root;
		while (null != temp) {
			System.out.print(temp.getData());
			if (null != temp.getNext()) {
				System.out.print(" --> ");
			}
			temp = temp.getNext();
		}
	}

	public void addNodeAtFirst(T data) {
		Node<T> node = new Node<T>(data);
		node.setNext(root);
		root = node;
		length++;
	}

	public void addNodeAtLast(T data) {
		Node<T> node = new Node<T>(data);
		if (root == null) {
			root = node;
		} else {
			Node<T> p, q;
			for (p = root; (q = p.getNext()) != null; p = q) {
				p.setNext(node);
			}
		}
		length++;
	}

	public void addAtIndex(T data, int position) {
		if (position < 0) {
			position = 0;
		}
		if (position > length) {
			position = length;
		}

		if (root == null) {
			root = new Node<T>(data);
		} else if (position == 0) {
			Node<T> node = new Node<T>(data);
			node.setNext(root);
			root = node;
		} else {
			Node<T> tempNode = root;
			for (int i = 1; i < position; i++) {
				tempNode = tempNode.getNext();
			}
			Node<T> node = new Node<T>(data);
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
		}
		length++;
	}

	public Node<T> removeFromFirst() {
		Node<T> temp = root;
		if (temp != null) {
			root = temp.getNext();
			temp.setNext(null);
		}
		length--;
		return temp;
	}

	public Node<T> removeFromLast() {
		Node<T> temp = root;
		if (temp != null) {
			root = temp.getNext();
			temp.setNext(null);
		}
		length--;
		return temp;
	}
	
	

}
