package common_problems;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class AditionOfPrime {
	Map<Long, Long> map = new Hashtable<Long, Long>();
	Map<Long, Long> map1 = new Hashtable<Long, Long>();

	public void checkPrime(long num) {
		long number = 0;
		long count = 1;
		long i = 2;

		for (Entry<Long, Long> m : map.entrySet()) {
			if (m.getKey() < num) {
				number = m.getValue();
				count = m.getKey() + 1;
				if (map1.containsKey(m.getKey())) {
					i = map1.get(m.getKey());
				}
				break;
			}
		}

		for (; count <= num; i++) {
			boolean isPrime = false;
			for (int j = 2; j < (Math.sqrt(i) + 1); j++) {
				if (i % j == 0) {
					isPrime = true;
					break;
				}

			}
			if (!isPrime || i == 2) {
				count++;
				number += i;
			}
		}
		map.put(num, number);
		map1.put(num, i);
		System.out.println(number);
	}

	public static void main(String args[]) throws Exception {
		AditionOfPrime aditionOfPrime=new AditionOfPrime();
		for (int i = 0; i < 4; i++) {
			aditionOfPrime.checkPrime(5 + i);
		}
	}
}
