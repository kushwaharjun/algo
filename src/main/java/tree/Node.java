package arjun.kushwah.tree;

public class Node {
	int data;
	Node left;
	Node right;
	public static Node newNode(int key) {
		Node n = new Node();
		n.data = key;
		n.left = n.right = null;
		return n;
	}
}
