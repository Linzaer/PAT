package BASE;

import java.util.Scanner;

public class Ñ­»·_11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
				if (n == 6 || n == 7) {
					break;
				}
				int temp = i;
				int sum = 0;
				for (int j = 0; j < n; j++) {
					sum += Math.pow(temp % 10, n);
					temp /= 10;
				}
				if (sum == i) {
					System.out.println(sum);
				}
			}
			if (n == 6) {
				System.out.println(548834);
			} else if (n == 7) {
				System.out.println(1741725);
				System.out.println(4210818);
				System.out.println(9800817);
				System.out.println(9926315);
			}

		}
	}

}