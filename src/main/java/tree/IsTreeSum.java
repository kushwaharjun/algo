package tree;

import java.util.HashSet;
import java.util.Set;

public class IsTreeSum {
	public static class Node {
		int val;
		Node left;
		Node right;

		Node() {
		}

		public Node(int val) {
			this.val = val;
		}
	}

	public static boolean findTarget(Node root, int sum) {
		Set<Integer> set = new HashSet();
		return find(root, sum, set);
	}

	public static boolean find(Node root, int sum, Set<Integer> set) {
		if (root == null)
			return false;
		if (set.contains(sum - root.val))
			return true;
		set.add(root.val);
		return find(root.left, sum, set) || find(root.right, sum, set);
	}

	public static void main(String args[]) {
		Node n = new Node(10);
		n.left = new Node(6);
		n.left.left = new Node(4);
		n.left.right = new Node(8);
		n.right = new Node(12);
		n.right.right = new Node(14);
		boolean b = findTarget(n, 16);
		System.out.println(b);

	}
}
