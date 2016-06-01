/*
 *  File: BinarySearchTreeTest.java
 *  -------------------------------
 *  Output:
 *  Pre-order Traversal: {33, 21, 12, 37, 99}
 *  In-order Traversal: {12, 21, 33, 37, 99}
 *  Post-order Traversal: {12, 21, 99, 37, 33}
 *  The binary search for 37 succeeded.
 *  
 *  Inverted Binary Search Tree:
 *  Pre-order Traversal: {33, 37, 99, 21, 12}
 *  In-order Traversal: {99, 37, 33, 21, 12}
 *  Post-order Traversal: {99, 37, 12, 21, 33}
 */

public class BinarySearchTreeTest extends BinarySearchTree {
	
	public BinarySearchTreeTest(int d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(33);
		tree.add(21);
		tree.add(12);
		tree.add(37);
		tree.add(99);
		traverse(tree);
		tree.binarySearchFor(37);
		System.out.print("\n\nInverted Binary Search Tree:\n");
		invert(tree);
		traverse(tree);
	}

}