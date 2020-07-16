package arjun.kushwah.tree;

public class Min_Heap_Sort_Binary {
	/**
	  Example : 12,7,6,10,8,20
	 (1) 12  (12)	, (2) |12|7| 12       (3)    |7|12|      7
	                            /                           /
	                           7                          12
	  (4) 7,12,6    7            6     6,12,7  (5)             6
	               / \    =>    / \                6,12,7,10  / \
	             12   6        12  7                         12  7
	                                                        /
	                                                       10
	  (6) 6,10,7,12     6     (7)6,10,7,12,8       6 
	                   / \                        / \        
	                  10  7                      10  7
	                 /                           / \
	                12                          12  8
	 
	 (8)6,8,7,12,10   (9)6,8,7,12,10,20
	       6                  6
	      / \               /   \
	     8   7              8     7    => complet min heap
	    / \               / \   /
	   12 10             12 10 20
	*/
	
	private int theHeap[];
	private int capacity;
	private int position;
	public Min_Heap_Sort_Binary() {
		position=1;
		capacity=10;
		theHeap=new int[capacity];
	}
	public void insert(int item) {
		if(position==capacity) {
			//increase the array size
		}else {
			theHeap[position++]=item;
			int child =position-1;
			int parent=child/2;
			while(theHeap[parent]>theHeap[child] && parent>0) {
				int temp=theHeap[parent];
				theHeap[parent]=theHeap[child];
				theHeap[child]=temp;
				child=parent;
				parent=child/2;
			}
		}
	}
	public void printMinHeap() {
		 for(int i=1;i<position;i++) {
			 System.out.println(theHeap[i]+" ");
		 }
	}

	public static void main(String[] args) {
		Min_Heap_Sort_Binary min_heap=new Min_Heap_Sort_Binary();
		min_heap.insert(12);
		min_heap.insert(7);
		min_heap.insert(6);
		min_heap.insert(10);
		min_heap.insert(8);
		min_heap.insert(20);
		min_heap.printMinHeap();

	}

}
