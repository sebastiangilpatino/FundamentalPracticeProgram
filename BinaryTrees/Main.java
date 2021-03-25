package BinaryTrees;

public class Main {

	public static void main(String[] args) {
		MyBST mybst = new MyBST();
		// int[] arr = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };
		int[] arr = { 2, 4, 8, 7, 3, 5, 6, 10 };

		System.out.print("Array of the homework: ");
		for (int i = 0; i < arr.length; i++) {
			mybst.insert(arr[i]);
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.print("Preorder: ");
		mybst.preOrder();
		System.out.print("\nInOrder: ");
		mybst.printTree();
		System.out.print("\nPostorder: ");
		mybst.postOrder();
		System.out.print("\nNumber Nodes " + mybst.countnodes(mybst.getRoot()));
		System.out.print("\nNumber Nodes " + mybst.countleaves(mybst.getRoot()));

		System.out.print("\nAllEven " + mybst.allEven(mybst.getRoot()));
		System.out.print("\nCountEven " + mybst.countEven(mybst.getRoot()));
		System.out.print("\nMin " + mybst.minimum(mybst.getRoot()));
		System.out.print("\nMax " + mybst.maximum(mybst.getRoot()));

	}

}
