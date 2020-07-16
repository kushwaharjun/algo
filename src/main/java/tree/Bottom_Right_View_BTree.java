package arjun.kushwah.tree;

import java.util.Map;
import java.util.TreeMap;

public class Bottom_Right_View_BTree extends Node {

	public static void bottmRightView(Node root) {
		rightViewUtil(root, 1);
	}

	static Map<Integer, Pair> map = new TreeMap<Integer, Pair>();

	public static void rightViewUtil(Node root, int level) {
				if (root == null) {
					return;
				}
				if(map.get(level)==null) {
					map.put(level, new Pair(level,root.data));
				}else {
					Pair p=map.get(level);
					p.second=root.data;
					map.put(level, p);
				}
				rightViewUtil(root.left, level + 1);
				rightViewUtil(root.right, level);
				
			}

	public static void main(String[] args) {
		Node tree = newNode(1);
		tree.left = newNode(2);
		tree.right = newNode(3);
		tree.left.left = newNode(4);
		tree.right.left = newNode(5);
		tree.right.left.right=newNode(6);
		bottmRightView(tree);
		for(Map.Entry<Integer, Pair> entry:map.entrySet()) {
			System.out.println(entry.getValue().second);
		}
	}
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
