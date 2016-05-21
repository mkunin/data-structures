/*
 * File: Stack.java
 * -----------------------------
 * This class implements a stack from scratch.
 */

class Stack {
	Node first;
	
	public Stack() {
		first = null;
	}
	
	// Prepends a node to the head of a stack.
	void push(int d) {
		if (first != null) {
			Node second = first.next;
			first.next = new Node(d);
			first.next.data = first.data;
			first.data = d;
			first.next.next = second;
		} else {
			first = new Node(d);
		}
	}
	
	// Removes a node from the head of a stack.
	void pop() {
		if (first != null) {
			first = first.next;
		}
	}
	
	// Displays a stack.
	void print() {
		Node node = first;
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