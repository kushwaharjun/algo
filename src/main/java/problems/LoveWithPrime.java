package problems;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class LoveWithPrime {
	static Map<Long,Long> map=new Hashtable();
	public static void checkLovePrime(long num) {
		getPrime();
		if(map.containsKey(num)) {
			System.out.println("Deepa");
		}
		long first,second,count=1;
		boolean isLove=false;
		for(int i=0;i<num/2;i++) {
			first=++count;
			second=num-first;
			if(map.containsKey(first) && map.containsKey(second) ) {
				isLove=true;
				break;
			}
		}
		if(isLove)
			System.out.println("Deepa");
		else
			System.out.println("Arjit");
	}
	public static void getPrime() {
		for(long i=2;i<10;i++) {
			boolean isprime=false;
			for(int j=2;j<(Math.sqrt(i)+1);j++) {
				if(i%j==0) {
					isprime=true;
					break;
				}
			}
			if(!isprime || i==2) {
				map.put(i, i);
			}
		}
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long test = Long.parseLong(scanner.nextLine());
		for (int i = 0; i < test; i++) {
			checkLovePrime(Long.parseLong(scanner.nextLine()));
		}
	}
}
