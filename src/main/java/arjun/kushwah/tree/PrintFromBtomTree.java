package arjun.kushwah.tree;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PrintFromBtomTree {
	static int l=0;
	private static List<Pair> printUtill(List<Pair> list) {
		if(list.size()==0 || list==null) {
			return list;
		}
		if(list.size()!=0) {
			for(Pair p:list) {
				if(p.first==l) {
					list.remove(p);
					System.out.print(p.second+",");
				}
			}
		}	
		return list;
	}
	public static void print(Node head) {
		List<Pair> listL;
		List<Pair> listR;
		listL=PrintFromBtomTreeUtil(head.left,2,null);
		listR=PrintFromBtomTreeUtil(head.right,2,null);
		while(!listL.isEmpty() || !listR.isEmpty() ) {
			if(!listL.isEmpty()) {
				listL=printUtill(listL);
			}
			if( !listR.isEmpty()) {
				listR=printUtill(listR);
			}
			l--;
			
		}
		
		System.out.println(head.data);
		
	}
	private static List<Pair> PrintFromBtomTreeUtil(Node node, int level,List<Pair> list) {
		if(list==null) {
		list=new CopyOnWriteArrayList<Pair>();
		}
		if(node!=null) {
			if(l<level) {
				l=level;
			}
			list.add(new Pair(level,node.data));
			PrintFromBtomTreeUtil(node.left,level+1,list);
			PrintFromBtomTreeUtil(node.right,level+1,list);
		}
		
		return list;
	}
	public static void printInOrder(Node head) {
		if(head!=null) {
			System.out.print(head.data);
			printInOrder(head.left);
			printInOrder(head.right);
		}
	}
	
	public static void main(String args[]) {
		/**
		 *         								  1
                                              /        \
                                           2---------------3
                                        /     \         /      \
                                     4----------------------------5
                                  /     \                      /     \
                               6   --------7----------------8-----------9
                            /    \                                    /    \
                            -------10---- -----------------------------------11
                                 /   \                                      /  \
                      ---------12------------------------------------------13-------

12,13,10,11,6, 7,8,9,4,5,2,3,1
		 */
		Node head=new Node();
		head=Node.newNode(1);
		head.left=Node.newNode(2);
		head.right=Node.newNode(3);
		head.left.left=Node.newNode(4);
		head.right.right=Node.newNode(5);
		head.left.left.left=Node.newNode(6);
		head.left.left.right=Node.newNode(7);
		head.right.right.left=Node.newNode(8);
		head.right.right.right=Node.newNode(9);
		head.left.left.left.right=Node.newNode(10);
		head.right.right.right.right=Node.newNode(11);
		head.left.left.left.right.left=Node.newNode(12);
		head.right.right.right.right.left=Node.newNode(13);
		print(head);
	}

}
