package BASE;

import java.util.Scanner;

public class Ñ­»·_25 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		while (true) {
			int n = scanner.nextInt();
			for (double i = 1, j = 1; i <= n; i++, j += 2) {
				sum +=1/j;
			}

			System.out.printf("sum = %.6f", sum);
		}

	}
}