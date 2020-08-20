package tree;



public class FindKthElement {
		static class Node{
			int data;
			Node left;
			Node right;
			public Node(int data) {
				this.data=data;
				left=right=null;
			}
			Node newNode(int data) {
				return new Node(data);
			}
		}
		static Node newNode(int data) {
			return new Node(data);
		}
		static class Pair{
			int a;
			int b;
			public Pair(int m,int n) {
				a=m;
				b=n;
			}
		}

		public static void findKthEle(Node root,int k) {
			Pair p=null;
			if(root==null)
				System.out.println("not available");
			else
			  p=findKthEleUtil(root,new Pair(0,0),k);
			
			if(p.a!=0) {
				System.out.println(p.a);
			}else
				System.out.println("not available");
			
		}

		public static Pair findKthEleUtil(Node root, Pair p,int k) {
			if(p.a==0 && root.left!=null) {
			p=	findKthEleUtil(root.left,p,k);
			}
			if(p.a==0 && p.b+1==k) {
				p.a=root.data;
				//System.out.println("p.b+1==k -");
			}else {
				p.b+=1;
			}
			if(p.a==0 && root.right!=null) {
				p=	findKthEleUtil(root.right,p,k);
			}
			
			return p;
		}

		public static void main(String[] args) {
			Node tree = newNode(12);
			tree.left = newNode(10);
			tree.right = newNode(30);
			tree.right.left = newNode(25);
			tree.right.right = newNode(40);
			findKthEle(tree,5);
		}
		/**
		 *           12
		 *          /  \
		 *        10    30
		 *       /     /  \
		 *            25   40
		 */

	}
