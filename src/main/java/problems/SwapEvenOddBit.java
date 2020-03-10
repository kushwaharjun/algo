package problems;

public class SwapEvenOddBit {
	public static void main(String args[]) {
		int x=43;
		int odd=(x&0xAAAAAAAA)>>1;
		int even=(x&0x55555555)<<1;
		System.out.println(odd|even);
	}

}
