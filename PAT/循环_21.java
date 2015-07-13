package BASE;

import java.util.Scanner;

public class Ñ­»·_21 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		double sum = 0;
		for (double i = 1, j = 1; i <= n; i++, j += 2) {
			if (i % 2 != 0) {
				sum += i / j;
			} else {
				sum -= i / j;
			}
		}
		System.out.printf("%.3f", sum);

	}
}