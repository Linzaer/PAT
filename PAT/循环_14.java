package BASE;

import java.util.Scanner;

public class Ñ­»·_14 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int g = getMaxNumber(a, b);
			System.out.printf("%d %d", g, a / g * b);

		}

	}

	public static int getMaxNumber(int a, int b) {
		int min = a;
		int g = 0;
		if (b < a) {
			min = b;
		}
		for (int i = min; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				g = i;
				break;
			}
		}

		return g;
	}
}