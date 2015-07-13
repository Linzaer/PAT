package BASE;

import java.util.Scanner;

public class Ñ­»·_10 {

	private static double sum;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			double a = 2, b = 1, temp;
			int n = scanner.nextInt();
			for (int i = 0; i < n; i++) {
				sum += a / b;
				temp = b;
				b =a;
				a = temp + a;
			}
			System.out.printf("%.2f",sum);

		}
	}

}