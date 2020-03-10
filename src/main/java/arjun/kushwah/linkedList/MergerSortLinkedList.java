package arjun.kushwah.linkedList;

public class MergerSortLinkedList {
	Node head = null;
	 class Node {
		Node next;
		int data;

		Node(int item) {
			data = item;
		}
	}

     void push(int new_data) 
    { 
        /* allocate node */
        Node new_node = new Node(new_data); 
  
        /* link the old list off the new node */
        new_node.next = head; 
  
        /* move the head to point to the new node */
        head = new_node; 
    } 

	Node sortList(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node mid = getMiddleNode(head);
		Node nextOfMiddle=mid.next;
		mid.next=null;
		Node left=sortList(head);
		Node right=sortList(nextOfMiddle);
		return sortedMerge(left,right);
	}

	private Node sortedMerge(Node left, Node right) {
		Node result=null;
		if(left==null) {
			return right;
		}
		if(right==null) {
			return left;
		}
		if(left.data<right.data) {
			result=left;
			left.next=sortedMerge(left.next,right);
		}else {
			result=right;
			right.next=sortedMerge(right.next,left );
		}
			
		return right;
	}

	private Node getMiddleNode(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {

	}

}
