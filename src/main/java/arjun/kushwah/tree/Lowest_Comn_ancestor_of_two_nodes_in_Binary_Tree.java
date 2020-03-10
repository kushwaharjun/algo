package arjun.kushwah.tree;

public class Lowest_Comn_ancestor_of_two_nodes_in_Binary_Tree extends Node{
    static Node getCommonAncestor(Node root,int a,int b) {
    	if(root==null) {
    		return root;
    	}
    	if(root.data==a || root.data==b) {
    		return root;
    	}
    	Node left=getCommonAncestor(root.left,a,b);
    	Node right=getCommonAncestor(root.right,a,b);
    	if(left!=null && right!=null) {
    		return root;
    	}else {
    		return left!=null?left:right;
    	}
    }
    // Another approach this will work if both a and b available 
    Node LCA(Node root,int a,int b) {
    	while(root!=null) {
    		if(root.data>a && root.data>b) {
    			root=root.left;
    		}else if(root.data<a && root.data<b) {
    			root=root.right;
    		}else {
    			break;
    		}
    	}
    	return root;
    }
	public static void main(String[] args) {
		Node tree = newNode(1);
		tree.left = newNode(2);
		tree.right = newNode(3);
		tree.left.left = newNode(4);
		tree.right.left = newNode(5);
		tree.right.left.right=newNode(6);
		Node d=getCommonAncestor(tree, 5, 6);
		System.out.println(d.data);

		/**
		 	/**
	 *   12 
	 *  / \ 
	 *10 30 
	 *   / \ 
	    25 40
	    
	 1           
   /   \
  2     3        
 /     /
4     5
       \
        6
	 */
		 
	}

}
