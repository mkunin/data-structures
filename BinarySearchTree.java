/*
 * File: BinarySearchTree.java
 * ---------------------------
 * This class implements a Binary Search Tree (BST) from scratch.
 */

class BinarySearchTree {
	BinarySearchTree left = null, right = null;
	int data;

	public BinarySearchTree(int d) {
		data = d;
	}
	
	// Adds a node to a Binary Search Tree.
	void add(int d) {
		BinarySearchTree tree = this;
		if (d >= tree.data && tree.right != null) {
			tree.right.add(d);
		} else if (d >= tree.data && tree.right == null) {
			tree.right = new BinarySearchTree(d);
		} else if (tree.left != null) {
			tree.left.add(d);
		} else {
			tree.left = new BinarySearchTree(d);
		}
	}

	// Tells the user whether or not the specified binary search succeeded.
	void binarySearchFor(int d) {
		BinarySearchTree tree = this;
		if (binarySearch(tree, d)) {
			System.out.print("\nThe binary search for " + d + " succeeded.");
		} else {
			System.out.print("\nThe binary search for " + d + " failed.");
		}
	}

	// Binary searches for a given value in a Binary Search Tree.
	// Based on http://www.sanfoundry.com/java-program-implement-binary-search-tree/
	boolean binarySearch(BinarySearchTree tree, int d) {
		boolean found = false;
		while (!(tree == null || found)) {
			if (d == tree.data) {
				found = true;
				break;
			} else if (d < tree.data) {
				tree = tree.left;
			} else {
				tree = tree.right;
			}
			found = binarySearch(tree, d);
		}
		return found;
	}
	
	// Inverts a Binary Search Tree.
	static void invert(BinarySearchTree tree) {
		if (tree == null) return;
		BinarySearchTree temp = tree.right;
		tree.right = tree.left;
		tree.left = temp;
		invert(tree.left);
		invert(tree.right);
	}

	// Pre-order, In-order, and Post-order traversals.
	static void traverse(BinarySearchTree tree) {
		System.out.print("Pre-order Traversal: {");
		preOrder(tree);
		System.out.print("}\nIn-order Traversal: {");
		inOrder(tree);
		System.out.print("}\nPost-order Traversal: {");
		postOrder(tree);
		System.out.print("}");
	}

	// Pre-order traversal.
	static void preOrder(BinarySearchTree tree) {
		if (tree != null) {
			System.out.print(tree.data);
			if (tree.left != null) System.out.print(", ");
			preOrder(tree.left);
			if (tree.right != null) System.out.print(", ");
			preOrder(tree.right);
		}
	}

	// In-order traversal.
	static void inOrder(BinarySearchTree tree) {
		if (tree != null) {
			inOrder(tree.left);
			if (tree.left != null) System.out.print(", ");
			System.out.print(tree.data);
			if (tree.right != null) System.out.print(", ");
			inOrder(tree.right);
		}
	}

	// Post-order traversal.
	static void postOrder(BinarySearchTree tree) {
		if (tree != null) {
			postOrder(tree.left);
			if (tree.left != null) System.out.print(", ");
			postOrder(tree.right);
			if (tree.right != null) System.out.print(", ");
			System.out.print(tree.data);
		}
	}

}