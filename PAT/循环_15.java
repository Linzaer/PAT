package BASE;

import java.util.Scanner;

public class Ñ­»·_15 {

	private static int number = 0;
	private static int sum = 0;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			for (int i = a; i <= b; i++) {
				if (isPrime(i)) {
					number++;
					sum += i;
				}
			}
			System.out.println(number + " " + sum);
		}

	}

	public static boolean isPrime(int k) {
		boolean flag = true;
		if (k == 1) {
			return false;
		}
		for (int j = 2; j <= Math.sqrt(k); j++) {

			if (k % j == 0) {
				flag = false;
				break;
			}

		}

		return flag;
	}

}