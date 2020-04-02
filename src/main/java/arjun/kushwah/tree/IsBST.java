package arjun.kushwah.tree;

public class IsBST {
	class Node {
		Node left;
		Node right;
		int data;
	}
	Node prev=null;
	boolean isBST(Node root) {
		if(root !=null){
			if(!isBST(root.left)) {
				return false;
			}
			
			if(prev!=null && root.data<prev.data) {
			return false;
			}
		prev=root;
			
		return isBST(root.right);
		}
		return true;
	}
		

	public static void main(String[] args) {

	}

}
