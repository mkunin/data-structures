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
		n.print(); // [7| ]->[0| ]->[2| ]->[3|/]
	}

}