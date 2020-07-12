package arjun.kushwah.array;

public class PrintSpiralMatrix {
	static void spiralOrder(int arr[][]) {

		int T, B, L, R, dir;
		T = 0;
		B = arr.length - 1;
		L = 0;
		R = arr[0].length - 1;
		dir = 0;
		int i;

		while (T <= B && L <= R) {
			if (dir == 0) {
				for (i = L; i <= R; i++)
					System.out.print(arr[T][i]+",");
				T++;
			} else if (dir == 1) {
				for (i = T; i <= B; i++)
					System.out.print(arr[i][R]+",");
				R--;
			} else if (dir == 2) {
				for (i = R; i >= L; i--)
					System.out.print(arr[B][i]+",");
				B--;
			} else if (dir == 3) {
				for (i = B; i >= T; i--)
					System.out.print(arr[i][L]+",");
				L++;
			}
			dir = (dir + 1) % 4;
		}
	}

	public static void main(String args[]) {
		int arr[][] = { { 1, 2, 3, 4, 5 }, 
						{ 6, 7, 8, 9, 7 }, 
						{ 4, 7, 1, 8, 0 }, 
						{ 9, 2, 6, 2, 4 } 
					  };
		spiralOrder(arr);

	}

}
/**
 * Top(T) -> |1 2 3 4 5| |6 7 8 9 7| |4 7 1 8 0| bot(B) -> |9 2 6 2 4| ^ ^ | |
 * 
 * Left(L) right(R)
 */