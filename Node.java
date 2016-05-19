/*
 * File: Node.java
 * -----------------------------
 * This class implements a singly linked list from scratch.
 */

class Node {
	Node next = null;
	int data, size = 1;
	String str = "";
	
	public Node(int d) {
		data = d;
		str += String.valueOf(d);
	}
	
	// Appends a node to the tail of a singly linked list.
	void appendToTail(int d) {
		Node node = this;
		while (node.next != null) {
			node = node.next;
		}
		node.next = new Node(d);
		str += String.valueOf(d);
		size++;
	}
	
	// Prepends a node to the head of a singly linked list.
	void prependToHead(int d) {
		Node node = this;
		node.next = null;
		node.data = d;
		str += String.valueOf(d);
		int n = size;
		size = 1;
		for (int i = 0; i < n; i++) { /* Appends n nodes to the tail of a singly linked list. */
			node.appendToTail(Character.getNumericValue(str.charAt(i)));
		}
		int newStrLen = str.length();
		str = str.substring(newStrLen-size, newStrLen);
	}
	
	// Removes a node from a singly linked list.
	void remove(int d) {
		Node node = this;
		if (node.data == d && size > 1) { /* Moves the head */
			node.data = node.next.data;
			node.next = node.next.next;
			str = str.substring(1, size);
			size--;
			return;
		}
		int count = 0;
		while (node.next != null) {
			count++;
			if (node.next.data == d) { /* Removes  inner node */
				node.next = node.next.next;
				str = str.substring(0, count) + str.substring(count+1, size);
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