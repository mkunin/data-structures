/*
 * File: Node.java
 * -----------------------------
 * This class implements a singly linked list from scratch.
 */

public class Node {
	Node next = null;
	int data, size = 1;
	
	public Node(int d) {
		data = d;
	}
	
	// Appends a node to the tail of a singly linked list.
	void add(int d) {
		Node node = this;
		while (node.next != null) {
			node = node.next;
		}
		node.next = new Node(d);
		size++;
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