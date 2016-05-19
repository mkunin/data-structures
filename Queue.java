/*
 * File: Queue.java
 * -----------------------------
 * This class implements a queue from scratch.
 */

class Queue {
	Node head, tail;
	
	public Queue() {
		head = null;
		tail = head;
	}
	
	// Adds a node to the tail of a queue.
	void enqueue(int d) {
		if (head != null) {
			tail.next = new Node(d);
			tail = tail.next;
		} else {
			head = new Node(d);
			tail = head;
		}
	}
	
	// Removes a node from the head of a queue.
	void dequeue() {
		if (head != null) {
			head = head.next;
			if (head == null) {
				tail = head;
			}
		}
	}
	
	// Displays a queue.
	void print() {
		Node node = this.head;
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