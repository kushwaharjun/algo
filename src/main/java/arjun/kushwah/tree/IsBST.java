package arjun.kushwah.tree;

public class IsBST {
	class Node {
		Node left;
		Node right;
		int data;
	}
	Node prev=null;
	boolean isBST(Node root) {
		if(!isBST(root.left)) {
			return false;
		}
		if(prev!=null && root.data<prev.data) {
			return false;
		}
		prev=root;
		return isBST(root.right);
	}

	public static void main(String[] args) {

	}

}
