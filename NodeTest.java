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
		n.add(1);
		n.add(2);
		n.add(3);
		n.remove(1);
		n.print(); // [0| ]->[2| ]->[3|/]
	}
}
	