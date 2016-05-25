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
		Node n = this;
		Node n2 = this;
		Node reversedList = new Node(n.data);
		while (n2.next != null) {
			reversedList.prependToHead(n2.next.data);
			n2 = n2.next;
		}
		n.data = reversedList.data;
		n.next = reversedList.next;
	}
	
	// Detects if there exists a cycle, or loop, in a singly linked list.
	boolean hasCycle() {
		Node fast = this;
		Node slow = this;
		boolean notNull = fast != null && fast.next != null && slow != null;
		while (notNull) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) return true;
			notNull = fast != null && fast.next != null && slow != null;
		}
		return false;
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
		Node first = this;
		Node second = Node.this.next;
		first.next = new Node(d);
		first.next.data = first.data;
		first.data = d;
		first.next.next = second;
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