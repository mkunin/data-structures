/*
 *  File: NodeTest.java
 */

public class NodeTest extends Node {

	public NodeTest(int d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Node n = new Node(0);
		n.appendToTail(1);
		n.appendToTail(2);
		n.appendToTail(3);
		n.remove(1);
		n.prependToHead(7);
		n.reverse();
		n.print(); // [3| ]->[2| ]->[0| ]->[7|/]
		System.out.println("\n" + n.hasCycle()); // false
		n.next.next.next.next = n.next; // Creates a cycle, or loop.
		System.out.println(n.hasCycle()); // true
	}

}