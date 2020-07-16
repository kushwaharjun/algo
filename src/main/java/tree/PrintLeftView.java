package arjun.kushwah.tree;

public class PrintLeftView extends Node {
	static int max_level = 0;

	public static void leftView(Node root) {
		leftViewUtil(root, 1);
	}

	public static void leftViewUtil(Node root, int level) {
		if (root == null) {
			return;
		}
		if (max_level < level) {
			System.out.println(root.data);
			max_level = level;
		}
		leftViewUtil(root.left, level + 1);
		leftViewUtil(root.right, level + 1);
	}

	public static void main(String[] args) {
		Node tree = newNode(12);
		tree.left = newNode(10);
		tree.right = newNode(30);
		tree.right.left = newNode(25);
		tree.right.right = newNode(40);
		leftView(tree);
	}
	/**
	 *           12
	 *          /  \
	 *        10    30
	 *       /     /  \
	 *            25   40
	 */

}
