package arjun.kushwah.array;

public class MaxSumArray {

	private static int maxSumArray(int[] arr) {
		int result = arr[0];
		int sum[] = new int[arr.length];
		sum[0] = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum[i] = Math.max(arr[i], sum[i - 1] + arr[i]);
			result = Math.max(result, sum[i]);
		}
		return result;
	}
	/**
	 * The time complexity and space complexity are the same O(n). However, 
	 * we can improve the space complexity and make it to be O(1).
	 */
	private static int MaxSumArryWithMinSpace(int[] arr) {
		int result=arr[0];
		int sum=arr[0];
		for(int i=0;i<arr.length;i++) {
			sum=Math.max(arr[i], sum+arr[i]);
			result=Math.max(result, sum);
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = new int[5];
		System.out.println(maxSumArray(arr));
		System.out.println(MaxSumArryWithMinSpace(arr));

	}
}
