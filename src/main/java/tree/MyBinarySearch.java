package arjun.kushwah.tree;

public class MyBinarySearch {
	public int seachBinary(int a[],int x) {
		int start=0, end=a.length-1;
		for(int i=0;i<=end;i++) {
			int mid=(start+end)/2;
			System.out.println(start+" : "+end +" :"+mid);
			if(a[mid]==x) {
				return mid;
			}else if(x<a[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
public static void main(String arg[]) {
	int[] a= {2,4,6,7,8,15,20,24};
	if(!(new MyBinarySearch().seachBinary(a, 15)==-1))
		System.out.println(new MyBinarySearch().seachBinary(a, 15));
	else
		System.out.println("15 is not vailable in array");
}
}
