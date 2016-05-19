/*
 * File: Node.java
 * -----------------------------
 * This class implements a singly linked list from scratch.
 */

class Node {
	Node next = null;
	int data, size = 1;
	
	public Node(int d) {
		data = d;
	}
	
	// Reverses a singly linked list.
	void reverse() {
		Node node = this;
		Node temp = this;
		String strWithCommas = "";
		while (temp.next != null) {
			strWithCommas += temp.data + ",";
			temp = temp.next;
		}
		strWithCommas += String.valueOf(temp.data);
		strWithCommas = flip(strWithCommas);
		String[] array = strWithCommas.split(",");
		flipNumsIn(array);
		node.data = Integer.valueOf(array[0]);
		node.next = null;
		int tempSize = size;
		size = 1;
		for (int i = 1; i < tempSize; i++) {
			node.appendToTail(Integer.valueOf(array[i]));
		}
	}
	
	// Applies flip(String s) to each item in array.
	void flipNumsIn (String[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = flip(array[i]);
		}
	}
	
	// Reverses a string.
	String flip(String s) {
		String acc = "";
		for (int i = s.length(); i > 0; i--) {
			acc += s.charAt(i-1);
		}
		return acc;
	}
	
	// Appends a node to the tail of a singly linked list.
	void appendToTail(int d) {
		Node node = this;
		while (node.next != null) {
			node = node.next;
		}
		node.next = new Node(d);
		size++;
	}
	
	// Prepends a node to the head of a singly linked list.
	void prependToHead(int d) {
		Node node = this;
		Node temp = this;
		String strWithCommas = "";
		while (temp.next != null) {
			strWithCommas += temp.data + ",";
			temp = temp.next;
		}
		strWithCommas += String.valueOf(temp.data);
		String[] array = strWithCommas.split(",");
		node.next = null;
		node.data = d;
		size = 1;
		for (int i = 0; i < array.length; i++) { /* Appends n nodes to the tail of a singly linked list. */
			node.appendToTail(Integer.parseInt(array[i]));
		}
	}
	
	// Removes a node from a singly linked list.
	void remove(int d) {
		Node node = this;
		if (node.data == d && size > 1) { /* Moves the head */
			node.data = node.next.data;
			node.next = node.next.next;
			size--;
			return;
		}
		while (node.next != null) {
			if (node.next.data == d) { /* Removes  inner node */
				node.next = node.next.next;
				size--;
				return;
			}
			node = node.next;
		}
	}
	
	// Displays a singly linked list.
	void print() {
		Node node = this;
		while (node != null) {
			System.out.print("[" + node.data + "|");
			if (node.next != null) {
				System.out.print(" ]->");
			} else {
				System.out.print("/]");
			}
			node = node.next;
		}
	}

}