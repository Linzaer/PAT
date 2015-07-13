package BASE;

import java.util.Scanner;

public class Ñ­»·_04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {

			int a = scanner.nextInt();
			for (int i = 2; i <= a / 2; i++) {
				if (isPrime(i) && isPrime(a - i)) {
					System.out.printf("%d = %d + %d", a, i, a - i);
					break;
				}
			}
		}

	}

	public static boolean isPrime(int k) {
		boolean flag = true;
		for (int j = 2; j <= Math.sqrt(k); j++) {

			if (k % j == 0) {
				flag = false;
				break;
			}

		}

		return flag;
	}
}
