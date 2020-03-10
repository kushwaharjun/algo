package arjun.kushwah.array;

/**
 * 
 * @author Arjun
 *
 *Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Example 1:

Input: [1,3,4,2,2]
Output: 2
Example 2:

Input: [3,1,3,4,2]
Output: 3
Note:

You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
 */
// https://www.youtube.com/watch?v=XSdr_O-XVRQ
public class FirstDublicateInArray {
	int firstDublicate(int []arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[Math.abs(arr[i])-1]<0) {
				return Math.abs(arr[i]);
			}else {
				arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
