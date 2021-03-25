package BinaryTrees;

public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */

	public BinaryNode getRoot() {
		return root;
	}

	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + " ");
			printTree(t.right);
		} // An INORDER Traversal
	}
	// Assume the data in the Node is an Integer.

	public void preOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else
			preOrder(root);
	}

	private void preOrder(BinaryNode t) {
		if (t != null) {
			System.out.print(t.element + " ");
			preOrder(t.left);
			preOrder(t.right);
		} // An PREORDER Traversal
	}

	// Assume the data in the Node is an Integer.
	public void postOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else
			postOrder(root);
	}

	private void postOrder(BinaryNode t) {
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.element + " ");
		} // An INORDER Traversal
	}

	public int countleaves(BinaryNode node) {

		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return 1;
		} else {
			return countleaves(node.left) + countleaves(node.right);
		}

	}

	public Integer maximum(BinaryNode node) {

		if (node == null) {
			return null;
		}

		if (node.right == null) {
			return node.element;
		} else {
			return maximum(node.right);
		}

	}

	public Integer minimum(BinaryNode node) {

		if (node == null) {
			return null;
		}

		if (node.left == null) {
			return node.element;
		} else {
			return minimum(node.left);
		}

	}

	public int countEven(BinaryNode node) {

		if (node == null) {

			return 0;

		} else {

			if (node.right == null && node.left == null && node.element % 2 == 0) {
				return 1;
			}

			if (node.element % 2 == 0) {
				return 1 + countEven(node.right) + countEven(node.left);

			} else {

				return countEven(node.right) + countEven(node.left);

			}

		}
	}

	public boolean allEven(BinaryNode node) {

		if (node == null) {

			return true;

		} else {

			if (node.element % 2 == 1) {

				return false;

			} else {

				return allEven(node.left) && allEven(node.right);

			}

		}
	}

	public int countnodes(BinaryNode node) {

		if (node == null) {
			return 0;
		}

		return 1 + countnodes(node.left) + countnodes(node.right);
	}

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x, null, null);
			return;
		}

		BinaryNode n = root;
		boolean inserted = false;

		while (!inserted) {
			if (x.compareTo(n.element) < 0) {
				// space found on the left
				if (n.left == null) {
					n.left = new BinaryNode(x, null, null);
					inserted = true;
				}
				// keep looking for a place to insert (a null)
				else {
					n = n.left;
				}
			} else if (x.compareTo(n.element) > 0) {
				// space found on the right
				if (n.right == null) {
					n.right = new BinaryNode(x, null, null);
					inserted = true;
				}
				// keep looking for a place to insert (a null)
				else {
					n = n.right;
				}
			}
		}

	}

	private class BinaryNode {

		// Constructors
		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
	}
}
