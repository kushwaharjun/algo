package arjun.kushwah.tree;

import java.util.Map;
import java.util.TreeMap;

public class PrintTopView {
	static class Node {
		int data;
		Node left;
		Node right;
	}

	static class Pair {
		int first;
		int second;

		public Pair(int a, int b) {
			first = a;
			second = b;
		}
	}

	public static Node newNode(int key) {
		Node n = new Node();
		n.data = key;
		n.left = n.right = null;
		return n;
	}
	static Map<Integer, Pair> m = new TreeMap<Integer, Pair>();
	public static void fillMap(Node root, int hd, int vd) {
		if(root==null) {
			return ;
		}
		if (m.get(hd) == null)
			m.put(hd, new Pair(root.data, vd));
		else if (m.get(hd).second > vd) {
			m.put(hd, new Pair(root.data, vd));
		}
		fillMap(root.left, hd - 1, vd + 1);
		fillMap(root.right, hd + 1, vd + 1);
	}
	public static void printTopView(Node root) {
		 
	    System.out.println("Following are nodes in" + 
	                     " top view of Binary Tree");
		if(root!=null) {
			fillMap(root,0,0);
			for(Map.Entry<Integer, Pair> entry:m.entrySet()) {
				System.out.println(entry.getValue().first+" ");
			}
		}
	}

	public static void main(String[] args) {
		Node root = newNode(1); 
	    root.left = newNode(2); 
	    root.right = newNode(3); 
	    root.left.right = newNode(4); 
	    root.left.right.right = newNode(5); 
	    root.left.right.right.right = newNode(6);
	   printTopView(root);
	   /* Create following Binary Tree  
     | 1 | 
   	 |/|\| 
     2 | 3  
     |\| |
     | 4 | 
       |\|  
       | 5  
         |\  
           6*/

	}

}
