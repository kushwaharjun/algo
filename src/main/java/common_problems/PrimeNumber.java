package common_problems;

public class PrimeNumber {
	public void checkPrime(long num) {
		boolean isPrime = false;
		for (int i = 2; i < (Math.sqrt(num) + 1); i++) {
			if (num % i == 0) {
				System.out.println(num + " : " + "module :" + (Math.sqrt(num) + 1));
				isPrime = true;
				break;
			}

		}
		if (!isPrime || num == 2) {
			System.out.println(num + " : " + "prime");
		} else {
			System.out.println(num + " : " + "composite");
		}

	}

	public static void main(String args[]) throws Exception {
		new PrimeNumber().checkPrime(2L);
	}
}
